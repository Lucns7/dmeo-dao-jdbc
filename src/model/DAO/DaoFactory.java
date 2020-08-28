package model.Dao;

import model.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	}

}
