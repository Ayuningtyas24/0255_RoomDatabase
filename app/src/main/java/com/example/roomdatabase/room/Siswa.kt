package com.example.roomdatabase.room

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "tblsiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String
)