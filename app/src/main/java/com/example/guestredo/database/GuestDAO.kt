package com.example.guestredo.database

import androidx.room.*

@Dao
interface GuestDAO {
    @Query("SELECT * FROM my_guests")
    fun getAllGuests(): List<GuestEntity>

    @Delete()
    fun deleteGuest(guestEntity: GuestEntity)


    @Update
    fun updateGuest(guestEntity: GuestEntity)

    @Insert
    fun insertGuest(vararg guestEntity: GuestEntity)

    @Query("DELETE FROM  my_guests")
    fun clear()


}