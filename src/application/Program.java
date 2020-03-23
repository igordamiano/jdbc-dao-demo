package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Teste select findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n");
		System.out.println("=== Teste select findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n");
		System.out.println("=== Teste select findAll ===");
		List<Seller> listAll = sellerDao.findAll();
		
		for (Seller a : listAll) {
			System.out.println(a);
		}

		
		
	}

}
