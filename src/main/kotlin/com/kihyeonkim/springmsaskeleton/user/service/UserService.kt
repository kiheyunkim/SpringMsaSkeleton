package com.kihyeonkim.springmsaskeleton.user.service

import com.kihyeonkim.springmsaskeleton.user.model.UserModel
import org.springframework.stereotype.Service

@Service
class UserService {
	fun getUserInfo(userId: String): UserModel {
		return UserModel(userId, "이름", "주소")
	}
}