package kr.ac.jejunu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public void save(Product product) {
		productDao.insertProduct(product);
	}

	@Override
	public List<Map<String, String>> selectAllProduct(Map<String, String> qParam) {
		return productDao.selectAllProduct(qParam);
	}

	@Override
	public List<Map<String, String>> findById(Integer id) {
		return productDao.findById(id);
	}

	@Override
	public void modify(Product product) {
		productDao.modify(product);
	}

	@Override
	public void kart(String id) {
		productDao.insertKart(id);
	}

	@Override
	public void delete(String id) {
		productDao.deleteProduct(id);
	}
}
