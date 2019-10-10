package com.example.guestredo.database

import androidx.room.*

@Dao
interface GuestDAO {
    @Query("SELECT * FROM my_guests")
    fun getAllGuests(): List<GuestEntity>

    @Delete
    fun deleteGuest(guestEntity: GuestEntity)

    @Update
    fun updateGuest(guestEntity: GuestEntity)

    @Insert
    fun insertAllGuests(vararg guestEntity: GuestEntity)
}