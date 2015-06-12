package kr.ac.jejunu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.Kart;
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
	public void delete(String id) {
		productDao.deleteProduct(id);
	}

	@Override
	public Product productFindById(Integer id) {
		return productDao.productFindById(id);
	}

	@Override
	public void insertKart(Kart kart) {
		productDao.insertKart(kart);
	}

	@Override
	public List<Map<String, String>> selectKart(Map<String, String> qParam,
			Kart kart) {
		return productDao.selectKart(qParam, kart);
	}

	@Override
	public void deleteKartList(Integer id) {
		productDao.deleteKartList(id);
	}

	@Override
	public List<Map<String, String>> selectKartFindById(Map<String, String> qParam, Integer id) {
		return productDao.selectKartFindById(id);
	}
}
