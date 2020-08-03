package dao;

import java.util.List;

import entites.Customer;

public interface CustomerDao {
	Customer findById(int id);

	List<Customer> findAll() ;
	
	Customer updateName(int id, String newName);

	void add(Customer customer);
	
	Customer update(Customer customer);
	
	void delete(int id);

}
