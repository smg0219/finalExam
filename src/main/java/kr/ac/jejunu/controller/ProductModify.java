package kr.ac.jejunu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/info")
public class ProductModify {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public Model info(@RequestParam(value = "id") Integer id, Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.findById(id);
		model.addAttribute("list", list);
		
		return model;
	}
}
