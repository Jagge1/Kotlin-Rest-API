package com.example.jwttokens.repository

import org.springframework.stereotype.Repository
import com.example.jwttokens.model.User
import com.example.jwttokens.model.Role
import java.util.UUID

@Repository
class UserRepository {

    //Dummy database
    private val users = mutableListOf(
        User(
            id = UUID.randomUUID(),
            email = "email-1@gmail.com",
            password = "pass1",
            role = Role.USER
        ),
        User(
            id = UUID.randomUUID(),
            email = "email-2@gmail.com",
            password = "pass2",
            role = Role.ADMIN
        ),
        User(
            id = UUID.randomUUID(),
            email = "email-3@gmail.com",
            password = "pass3",
            role = Role.USER
        )
    )
    //User functions
    fun save(user: User): Boolean =
        users.add(user)

    fun findByEmail(email: String) =
        users
            .firstOrNull{ it.email == email}

    fun findAll(): List<User> =
            users

    fun findByUUID(uuid: UUID): User? =
            users
                .firstOrNull{ it.id == uuid}

    fun deleteByUUID(uuid: UUID): Boolean {
        val foundUser = findByUUID(uuid)

        return foundUser?.let {
            users.remove(it)
        } ?: false
    }
}
