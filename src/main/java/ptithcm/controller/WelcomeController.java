package ptithcm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("Welcome")
	public String Hello() {
		return "Welcome";
	}
}