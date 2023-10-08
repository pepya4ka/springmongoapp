package com.pepyachka.springmongo.app.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "usermodel")
data class UserModel(
    @Id
    val id: String? = null,
    val firstName: String,
    val lastName: String,
    val phone: String
)
