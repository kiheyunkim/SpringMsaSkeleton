package com.kihyeonkim.springmsaskeleton.user.controller

import com.kihyeonkim.springmsaskeleton.user.model.UserModel
import com.kihyeonkim.springmsaskeleton.user.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController(private val userService: UserService) {

	@GetMapping("/getInfo")
	fun getUserInfo(userId: String): UserModel {
		return userService.getUserInfo(userId)
	}
}