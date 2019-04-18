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

import bootsample.model.TinTuc;
import bootsample.service.TinTucService;

/*
  @Controller
 */
@Controller
@SessionAttributes("tintuc")
public class TinTucController {
	@Autowired
	private TinTucService tintucService;

	//@GetMapping("/")
	//public String home(HttpServletRequest request){
	//	request.setAttribute("mode", "MODE_HOME");
	//	return "index";
	//}
	
	@GetMapping("/all-tintucs")
	public String allTinTucs(HttpServletRequest request){
		request.setAttribute("tintucs", tintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS5");
		return "index";
	}
	
	@GetMapping("/new-tintuc")
	public String newTinTuc(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-tintuc")
	public String saveTinTuc(@ModelAttribute TinTuc tintuc, BindingResult bindingResult, HttpServletRequest request){
		tintucService.save(tintuc);
		request.setAttribute("tintucs", tintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-tintuc")
	public String updateTinTuc(@RequestParam String matintuc,@ModelAttribute TinTuc tintuc, BindingResult bindingResult, HttpServletRequest request){
		tintucService.findTinTuc(matintuc);
		request.setAttribute("tintucs", tintucService.findAll());
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-tintuc")
	public String deleteTinTuc(@RequestParam String matintuc, HttpServletRequest request){
		tintucService.delete(matintuc);
		request.setAttribute("tintucs", tintucService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
}
