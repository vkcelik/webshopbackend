package controller;

import presentation.RedigerSletKategori;
import presentation.TilføjKategori;
import data.dao.MySQLKategoriDAO;

public class KategoriController {

	TilføjKategori tilføj;
	RedigerSletKategori se;
	MySQLKategoriDAO kdao;

	public KategoriController(TilføjKategori tilføj, RedigerSletKategori se){
		this.tilføj = tilføj;
		this.se = se;
		this.kdao = new MySQLKategoriDAO();
		tilføj.setController(this);
		se.setController(this);
	}



}
