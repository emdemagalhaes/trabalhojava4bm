package br.emerson.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.emerson.cadastros.Cliente;
import br.emerson.cadastros.Endereco;
import br.emerson.cadastros.Produtos;

public class ClienteDAO {

	private Connection con;
	private PreparedStatement pstmt = null;
	private String sql;
	private ResultSet rs;

	public Integer insereEndereco(Endereco endereco) {
		try {
			con = Conexao.conectar();
			sql = "insert into endereco(endereco, cidade, estado) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, endereco.getEndereco());
			pstmt.setString(3, endereco.getCidade());
			pstmt.setString(4, endereco.getEstado());
			pstmt.execute();
			// recuperando o id gerado pelo banco
			sql = "select id from endereco where endereco=? and cidade=? and estado=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, endereco.getEndereco());
			pstmt.setString(3, endereco.getCidade());
			pstmt.setString(4, endereco.getEstado());
			rs = pstmt.executeQuery();
			// ou pegar a última ocorrência com um while
			// ou pesquisar se o endereço já cadastrado antes de inserir
			Integer id = null;
			while (rs.next()) {
				if (rs.isLast()) {
					id = rs.getInt(1);
				}
			}
			return id;
		} catch (SQLException ex) {
			Logger.getLogger(Endereco.class.getName()).log(Level.SEVERE, null,
					ex);
			return null;
		} finally {
			desconectar();
		}
	}

	public String inserir(Cliente cliente) {
		Integer id = null;
		try {
			if (cliente.getEndereco().getEndereco() != null) {
				id = insereEndereco(cliente.getEndereco());
			}
			con = Conexao.conectar();
			sql = "insert into contato(nome, dataNascimento, email, cpf, telefone, "
					+ "celular, endereco, foto) values (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cliente.getNome());
			pstmt.setString(2, cliente.getEmail());
			pstmt.setInt(3, cliente.getEndereco().getId());

			if (id != null) {
				pstmt.setInt(7, id);
			}

			pstmt.execute();
			return "Contato cadastrado com sucesso";
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
			return null;
		} finally {
			desconectar();
		}
	}

	public String inserir2(Cliente cliente) {
		try {
			con = Conexao.conectar();
			sql = "insert into contato(nome, dataNascimento, email) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cliente.getNome());

			pstmt.setString(3, cliente.getEmail());

			pstmt.execute();
			return "Contato cadastrado com sucesso";
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
			return null;
		} finally {
			desconectar();
		}
	}

	public List<Cliente> listar() {
		try {
			EnderecoDAO enderecoDAO = new EnderecoDAO();
			con = Conexao.conectar();
			sql = "select * from cliente";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Cliente> contatos = new ArrayList<>();
			while (rs.next()) {
				Cliente contato = new Cliente();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEndereco(enderecoDAO.getEndereco(rs
						.getInt("endereco")));
				contatos.add(contato);
			}
			return contatos;
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
			return null;
		} finally {
			desconectar();
		}
	}

	public String atualizar(Cliente Cliente) {
		try {
			Integer id = Cliente.getId();
			con = Conexao.conectar();
			sql = "update contato set nome=?, dataNascimento =?, email=?, cpf=?, telefone=?, "
					+ "celular=?, foto=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Cliente.getNome());
			pstmt.setString(3, Cliente.getEmail());
			pstmt.setString(5, Cliente.getTelefone());
			pstmt.setInt(8, id);
			pstmt.executeUpdate();

			Integer id2 = Cliente.getEndereco().getId();
			sql = "update endereco set rua=?, numero=?, cidade=?, estado=? where id=?";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(3, Cliente.getEndereco().getCidade());
			pstmt.setString(4, Cliente.getEndereco().getEstado());
			pstmt.setInt(5, id2);
			pstmt.executeUpdate();

			return "listaFotos";
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			desconectar();
		}
		return "Problemas com a atualização do contato";
	}

	public String excluir(Integer id) {
		try {
			con = Conexao.conectar();
			sql = "delete from contato where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			if (pstmt.execute()) {
				return "Contato deletado com sucesso";
			} else {
				return "Problemas com a deleção";
			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			desconectar();
		}
		return "Problemas";
	}

	private void desconectar() {
		try {
			con.close();
			pstmt.close();
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}
}
