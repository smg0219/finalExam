package kr.ac.jejunu.service;

import java.util.List;
import java.util.Map;

import kr.ac.jejunu.model.Product;

public interface ProductService {

	List<Map<String, String>> selectAllProduct(Map<String, String> qParam);

	void save(Product product);

	List<Map<String, String>> findById(Integer id);
}
