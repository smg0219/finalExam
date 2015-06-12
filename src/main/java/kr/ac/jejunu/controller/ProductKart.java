package kr.ac.jejunu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.jejunu.model.Kart;
import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.ProductService;

@Controller
@RequestMapping("/kart")
public class ProductKart {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public Model kart(HttpServletRequest req, @RequestParam(value = "id") Integer id, Model model) {

		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("company");
		User user2 = (User) session.getAttribute("personal");
		Kart kart = new Kart();
		
		Product product = productService.productFindById(id);
		kart.setProductId(product.getId());
		
		if (user != null)
			kart.setUserId(user.getId());
		else
			kart.setUserId(user2.getId());
		
		productService.insertKart(kart);
		
		Map<String, String> qParam = new HashMap<String, String>();
		List<Map<String, String>> list = this.productService.selectKart(qParam, kart);
		model.addAttribute("list", list);
		
		return model;
	}
}
