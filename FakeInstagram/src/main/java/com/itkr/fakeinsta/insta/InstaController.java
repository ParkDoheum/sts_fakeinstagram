package com.itkr.fakeinsta.insta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/insta")
public class InstaController {
	
	@Autowired
	InstaService service;
	
	@PostMapping("/uploadImg")
	public int uploadImg(@RequestParam MultipartFile file) {
		System.out.println("11111");
		service.uploadImg(file);		
		return 1;
	}
	
	
	
}
