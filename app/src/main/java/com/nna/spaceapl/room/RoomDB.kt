package com.nna.spaceapl.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nna.spaceapl.model.SpaceItem

@Database(entities = [SpaceItem::class], version = 1, exportSchema = false)

abstract class RoomDB : RoomDatabase() {
    abstract fun roomDao() : RoomDao

    companion object{

        private var roomDatabaseItem : RoomDB? = null

        fun getDatabaseItem(context: Context): RoomDB{
            return roomDatabaseItem ?: synchronized(this){
                roomDatabaseItem ?: Room.databaseBuilder(context,RoomDB::class.java,"item.db")
                    .fallbackToDestructiveMigration()
                    .build()
            }

        }
    }

}