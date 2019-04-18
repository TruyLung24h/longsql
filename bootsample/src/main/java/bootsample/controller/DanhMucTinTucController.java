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

import bootsample.model.DanhMucTinTuc;
import bootsample.service.DanhMucTinTucService;

/*
  @Controller
 */
@Controller
@SessionAttributes("danhmuctintuc")
public class DanhMucTinTucController {
	@Autowired
	private DanhMucTinTucService danhmuctintucService;

	//@GetMapping("/")
	//public String home(HttpServletRequest request){
	//	request.setAttribute("mode", "MODE_HOME");
	//	return "index";
	//}
	
	@GetMapping("/all-danhmuctintucs")
	public String allDanhMucTinTucs(HttpServletRequest request){
		request.setAttribute("danhmuctintucs", danhmuctintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS4");
		return "index";
	}
	
	@GetMapping("/new-danhmuctintuc")
	public String newDanhMucTinTuc(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-danhmuctintuc")
	public String saveDanhMucTinTuc(@ModelAttribute DanhMucTinTuc danhmuctintuc, BindingResult bindingResult, HttpServletRequest request){
		danhmuctintucService.save(danhmuctintuc);
		request.setAttribute("danhmuctintuc", danhmuctintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-danhmuctintuc")
	public String updateDanhMucTinTuc(@RequestParam String madanhmuctintuc,@ModelAttribute DanhMucTinTuc binhluan, BindingResult bindingResult, HttpServletRequest request){
		danhmuctintucService.findDanhMucTinTuc(madanhmuctintuc);
		request.setAttribute("danhmuctintucs", danhmuctintucService.findAll());
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-danhmuctintuc")
	public String deleteDanhMucTinTuc(@RequestParam String madanhmuctintuc, HttpServletRequest request){
		danhmuctintucService.delete(madanhmuctintuc);
		request.setAttribute("danhmuctintucs", danhmuctintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
}
