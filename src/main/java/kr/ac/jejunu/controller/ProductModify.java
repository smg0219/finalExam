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

		System.out.println(product.getId());
		System.out.println(product.getPrice());
		System.out.println(product.getName());
		System.out.println(product.getAgent());
		System.out.println(product.getDescription());
		
		productService.modify(product);
		
		return "redirect:info?id=" + product.getId();
	}
	
	/*
	@RequestMapping("/info")
	public Model info(@RequestParam(value = "id") Integer id, Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.findById(id);
		model.addAttribute("list", list);
		
		return model;
	}

	@RequestMapping("/registrationModify")
	public Model modifyInfoView(@RequestParam(value = "id") Integer id, Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.findById(id);
		model.addAttribute("list", list);
		
		return model;
	}
	*/
}
