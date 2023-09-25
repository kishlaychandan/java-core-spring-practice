package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
	public String ShowUploadForm() {
		String str=null;
		System.out.println(str.charAt(0));
		return "fileform";
	}

	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s,Model m) {
		System.out.println(file.getSize());
		System.out.println("kaam kr rha na?");
		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+ "image"+File.separator + file.getOriginalFilename();
		
		System.out.println(path);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("uploadded ....");
			m.addAttribute("filename", file.getOriginalFilename());
			m.addAttribute("msg", "uploaded successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("upload error");
			m.addAttribute("msg", "uploading error");
		}
		return "filesuccess";

	}
}
