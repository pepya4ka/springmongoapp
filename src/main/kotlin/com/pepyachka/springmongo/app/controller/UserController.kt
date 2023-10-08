package com.pepyachka.springmongo.app.controller

import com.pepyachka.springmongo.app.dto.UserDTO
import com.pepyachka.springmongo.app.model.UserModel
import com.pepyachka.springmongo.app.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun getAllUsers(): List<UserModel> = userService.getAllUsers()


    @PostMapping
    fun createUser(@RequestBody userDTO: UserDTO): UserModel = userService.createUser(userDTO)

}