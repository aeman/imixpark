/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package cn.ebatech.imixpark.web.user;

import cn.ebatech.imixpark.demo.model.User;
import cn.ebatech.imixpark.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

//import org.springside.examples.quickstart.service.account.ShiroDbRealm.ShiroUser;

/**
 * 用户修改自己资料的Controller.
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/profile")
public class ProfileController {

	@Autowired
	private UserService accountService;

	@RequestMapping(method = RequestMethod.GET)
	public String updateForm(Model model) {
		Long id = 1L; //getCurrentUserId();
		model.addAttribute("user", accountService.getUser(id));
		return "user/profile";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("user") User user) {
		accountService.updateUser(user);
//		updateCurrentUserName(user.getUser_name());
		return "redirect:/";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getUser(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("user", accountService.getUser(id));
		}
	}

//	/**
//	 * 取出Shiro中的当前用户Id.
//	 */
//	private Long getCurrentUserId() {
//		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
//		return user.id;
//	}
//
//	/**
//	 * 更新Shiro中当前用户的用户名.
//	 */
//	private void updateCurrentUserName(String userName) {
//		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
//		user.name = userName;
//	}
}
