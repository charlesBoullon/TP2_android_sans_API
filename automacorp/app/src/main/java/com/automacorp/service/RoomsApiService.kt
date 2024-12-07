package com.automacorp.service

import com.automacorp.model.RoomDto
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface RoomsApiService {

    @GET("rooms")
    fun getAllRooms(): Call<List<RoomDto>>

    @GET("rooms/{id}")
    fun getRoomById(@Path("id") id: Long): Call<RoomDto>

    @PUT("rooms/{id}")
    fun updateRoom(
        @Path("id") id: Long,
        @Body room: RoomDto
    ): Call<RoomDto>

    @POST("rooms")
    fun createRoom(@Body room: RoomDto): Call<RoomDto>

    @DELETE("rooms/{id}")
    fun deleteRoomById(@Path("id") id: Long): Call<Unit>
}