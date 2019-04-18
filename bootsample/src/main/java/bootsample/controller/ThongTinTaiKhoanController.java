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

import bootsample.model.ThongTinTaiKhoan;
import bootsample.service.ThongTinTaiKhoanService;

/*
  @Controller
 */
@Controller
@SessionAttributes("thongtintaikhoan")
public class ThongTinTaiKhoanController {
	@Autowired
	private ThongTinTaiKhoanService thongtintaikhoanService;

	//@GetMapping("/")
	//public String home(HttpServletRequest request){
	//	request.setAttribute("mode", "MODE_HOME");
	//	return "index";
	//}
	
	@GetMapping("/all-thongtintaikhoans")
	public String allThongTinTaiKhoans(HttpServletRequest request){
		request.setAttribute("thongtintaikhoans", thongtintaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS4");
		return "index";
	}
	
	@GetMapping("/new-thongtintaikhoan")
	public String newThongTinTaiKhoan(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-thongtintaikhoan")
	public String saveThongTinTaiKhoan(@ModelAttribute ThongTinTaiKhoan thongtintaikhoan, BindingResult bindingResult, HttpServletRequest request){
		thongtintaikhoanService.save(thongtintaikhoan);
		request.setAttribute("thongtintaikhoans", thongtintaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-thongtintaikhoan")
	public String updateThongTinTaiKhoan(@RequestParam String tendangnhap,@ModelAttribute ThongTinTaiKhoan thongtintaikhoan, BindingResult bindingResult, HttpServletRequest request){
		thongtintaikhoanService.findThongTinTaiKhoan(tendangnhap);
		request.setAttribute("thongtintaikhoans", thongtintaikhoanService.findAll());
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-thongtintaikhoan")
	public String deleteThongTinTaiKhoan(@RequestParam String tendangnhap, HttpServletRequest request){
		thongtintaikhoanService.delete(tendangnhap);
		request.setAttribute("thongtintaikhoans", thongtintaikhoanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
}
