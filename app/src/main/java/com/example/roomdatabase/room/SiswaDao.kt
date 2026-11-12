package com.example.roomdatabase.room

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.OnConflictStrategy
import androidx.room3.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
    
    @Query("SELECT * from tblsiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}
