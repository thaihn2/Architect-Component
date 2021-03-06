package thaihn.com.weatherapp.data.model

import com.google.gson.annotations.SerializedName

class Response(
        @SerializedName("latitude") val latitude: String,
        @SerializedName("longitude") val longitude: String,
        @SerializedName("timezone") val timezone: String,
        @SerializedName("currently") val currently: Currently,
        @SerializedName("hourly") val hourly: Hourly,
        @SerializedName("daily") val daily: Daily,
        @SerializedName("offset") val offset: Int
)
