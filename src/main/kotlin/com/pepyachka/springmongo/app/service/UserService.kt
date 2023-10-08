package com.pepyachka.springmongo.app.service

import com.pepyachka.springmongo.app.dto.UserDTO
import com.pepyachka.springmongo.app.model.UserModel

interface UserService {
    fun getAllUsers(): List<UserModel>
    fun createUser(userDTO: UserDTO): UserModel
}