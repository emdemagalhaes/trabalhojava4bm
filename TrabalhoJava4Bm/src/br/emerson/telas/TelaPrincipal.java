package br.emerson.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mnNewMenu.add(mntmSair);

		JMenu mnNewMenu_1 = new JMenu("Produtos");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmCadatrar = new JMenuItem("Cadatrar");
		mntmCadatrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Runnable r = new Runnable() {
					@Override
					public void run() {
						CadClientes cadastro = new CadClientes();
					
						contentPane.add(cadastro);					
						cadastro.setVisible(true);
						
					}
				};

				Thread th = new Thread(r);
				th.start();
			}
		});
		mnNewMenu_1.add(mntmCadatrar);

		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmConsultar);

		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmAlterar);

		JMenuItem mntmDeletar = new JMenuItem("Deletar");
		mnNewMenu_1.add(mntmDeletar);

		JMenu mnNewMenu_2 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mnNewMenu_2.add(mntmCadastrar);

		JMenuItem mntmConsultar_1 = new JMenuItem("Consultar");
		mnNewMenu_2.add(mntmConsultar_1);

		JMenuItem mntmAlterar_1 = new JMenuItem("Alterar");
		mnNewMenu_2.add(mntmAlterar_1);

		JMenuItem mntmDeletar_1 = new JMenuItem("Deletar");
		mnNewMenu_2.add(mntmDeletar_1);

		JMenu mnNewMenu_3 = new JMenu("Vendas");
		menuBar.add(mnNewMenu_3);

		JMenu mnRelatorios = new JMenu("Relatorios");
		menuBar.add(mnRelatorios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
	}

}
