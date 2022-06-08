package com.nna.spaceapl.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.nna.spaceapl.model.SpaceItem

@Dao
interface RoomDao {
    //Menampilkan data semua sesuai typenya
    //CRUD = R(Read)
    @Query("SELECT * FROM item WHERE type = :type")
    fun getDatabyType(type : String) : LiveData<List<SpaceItem>>

    //Menghapus semua data
    //CRUD = D(Delete)
    @Query("DELETE FROM item")
    suspend fun resetDatabase()

    //Menghapus per1 data
    //CRUD = D(Delete)
    @Query("DELETE FROM item WHERE type = :type")
    suspend fun resetType(type: String)

    //Membuat data
    //CRUD = C(Create)
    @Insert
    suspend fun insertData(data: List<SpaceItem>)
}