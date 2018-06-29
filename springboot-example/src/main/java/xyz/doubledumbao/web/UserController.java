package xyz.doubledumbao.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xyz.doubledumbao.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	public User getUserInfo() {
		User user = new User();
		user.setName("doubledumbao");
		user.setMobile("123");
		return user;
	}
}
