package com.yuroyami.syncplay.utils

import com.yuroyami.syncplay.models.MediaFile
import io.ktor.http.Url

fun collectInfoLocaliOS(media: MediaFile) {
    with (media) {
        /** Using MiscUtils **/
        fileName = getFileName(uri!!)
        fileSize = "000000" //TODO

        /** Hashing name and size in case they're used **/
        fileNameHashed = sha256(fileName).toHex()
        fileSizeHashed = sha256(fileSize).toHex()
    }
}

//TODO: If Ktor Url grabs uri well, commonize it
fun collectInfoURLiOS(media: MediaFile) {
    with (media) {
        try {
            /** Using SyncplayUtils **/

            fileName = Url(url!!).pathSegments.last()
            fileSize = 0L.toString()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        /** Hashing name and size in case they're used **/
        fileNameHashed = sha256(fileName).toHex()
        fileSizeHashed = sha256(fileSize).toHex()
    }
}

val gb = 2L * 1024L * 1024L * 1024L

fun getFileName(s: String): String {
    return "IDK"
}