package com.itkr.fakeinsta.insta;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class InstaService {
	
	@Autowired 
	InstaMapper mapper;
	
	@Autowired
	private Environment env;
	
	final String FOLDER_KEY = "file.upload-dir";
	
	
	public int uploadImg(MultipartFile file) {
		try {
			String folder = env.getProperty(FOLDER_KEY);
			byte[] bytes = file.getBytes();			
			
			Path path = Paths.get(folder + file.getOriginalFilename());
			Files.write(path, bytes);
          
          
            
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return 1;
	}
}
