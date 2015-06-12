package kr.ac.jejunu.repository;

import java.util.List;
import java.util.Map;

import kr.ac.jejunu.model.Kart;
import kr.ac.jejunu.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {
	List<Map<String, String>> selectAllProduct(Map<String, String> qParam);
	void insertProduct(Product product);
	List<Map<String, String>> findById(Integer id);
	void modify(Product product);
	void insertKart(String id);
	void deleteProduct(String id);
	Product productFindById(Integer id);
	void insertKart(Kart kart);
	List<Map<String, String>> selectKart(Map<String, String> qParam, Kart kart);
	void deleteKartList(Integer id);
	List<Map<String, String>> selectKartFindById(Integer id);
}
