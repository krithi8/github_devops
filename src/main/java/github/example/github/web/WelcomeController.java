package github.example.github.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
 public String Welcome(Model model) {
	 model.addAttribute("course", "devops");
 return "welcome";
	 
 }
}
