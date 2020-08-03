package dao;


import java.util.*;

import entites.Customer;
import exceptions.CustomerNotFoundException;

public class CustomerDaoImpl implements CustomerDao {

	private Map<Integer, Customer> store = new HashMap<>();

	private int generatedId;

	private int generateId() {
		generatedId++;
		return generatedId;
	}

	public Customer findById(int id) {
		Customer customer = store.get(id);
		if (customer == null) {
			throw new CustomerNotFoundException("student not found for id=" + id);
		}
		return customer;
	}

	public List<Customer> findAll() {
		Collection<Customer> values = store.values();
		List<Customer> list = new ArrayList<>();
		for (Customer value : values) {
			list.add(value);
		}
		return list;
	}

	public void add(Customer customer) {
		int id = generateId();
		store.put(id, customer);
		customer.setId(id);
	}

	public Customer updateName(int id, String newName) {
		Customer customer = findById(id);
		customer.setName(newName);
		return customer;
	}

	public Customer update(Customer customer) {
		int id = customer.getId();
		store.put(id, customer);
		return customer;
	}

	public void delete(int id) {
		store.remove(id);
	}

}