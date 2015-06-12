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
	
	/*
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping
	public Model productList(Model model) {
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productDao.selectAllProduct(qParam);
		model.addAttribute("list", list);
		
		return model;
	}

	@RequestMapping(value = "/loginAfter", method = RequestMethod.GET)
	public String loginAfter() {
		return "loginAfter";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registartion() {
		return "registration";
		
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm2";
	}
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.GET)
	public String insertProduct(@ModelAttribute Product product) {
	
		product.setAgent("(주)LnS Corp");
		
		System.out.println(product.getAgent());
		System.out.println(product.getName());
		
		return "redirect:loginAfter"; 
	}
	*/
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
