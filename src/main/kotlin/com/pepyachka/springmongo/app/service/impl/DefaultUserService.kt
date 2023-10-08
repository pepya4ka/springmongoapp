package com.pepyachka.springmongo.app.service.impl

import com.pepyachka.springmongo.app.dto.UserDTO
import com.pepyachka.springmongo.app.model.UserModel
import com.pepyachka.springmongo.app.repository.UserRepository
import com.pepyachka.springmongo.app.service.UserService
import org.springframework.stereotype.Service

@Service
class DefaultUserService(
    private val userRepository: UserRepository
) : UserService {

    override fun getAllUsers(): List<UserModel> = userRepository.findAll()

    override fun createUser(userDTO: UserDTO): UserModel {
        val user = UserModel(firstName = userDTO.firstName, lastName = userDTO.lastName, phone = userDTO.phone)
        return userRepository.save(user)
    }
}