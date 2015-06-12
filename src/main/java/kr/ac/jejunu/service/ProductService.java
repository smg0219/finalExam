package kr.ac.jejunu.service;

import java.util.List;
import java.util.Map;

import kr.ac.jejunu.model.Kart;
import kr.ac.jejunu.model.Product;

public interface ProductService {

	List<Map<String, String>> selectAllProduct(Map<String, String> qParam);

	void save(Product product);

	List<Map<String, String>> findById(Integer id);

	void modify(Product product);

	void delete(String id);

	Product productFindById(Integer id);

	void insertKart(Kart kart);

	List<Map<String, String>> selectKart(Map<String, String> qParam, Kart kart);
}
