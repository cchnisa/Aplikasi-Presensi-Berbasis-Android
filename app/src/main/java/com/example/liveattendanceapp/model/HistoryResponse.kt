package com.example.liveattendanceapp.model

import com.google.gson.annotations.SerializedName

data class HistoryResponse(

	@field:SerializedName("ontime")
	val ontime: Int? = null,

	@field:SerializedName("late")
	val late: Int? = null,

	@field:SerializedName("data")
	val histories: List<History?>? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class DetailHistory(

	@field:SerializedName("attendance_id")
	val attendanceId: Int? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("distance")
	val distance: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("photo")
	val photo: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("long")
	val jsonMemberLong: String? = null,

	@field:SerializedName("lat")
	val lat: String? = null
)

data class History(

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("user_id")
	val userId: Int? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("detail")
	val detail: List<DetailHistory?>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
