package asset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/landing-login")
	public String login() {
		return "auth/login";
	}
		
}
