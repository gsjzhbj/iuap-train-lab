package com.yonyou.iuap.train.lab.controller;

import com.yonyou.iuap.train.lab.config.SystemConfig;
import com.yonyou.iuap.train.lab.domain.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 *
* Title: UserRestController
* Description:
* 用户控制层
* Version:1.0.0
* @author gaoshja
* @date 2019年3月19日
 */
@Controller
public class UserRestController {
	Logger logger = LoggerFactory.getLogger(SystemConfig.SYSTEM_LOG_NAME);
    private List<User> userList= new ArrayList<>();

	@RequestMapping("/list")
	public String list(Model model) {
		logger.debug("search userinfo.");
		System.out.println("Thymeleaf查询所有");
		model.addAttribute("users", userList);
		return "templates/user/index";
	}


	@RequestMapping("/user")
	public String index(Model model) {
		logger.debug("search userinfo.");
		System.out.println("Thymeleaf查询所有");
		model.addAttribute("users", userList);
		return "templates/user/index";
	}

	@RequestMapping("/toAdd")
	public String toAdd() {
		return "templates/user/userAdd";
	}

	@RequestMapping("/add")
	public String add(User user) {
		user.setId(UUID.randomUUID().toString());
		userList.add(user);
		return "redirect:/list";
	}

	@RequestMapping("/toEdit")
	public String toEdit(Model model, String id) {
		for(User user:userList) {
			if(user.getId().equals(id)) {
				model.addAttribute("user", user);
			}
		}
		return "templates/user/userEdit";
	}

	@RequestMapping("/edit")
	public String edit(User user) {
		return "redirect:/list";
	}


	@RequestMapping("/toDelete")
	public String delete(String id) {
		return "redirect:/list";
	}
}
