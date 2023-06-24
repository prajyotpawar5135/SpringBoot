package com.app.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Product;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE) 
@Rollback(false)
public class ProductTest {

	@Autowired
	private ProductRepository prodRepo;
	/*
	 * String productName, int productQuantity, double productPrice, String productDesc
	 */
	@Test
	void test()
	{
		List<Product> list=List.of(
				new Product("biscuit",32,200,"yummy"));
		List<Product>list2=prodRepo.saveAll(list);
	}
}
