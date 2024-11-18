package com.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {

		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println("File Details");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getResource());

		// File Uploading Source

		byte data[] = file.getBytes();

		// have to save file on server
		// also i have to save file in my current project resources in specific
		// directory
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);

			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");

			model.addAttribute("msg", "Upload File Successfully");
			model.addAttribute("filename", file.getOriginalFilename());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("File Uplading Failed! ");
			model.addAttribute("msg", "Uploading Error");
		}

		return "filesuccess";
	}

}
