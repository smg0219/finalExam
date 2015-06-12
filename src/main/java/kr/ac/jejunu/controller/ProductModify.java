package kr.ac.jejunu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/modify")
public class ProductModify {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String modify(Product product) {

		productService.modify(product);
		
		return "redirect:info?id=" + product.getId();
	}
}
