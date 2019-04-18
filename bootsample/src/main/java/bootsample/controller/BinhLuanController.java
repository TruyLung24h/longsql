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

import bootsample.model.BinhLuan;
import bootsample.service.BinhLuanService;

/*
  @Controller
 */
@Controller
@SessionAttributes("binhluan")
public class BinhLuanController {
	@Autowired
	private BinhLuanService binhluanService;

	
	
	@GetMapping("/all-binhluans")
	public String allbinhluans(HttpServletRequest request){
		request.setAttribute("binhluans", binhluanService.findAll());
		request.setAttribute("mode", "MODE_TASKS3");
		return "index";
	}
	
	@GetMapping("/new-binhluan")
	public String newBinhLuan(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-binhluan")
	public String saveBinhLuan(@ModelAttribute BinhLuan binhluan, BindingResult bindingResult, HttpServletRequest request){
		binhluanService.save(binhluan);
		request.setAttribute("binhluans", binhluanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	
	@GetMapping("/update-binhluan")
	public String updateBinhLuan(@RequestParam String mabinhluan,@ModelAttribute BinhLuan binhluan, BindingResult bindingResult, HttpServletRequest request){
		binhluanService.findBinhLuan(mabinhluan);
		request.setAttribute("binhluans", binhluanService.findAll());
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-binhluan")
	public String deleteBinhLuan(@RequestParam String mabinhluan, HttpServletRequest request){
		binhluanService.delete(mabinhluan);
		request.setAttribute("binhluans", binhluanService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/seach-binhluan")
	public String search(@RequestParam("s") String s,HttpServletRequest request) {
		if (s.equals("")) {
			request.setAttribute("binhluans", binhluanService.findAll());
			request.setAttribute("mode", "MODE_TASKS3");
			return "index";
		}
		request.setAttribute("binhluans", binhluanService.Seach(s));
		request.setAttribute("mode", "MODE_TASKS3");
		return "index";
	}	
}
