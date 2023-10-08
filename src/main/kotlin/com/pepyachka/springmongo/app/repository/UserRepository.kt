package com.pepyachka.springmongo.app.repository

import com.pepyachka.springmongo.app.model.UserModel
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<UserModel, String>