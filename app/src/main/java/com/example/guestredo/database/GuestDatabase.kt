package com.example.guestredo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.guestredo.database.GuestEntity

@Database(entities = [GuestEntity::class], version = 1)
abstract class GuestDatabase: RoomDatabase() {
    abstract fun guestDAO(): GuestDAO
}