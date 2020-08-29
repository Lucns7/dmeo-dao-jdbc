package model.Dao;

import db.DB;
import model.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

}
