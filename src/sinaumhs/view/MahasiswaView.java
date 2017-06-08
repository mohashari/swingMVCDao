package sinaumhs.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;

public class MahasiswaView extends JFrame {
	public JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtNik;
	private JTextField txtKelas;
	private JTextField txtJurusan;
	private JTextField txtCari;
	private JButton btnCari;
	private JButton btnSave;
	private JButton btnReset;
	 	
	public JButton getBtnCari() {
		return btnCari;
	}


	public void setBtnCari(JButton btnCari) {
		this.btnCari = btnCari;
	}


	public JButton getBtnSave() {
		return btnSave;
	}


	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}


	public JButton getBtnReset() {
		return btnReset;
	}


	public void setBtnReset(JButton btnReset) {
		this.btnReset = btnReset;
	}


	public JTextField getTxtCari() {
		return txtCari;
	}


	public void setTxtCari(JTextField txtCari) {
		this.txtCari = txtCari;
	}


	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JTextField getTxtNama() {
		return txtNama;
	}


	public void setTxtNama(JTextField txtNama) {
		this.txtNama = txtNama;
	}


	public JTextField getTxtNik() {
		return txtNik;
	}


	public void setTxtNik(JTextField txtNik) {
		this.txtNik = txtNik;
	}


	public JTextField getTxtKelas() {
		return txtKelas;
	}


	public void setTxtKelas(JTextField txtKelas) {
		this.txtKelas = txtKelas;
	}


	public JTextField getTxtJurusan() {
		return txtJurusan;
	}


	public void setTxtJurusan(JTextField txtJurusan) {
		this.txtJurusan = txtJurusan;
	}


	public MahasiswaView() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INPUT DATA MAHASISWA");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel.setBounds(38, 12, 303, 38);
		contentPane.add(lblNewLabel);
		
		txtNama = new JTextField();
		txtNama.setBounds(125, 94, 114, 19);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setBounds(12, 96, 70, 15);
		contentPane.add(lblNama);
		
		txtNik = new JTextField();
		txtNik.setColumns(10);
		txtNik.setBounds(125, 60, 114, 19);
		contentPane.add(txtNik);
		
		JLabel label = new JLabel("KELAS");
		label.setBounds(12, 133, 70, 15);
		contentPane.add(label);
		
		JLabel lblNik = new JLabel("NIK");
		lblNik.setBounds(12, 62, 70, 15);
		contentPane.add(lblNik);
		
		txtKelas = new JTextField();
		txtKelas.setColumns(10);
		txtKelas.setBounds(125, 131, 114, 19);
		contentPane.add(txtKelas);
		
		txtJurusan = new JTextField();
		txtJurusan.setColumns(10);
		txtJurusan.setBounds(125, 173, 114, 19);
		contentPane.add(txtJurusan);
		
		JLabel lblJurusan = new JLabel("JURUSAN");
		lblJurusan.setBounds(12, 175, 70, 15);
		contentPane.add(lblJurusan);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(25, 224, 117, 25);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(203, 224, 117, 25);
		contentPane.add(btnReset);
		
		txtCari = new JTextField();
		txtCari.setBounds(306, 42, 114, 19);
		contentPane.add(txtCari);
		txtCari.setColumns(10);
		
		JButton btnCari = new JButton("CARI");
		btnCari.setBounds(303, 86, 117, 25);
		contentPane.add(btnCari);

	
	}
}
