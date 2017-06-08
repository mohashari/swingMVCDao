package sinaumhs.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sinaumhs.view.MahasiswaView;

public class MahasiswaAddComponen implements ActionListener {
	private MahasiswaView mahasiswaView;
	
	public MahasiswaAddComponen(MahasiswaView mahasiswaView) {
		// TODO Auto-generated constructor stub
		this.mahasiswaView = mahasiswaView;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void tambahComponen(){
		mahasiswaView.getTxtCari().setText("");
		mahasiswaView.getTxtCari().setEnabled(false);
		mahasiswaView.getBtnCari().setEnabled(false);
		mahasiswaView.getBtnReset().setEnabled(false);
		mahasiswaView.getBtnSave().setEnabled(false);
		mahasiswaView.getTxtNik().setEnabled(false);
		mahasiswaView.getTxtNama().setEnabled(false);
		mahasiswaView.getTxtKelas().setEnabled(false);
		mahasiswaView.getTxtJurusan().setEnabled(false);
	}
	

}
