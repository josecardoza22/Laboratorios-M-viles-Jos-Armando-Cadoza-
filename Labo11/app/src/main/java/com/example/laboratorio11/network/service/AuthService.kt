package com.example.laboratorio11.network.service

import com.example.laboratorio11.network.dto.login.LoginRequest
import com.example.laboratorio11.network.dto.login.LoginResponse
import com.example.laboratorio11.network.dto.register.RegisterRequest
import com.example.laboratorio11.network.dto.register.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("api/auth/login")
    suspend fun login(@Body credentiales: LoginRequest): LoginResponse

    @POST("api/auth/register")
    suspend fun register(@Body credentiales: RegisterRequest): RegisterResponse
}