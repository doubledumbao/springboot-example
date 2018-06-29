package xyz.doubledumbao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xyz.doubledumbao.pojo.Resource;
import xyz.doubledumbao.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	public User getUserInfo() {
		User user = new User();
		user.setName("张三");
		user.setMobile("12345678");
		return user;
	}
	@RequestMapping(value="/getUserSource",method=RequestMethod.GET)
	public User getUserByResource() {
		User user = new User();
		user.setMobile(resource.getPhone());
		user.setName(resource.getName());
		return user;
	}
}
