package com.nna.spaceapl.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Entity(tableName = "item")

@Parcelize
data class SpaceItem (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @Json(name = "gambar")
    var gambar: String?,
    @Json(name = "juddul")
    var judul: String?,
    @Json(name = "deskripsi")
    var deskripsi: String?,
    var type: String?,
): Parcelable