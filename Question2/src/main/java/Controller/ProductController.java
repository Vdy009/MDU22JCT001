package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Product;
import Service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/get/all")
	public List<Product> getAll(){
		return productService.getAll();
		
	}
	
		@PostMapping("/add")
		public String add(@RequestBody Product product){
			return productService.add(product);
		
	}	
		
		
	}

