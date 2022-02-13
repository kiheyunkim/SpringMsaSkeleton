package com.kihyeonkim.springmsaskeleton.user.controller

import com.kihyeonkim.springmsaskeleton.user.model.UserModel
import com.kihyeonkim.springmsaskeleton.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

@Controller
@ResponseBody
@RequestMapping("/user")
class UserController(private val userService: UserService) {

	@GetMapping("/getInfo")
	fun getUserInfo(@RequestParam userId: String): UserModel {
		return userService.getUserInfo(userId)
	}

	@GetMapping("/getInfo2")
	fun getUserInfo2(): ResponseEntity<Object> {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
	}
}