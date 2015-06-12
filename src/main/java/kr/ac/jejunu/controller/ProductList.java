package kr.ac.jejunu.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.repository.ProductDao;
import kr.ac.jejunu.service.ProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class ProductList {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductList.class);

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/index")
	public Model productList(Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.selectAllProduct(qParam);
		model.addAttribute("list", list);
		
		return model;
	}

	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}

	@RequestMapping("/loginAfter")
	public Model loginAfter(Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.selectAllProduct(qParam);
		model.addAttribute("list", list);
		
		return model;
	}
	
	@RequestMapping("/loginAfterPersonal")
	public Model loginAfterPersonal(Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.selectAllProduct(qParam);
		model.addAttribute("list", list);
		
		return model;
	}
	
	@RequestMapping("/info")
	public Model info(@RequestParam(value = "id") Integer id, Model model) {
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.findById(id);
		model.addAttribute("list", list);
		
		return model;
	}
	
	@RequestMapping("/infoPersonal")
	public Model infoPersonal(@RequestParam(value = "id") Integer id, Model model) {
		
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
	
	@RequestMapping("/productDelete")
	public String productDelete(@RequestParam(value = "id") String id) {
		
		productService.delete(id);
		
		return "redirect:loginAfter";
	}
}
