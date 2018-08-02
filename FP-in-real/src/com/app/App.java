package com.app;

import java.util.List;

import com.app.lib.DataStreamLib;
import com.app.model.Employee;
import com.app.model.Product;

public class App {

	public static void main(String[] args) {
		
		// data-in
		List<Employee> employees=Employee.randomlyGenerate(100);
		List<Product> products=Product.randomlyGenerate(100);

		
		List<Employee> filteredList=DataStreamLib.filter(employees, predicate);
		
		
	}
}
