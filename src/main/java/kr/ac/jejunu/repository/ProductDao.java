package kr.ac.jejunu.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {
	List<Map<String, String>> selectAllProduct(Map<String, String> qParam);
}
