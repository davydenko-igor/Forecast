package com.example.weatherapp.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0
@Entity(tableName = "current_weather")
data class Data(
    @SerializedName("app_temp")
    val appTemp: Double,
    val aqi: Double,
    @SerializedName("city_name")
    val cityName: String,
    val clouds: Double,
    @SerializedName("country_code")
    val countryCode: String,
    val datetime: String,
    val dewpt: Double,
    val dhi: Double,
    val dni: Double,
    @SerializedName("elev_angle")
    val elevAngle: Double,
    val ghi: Double,
    @SerializedName("h_angle")
    val hAngle: Double,
    val lat: Double,
    val lon: Double,
    @SerializedName("ob_time")
    val obTime: String,
    val pod: String,
    val precip: Double,
    val pres: Double,
    val rh: Double,
    val slp: Double,
    val snow: Double,
    @SerializedName("solar_rad")
    val solarRad: Double,
    @SerializedName("state_code")
    val stateCode: String,
    val station: String,
    val sunrise: String,
    val sunset: String,
    val temp: Double,
    val timezone: String,
    val ts: Long,
    val uv: Double,
    val vis: Double,
    @Embedded(prefix = "weather_")
    val weather: Weather,
    @SerializedName("wind_cdir")
    val windCdir: String,
    @SerializedName("wind_cdir_full")
    val windCdirFull: String,
    @SerializedName("wind_dir")
    val windDir: Double,
    @SerializedName("wind_spd")
    val windSpd: Double
){
    @PrimaryKey(autoGenerate = false)
    var id:Int = CURRENT_WEATHER_ID
}