package com.example.laboratorio11

import com.example.laboratorio11.network.dto.login.LoginRequest
import com.example.laboratorio11.network.service.AuthService
import kotlinx.coroutines.test.runTest
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginTest {

    private lateinit var mockWebServer : MockWebServer
    private lateinit var authService : AuthService

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()

        authService = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AuthService::class.java)
    }

    @Test
    fun loginTest() = runTest {
        val mockResponse = MockResponse()
        mockResponse.setBody(""""{"msg": "Login Successful", "token": "testToken"}""")
        mockResponse.setResponseCode(200)
        mockWebServer.enqueue(mockResponse)

        val response = authService.login(LoginRequest("admin", "admin"))
        mockWebServer.takeRequest()

        Assert.assertEquals("Login Successful", response.message)
        Assert.assertEquals("testToken", response.token)
    }


    @Test
    fun unsuccessfulLogin() = runTest {
        val mockResponse = MockResponse()
        mockResponse.setBody(""""{"msg": "Check Credentials"}""")
        mockWebServer.enqueue(mockResponse)

        val response = authService.login(LoginRequest("admin", "admin"))
        mockWebServer.takeRequest()

        Assert.assertEquals("Check Credentials", response.message)
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}