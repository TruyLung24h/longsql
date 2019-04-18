package bootsample.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import bootsample.model.LoaiTaiKhoan;
import bootsample.service.LoaiTaiKhoanService;

/*
  @Controller
 */
@Controller
@SessionAttributes("loaitaikhoan")
public class LoaiTaiKhoanController {
	@Autowired
	private LoaiTaiKhoanService loaitaikhoanService;

	//@GetMapping("/")
	//public String home(HttpServletRequest request){
	//	request.setAttribute("mode", "MODE_HOME");
	//	return "index";
	//}
	
	@GetMapping("/all-loaitaikhoans")
	public String allLoaitaiKhoans(HttpServletRequest request){
		request.setAttribute("loaitaikhoans", loaitaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS2");
		return "index";
	}
	
	@GetMapping("/new-loaitaikhoan")
	public String newLoaiTaiKhoan(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-loaitaikhoan")
	public String saveLoaiTaiKhoan(@ModelAttribute LoaiTaiKhoan loaitaikhoan, BindingResult bindingResult, HttpServletRequest request){
		loaitaikhoanService.save(loaitaikhoan);
		request.setAttribute("loaitaikhoans", loaitaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-loaitaikhoan")
	public String updateLoaiTaiKhoan(@RequestParam String maloaitaikhoan,@ModelAttribute LoaiTaiKhoan loaitaikhoan, BindingResult bindingResult, HttpServletRequest request){
		loaitaikhoanService.findLoaitaiKhoan(maloaitaikhoan);
		request.setAttribute("loaitaikhoans", loaitaikhoanService.findAll());
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-loaitaikhoan")
	public String deleteLoaiTaiKhoan(@RequestParam String maloaitaikhoan, HttpServletRequest request){
		loaitaikhoanService.delete(maloaitaikhoan);
		request.setAttribute("loaitaikhoans", loaitaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
}
