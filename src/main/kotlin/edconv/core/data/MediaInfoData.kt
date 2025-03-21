package edconv.core.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class MediaInfoData(val duration: String, val size: Long) {
    companion object {
        fun fromJsonString(json: String): MediaInfoData = Json.decodeFromString(json)
    }
}