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
import javax.swing.SwingConstants;

import br.emerson.enuns.Estado;
import br.emerson.enuns.Genero;

public class CadClientes extends JPanel {
	private JTextField txtIdade;
	private JTextField txtNome;
	private JTextField txtEndereço;
	private JLabel lblSexo;
	private JComboBox cBoxEstado;
	private JComboBox cboxSexo;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JButton btnSalvar;
	private JButton btnSair;

	/**
	 * Create the panel.
	 */
	public CadClientes() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{76, 0, 27, 0, 0, 0, 0, 0, 89, 0, -34, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtIdade = new JTextField();
		GridBagConstraints gbc_txtIdade = new GridBagConstraints();
		gbc_txtIdade.anchor = GridBagConstraints.NORTH;
		gbc_txtIdade.gridwidth = 4;
		gbc_txtIdade.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdade.gridx = 1;
		gbc_txtIdade.gridy = 1;
		add(txtIdade, gbc_txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 8;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 2;
		add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		lblSexo = new JLabel("Sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 9;
		gbc_lblSexo.gridy = 2;
		add(lblSexo, gbc_lblSexo);
		
		cboxSexo = new JComboBox();
		GridBagConstraints gbc_cboxSexo = new GridBagConstraints();
		gbc_cboxSexo.gridwidth = 2;
		gbc_cboxSexo.insets = new Insets(0, 0, 5, 5);
		gbc_cboxSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxSexo.gridx = 10;
		gbc_cboxSexo.gridy = 2;
		add(cboxSexo, gbc_cboxSexo);
		

		cboxSexo.setModel((ComboBoxModel) new DefaultComboBoxModel(Genero.values()));
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtEndereço = new JTextField();
		GridBagConstraints gbc_txtEndereço = new GridBagConstraints();
		gbc_txtEndereço.gridwidth = 8;
		gbc_txtEndereço.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndereço.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndereço.gridx = 1;
		gbc_txtEndereço.gridy = 3;
		add(txtEndereço, gbc_txtEndereço);
		txtEndereço.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.EAST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.gridwidth = 8;
		gbc_txtCidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 4;
		add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estado");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 9;
		gbc_lblNewLabel_3.gridy = 4;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		cBoxEstado = new JComboBox();
		GridBagConstraints gbc_cBoxEstado = new GridBagConstraints();
		gbc_cBoxEstado.gridwidth = 3;
		gbc_cBoxEstado.insets = new Insets(0, 0, 5, 0);
		gbc_cBoxEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxEstado.gridx = 10;
		gbc_cBoxEstado.gridy = 4;
		add(cBoxEstado, gbc_cBoxEstado);

		
		cBoxEstado.setModel((ComboBoxModel) new DefaultComboBoxModel(Estado.values()));
		
		lblEmail = new JLabel("E-Mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 8;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 5;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 6;
		add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.gridwidth = 6;
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 6;
		add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 8;
		gbc_btnSalvar.gridy = 9;
		add(btnSalvar, gbc_btnSalvar);
		
		btnSair = new JButton("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 0, 5);
		gbc_btnSair.gridx = 11;
		gbc_btnSair.gridy = 9;
		add(btnSair, gbc_btnSair);

	}

}
