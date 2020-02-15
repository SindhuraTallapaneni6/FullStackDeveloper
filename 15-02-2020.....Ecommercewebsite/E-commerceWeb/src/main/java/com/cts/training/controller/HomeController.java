package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

//	@GetMapping("/ProductView")
//	public String productPage() {
//		return "ProductView";
//	}
//
//	@GetMapping("/SupplierView")
//	public String supplierPage() {
//		return "hr";
//	}
//
//	@GetMapping("/UserView")
//	public String userPage() {
//		return "UserView";
//	}
//	
//	
//	@GetMapping("/CategoryView")
//	public String categoryPage() {
//		return "CategoryView";
//	}
	
}
