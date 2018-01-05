package agenda;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import net.miginfocom.swing.MigLayout;

public class Janela extends JFrame implements ActionListener, Serializable {
	JButton btnRestore;
	JButton btnBackup;
	boolean flag = true;
	JButton btnExcluir;
	JButton btnSalvar;
	JButton btnNovoContato;
	JButton btnProx;
	JButton btnAnterior;
	JButton tglbtnEditarContato;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JFormattedTextField formattedTextField;
	JFormattedTextField formattedTextField_1;
	JFormattedTextField formattedTextField_2;
	static int i = 0;
	JButton btnCancelar;
	JButton btnAdicionarPessoa;
	JButton btnVisualizarContato;
	private ArrayList<Pessoa> contatos = new ArrayList();

	public ArrayList<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Pessoa> contatos) {
		this.contatos = contatos;
	}

	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 431);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new MigLayout("", "[5][][][grow]", "[5][][][grow]"));

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setSize(100, 414);
		getContentPane().add(desktopPane, "cell 0 2 4 2,grow");

		btnNovoContato = new JButton("Novo Contato");
		btnNovoContato.addActionListener(this);
		btnNovoContato.setBounds(170, 51, 217, 49);
		desktopPane.add(btnNovoContato);

		btnVisualizarContato = new JButton("Visualizar");
		btnVisualizarContato.setBounds(170, 135, 217, 49);
		desktopPane.add(btnVisualizarContato);
		btnVisualizarContato.addActionListener(this);

		btnBackup = new JButton("Backup dos contatos");
		btnBackup.setBounds(80, 228, 217, 49);
		desktopPane.add(btnBackup);
		btnBackup.addActionListener(this);

		btnRestore = new JButton("Restore dos contatos");
		btnRestore.setBounds(309, 228, 213, 49);
		desktopPane.add(btnRestore);
		btnRestore.addActionListener(this);

		JLabel lblContatos = new JLabel("Contatos");
		lblContatos.setForeground(Color.BLACK);
		lblContatos.setBounds(175, 9, 122, 29);
		desktopPane.add(lblContatos);

		JLabel lblBackuprestore = new JLabel("Backup/Restore");
		lblBackuprestore.setFont(new Font("Arial", Font.BOLD, 13));
		lblBackuprestore.setBounds(245, 199, 142, 29);
		desktopPane.add(lblBackuprestore);

	}

	public void visualizaContatoProx() {
		if (i < contatos.size()) {
			formattedTextField.setText(contatos.get(i).getNome() + "\r\n");
			formattedTextField_1.setText(contatos.get(i).getTelefone() + "\r\n");
			formattedTextField_2.setText(contatos.get(i).getEmail() + "\r\n");
			i++;
		}
	}

	public void visualizaContatoAnt() {
		if (i > 0) {
			i--;
			formattedTextField.setText(contatos.get(i).getNome() + "\r\n");
			formattedTextField_1.setText(contatos.get(i).getTelefone() + "\r\n");
			formattedTextField_2.setText(contatos.get(i).getEmail() + "\r\n");
		}
	}

	public String escolheArq() {
		int arq;
		String path = "";
		JFileChooser file = new JFileChooser("users.");
		file.setFileFilter(new FileNameExtensionFilter("Apenas .bkp", "bkp"));
		arq = file.showOpenDialog(null);
		if (arq == 0) {
			path = file.getSelectedFile().getAbsolutePath();
		}
		return path;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNovoContato) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 552, 376);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);

			JDesktopPane desktopPane = new JDesktopPane();
			contentPane.add(desktopPane, BorderLayout.CENTER);

			JLabel lblInformaesDoContato = new JLabel("Informa\u00E7\u00F5es do contato");
			lblInformaesDoContato.setFont(new Font("Arial", Font.BOLD, 20));
			lblInformaesDoContato.setBounds(143, 35, 246, 61);
			desktopPane.add(lblInformaesDoContato);

			JLabel lblNome = new JLabel("Nome:");
			lblNome.setFont(new Font("Arial", Font.BOLD, 13));
			lblNome.setBounds(38, 144, 73, 24);
			desktopPane.add(lblNome);

			JLabel lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Arial", Font.BOLD, 13));
			lblTelefone.setBounds(38, 194, 73, 24);
			desktopPane.add(lblTelefone);

			JLabel lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("Arial", Font.BOLD, 13));
			lblEmail.setBounds(38, 239, 94, 24);
			desktopPane.add(lblEmail);

			textField = new JTextField();
			textField.setBounds(181, 145, 159, 24);
			desktopPane.add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(181, 193, 159, 24);
			desktopPane.add(textField_1);
			textField_1.setColumns(10);

			textField_2 = new JTextField();
			textField_2.setBounds(181, 240, 159, 24);
			desktopPane.add(textField_2);
			textField_2.setColumns(10);
			btnAdicionarPessoa = new JButton("Adicionar");
			btnAdicionarPessoa.setBounds(38, 281, 97, 25);
			btnAdicionarPessoa.addActionListener(this);
			desktopPane.add(btnAdicionarPessoa);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(415, 281, 97, 25);
			btnCancelar.addActionListener(this);
			desktopPane.add(btnCancelar);

		} else if (e.getSource() == btnAdicionarPessoa) {
			Pessoa p = new Pessoa(textField.getText(), textField_1.getText(), textField_2.getText());
			contatos.add(p);
			JOptionPane.showMessageDialog(null, "Contato " + textField.getText() + " adicionado!");
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
		} else if (e.getSource() == btnCancelar) {
			getContentPane().removeAll();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 615, 431);
			getContentPane().setLayout(null);
			getContentPane().setLayout(new MigLayout("", "[5][][][grow]", "[5][][][grow]"));

			JDesktopPane desktopPane = new JDesktopPane();
			desktopPane.setSize(100, 414);
			getContentPane().add(desktopPane, "cell 0 2 4 2,grow");

			btnNovoContato = new JButton("Novo Contato");
			btnNovoContato.addActionListener(this);
			btnNovoContato.setBounds(170, 51, 217, 49);
			desktopPane.add(btnNovoContato);

			btnVisualizarContato = new JButton("Visualizar");
			btnVisualizarContato.setBounds(170, 135, 217, 49);
			desktopPane.add(btnVisualizarContato);
			btnVisualizarContato.addActionListener(this);

			btnBackup = new JButton("Backup dos contatos");
			btnBackup.setBounds(80, 228, 217, 49);
			desktopPane.add(btnBackup);
			btnBackup.addActionListener(this);

			btnRestore = new JButton("Restore dos contatos");
			btnRestore.setBounds(309, 228, 213, 49);
			desktopPane.add(btnRestore);
			btnRestore.addActionListener(this);

			JLabel lblContatos = new JLabel("Contatos");
			lblContatos.setForeground(Color.BLACK);
			lblContatos.setBounds(175, 9, 122, 29);
			desktopPane.add(lblContatos);

			JLabel lblBackuprestore = new JLabel("Backup/Restore");
			lblBackuprestore.setFont(new Font("Arial", Font.BOLD, 13));
			lblBackuprestore.setBounds(245, 199, 142, 29);
			desktopPane.add(lblBackuprestore);


		} else if (e.getSource() == btnVisualizarContato) {
			getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][]"));

			tglbtnEditarContato = new JButton("Editar Contato");
			getContentPane().add(tglbtnEditarContato, "cell 1 1");
			tglbtnEditarContato.addActionListener(this);

			btnExcluir = new JButton("Excluir");
			getContentPane().add(btnExcluir, "cell 1 1");
			btnExcluir.addActionListener(this);

			JLabel lblNome = new JLabel("Nome:");
			getContentPane().add(lblNome, "cell 0 2,alignx left");

			JLabel lblTelefone = new JLabel("Telefone:");
			getContentPane().add(lblTelefone, "cell 0 3,alignx trailing");

			JLabel lblEmail = new JLabel("Email:");
			getContentPane().add(lblEmail, "cell 0 4,alignx left");

			formattedTextField = new JFormattedTextField();
			getContentPane().add(formattedTextField, "cell 1 2,growx,aligny top");
			formattedTextField.setEditable(false);

			formattedTextField_1 = new JFormattedTextField();
			getContentPane().add(formattedTextField_1, "cell 1 3,growx");
			formattedTextField_1.setEditable(false);

			formattedTextField_2 = new JFormattedTextField();
			getContentPane().add(formattedTextField_2, "cell 1 4,growx");
			formattedTextField_2.setEditable(false);

			btnSalvar = new JButton("Salvar");
			getContentPane().add(btnSalvar, "cell 1 1");
			btnSalvar.addActionListener(this);

			visualizaContatoProx();
			setSize(400, 400);

			btnProx = new JButton("Proximo");
			btnProx.addActionListener(this);
			getContentPane().add(btnProx, "flowx,cell 1 6");

			btnAnterior = new JButton("Anterior");
			btnAnterior.addActionListener(this);
			getContentPane().add(btnAnterior, "cell 1 6");

			btnCancelar = new JButton("Voltar");
			getContentPane().add(btnCancelar, "cell 1 6");
			btnCancelar.addActionListener(this);

		} else if (e.getSource() == btnProx) {
			visualizaContatoProx();
		} else if (e.getSource() == btnAnterior) {
			visualizaContatoAnt();
		} else if (e.getSource() == tglbtnEditarContato) {
			formattedTextField.setEditable(true);
			formattedTextField_1.setEditable(true);
			formattedTextField_2.setEditable(true);
		} else if (e.getSource() == btnSalvar) {
			if (i != 0) {
				i--;
			}
			contatos.get(i).setNome(formattedTextField.getText());
			contatos.get(i).setTelefone(formattedTextField_1.getText());
			contatos.get(i).setEmail(formattedTextField_2.getText());
			formattedTextField.setEditable(false);
			formattedTextField_1.setEditable(false);
			formattedTextField_2.setEditable(false);
		} else if (e.getSource() == btnExcluir) {
			if (i != 0) {
				i--;
			}
			contatos.remove(i);
			if (i == 0) {
				visualizaContatoProx();
			} else {
				visualizaContatoAnt();
			}
			if (contatos.isEmpty()) {
				formattedTextField.setText("");
				formattedTextField_1.setText("");
				formattedTextField_2.setText("");
			}
		} else if (e.getSource() == btnBackup) {
			String path = escolheArq();
			try {
				FileOutputStream escreveDir;
				if(path.contains(".bkp"))
					escreveDir = new FileOutputStream(path);
				else
					escreveDir = new FileOutputStream(path + ".bkp");
				ObjectOutputStream escreveBin = new ObjectOutputStream(escreveDir);
				escreveBin.writeObject(contatos);
				escreveBin.close();
				if(path.contains(".bkp"))
					JOptionPane.showMessageDialog(null, "Contatos salvos no arquivo " + path);
				else
				JOptionPane.showMessageDialog(null, "Contatos salvos no arquivo " + path + ".bkp");
			} catch (Exception err) {
				JOptionPane.showMessageDialog(null, err);
			}
		} else if (e.getSource() == btnRestore) {
			String path = escolheArq();
			try {
				FileInputStream leDir = new FileInputStream(path);
				ObjectInputStream leBin = new ObjectInputStream(leDir);
				ArrayList<Pessoa> restore = (ArrayList<Pessoa>) leBin.readObject();
				leBin.close();
				contatos = restore;
				JOptionPane.showMessageDialog(null, "Contatos restaurados");
			} catch (Exception notFound) {
				JOptionPane.showMessageDialog(null, notFound);
			}
		}
	}
}
