package sinaumhs.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import sinau.mhs.model.MahasiswaModel;
import sinaumhs.dao.datasource.DatabaseDataSource;
import sinaumhs.dao.service.MahasiswaService;
import sinaumhs.view.MahasiswaView;

public class MahasiswaSaveActionListener implements ActionListener {

	private MahasiswaView mahasiswaView;
	
	public MahasiswaSaveActionListener(MahasiswaView mahasiswaView) {
		// TODO Auto-generated constructor stub
		this.mahasiswaView = mahasiswaView;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		DatabaseDataSource databaseDataSource = new DatabaseDataSource();
		MahasiswaService mahasiswaService = new MahasiswaService();
		mahasiswaService.setDataSource(databaseDataSource.getMysqlDataSource());
		
		boolean isUpdate;
		if("".equals(this.mahasiswaView.getTxtCari().getText())){
			isUpdate = false;
		}else{
			isUpdate = true;
		}
	MahasiswaModel m = new MahasiswaModel();
	m.setNik(mahasiswaView.getTxtNik().getText());
	m.setNama(mahasiswaView.getTxtNama().getText());
	m.setKelas(mahasiswaView.getTxtKelas().getText());
	m.setJurusan(mahasiswaView.getTxtJurusan().getText());
	
	mahasiswaService.saveOrUpdate(m, isUpdate);
	 
	if(isUpdate == false){
		JOptionPane.showMessageDialog(mahasiswaView, "data telah di tambah");
	}else{
		JOptionPane.showMessageDialog(mahasiswaView, "data di ubah");
	}
	}

}
