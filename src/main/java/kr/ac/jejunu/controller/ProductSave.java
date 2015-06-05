package kr.ac.jejunu.controller;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")
public class ProductSave {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String save(Product product) {
		productService.save(product);
		
		return "redirect:index";
	}
}
