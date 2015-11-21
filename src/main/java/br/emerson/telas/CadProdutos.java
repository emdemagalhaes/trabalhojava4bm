package br.emerson.telas;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import br.emerson.enuns.Categoria;
import br.emerson.enuns.Estado;
import br.emerson.enuns.Unidade;

public class CadProdutos extends JPanel {
	private JTextField txtId;
	private JTextField txtCodBarras;
	private JTextField txtDescricao;
	private JTextField txtCusto;
	private JTextField txtLucro;

	/**
	 * Create the panel.
	 */
	public CadProdutos() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 103, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.anchor = GridBagConstraints.WEST;
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 0;
		add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cod. Barras");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtCodBarras = new JTextField();
		GridBagConstraints gbc_txtCodBarras = new GridBagConstraints();
		gbc_txtCodBarras.insets = new Insets(0, 0, 5, 5);
		gbc_txtCodBarras.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodBarras.gridx = 1;
		gbc_txtCodBarras.gridy = 1;
		add(txtCodBarras, gbc_txtCodBarras);
		txtCodBarras.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox cBoxCategoria = new JComboBox();
		GridBagConstraints gbc_cBoxCategoria = new GridBagConstraints();
		gbc_cBoxCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_cBoxCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxCategoria.gridx = 1;
		gbc_cBoxCategoria.gridy = 2;
		add(cBoxCategoria, gbc_cBoxCategoria);
		
		cBoxCategoria.setModel((ComboBoxModel) new DefaultComboBoxModel(Categoria.values()));
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtDescricao = new JTextField();
		GridBagConstraints gbc_txtDescricao = new GridBagConstraints();
		gbc_txtDescricao.gridwidth = 3;
		gbc_txtDescricao.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescricao.gridx = 1;
		gbc_txtDescricao.gridy = 3;
		add(txtDescricao, gbc_txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblUnidade = new JLabel("Unidade");
		GridBagConstraints gbc_lblUnidade = new GridBagConstraints();
		gbc_lblUnidade.anchor = GridBagConstraints.EAST;
		gbc_lblUnidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnidade.gridx = 0;
		gbc_lblUnidade.gridy = 4;
		add(lblUnidade, gbc_lblUnidade);
		
		JComboBox cBoxUnidade = new JComboBox();
		GridBagConstraints gbc_cBoxUnidade = new GridBagConstraints();
		gbc_cBoxUnidade.insets = new Insets(0, 0, 5, 5);
		gbc_cBoxUnidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxUnidade.gridx = 1;
		gbc_cBoxUnidade.gridy = 4;
		add(cBoxUnidade, gbc_cBoxUnidade);
		
		cBoxUnidade.setModel((ComboBoxModel) new DefaultComboBoxModel(Unidade.values()));
		
		JLabel lblCusto = new JLabel("Custo");
		GridBagConstraints gbc_lblCusto = new GridBagConstraints();
		gbc_lblCusto.anchor = GridBagConstraints.EAST;
		gbc_lblCusto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCusto.gridx = 0;
		gbc_lblCusto.gridy = 5;
		add(lblCusto, gbc_lblCusto);
		
		txtCusto = new JTextField();
		GridBagConstraints gbc_txtCusto = new GridBagConstraints();
		gbc_txtCusto.insets = new Insets(0, 0, 5, 5);
		gbc_txtCusto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCusto.gridx = 1;
		gbc_txtCusto.gridy = 5;
		add(txtCusto, gbc_txtCusto);
		txtCusto.setColumns(10);
		
		JLabel lblLucro = new JLabel("Lucro");
		GridBagConstraints gbc_lblLucro = new GridBagConstraints();
		gbc_lblLucro.anchor = GridBagConstraints.EAST;
		gbc_lblLucro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLucro.gridx = 0;
		gbc_lblLucro.gridy = 6;
		add(lblLucro, gbc_lblLucro);
		
		txtLucro = new JTextField();
		GridBagConstraints gbc_txtLucro = new GridBagConstraints();
		gbc_txtLucro.insets = new Insets(0, 0, 5, 5);
		gbc_txtLucro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLucro.gridx = 1;
		gbc_txtLucro.gridy = 6;
		add(txtLucro, gbc_txtLucro);
		txtLucro.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 8;
		add(btnSalvar, gbc_btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 8;
		add(btnCancelar, gbc_btnCancelar);
		
		

	}

}
