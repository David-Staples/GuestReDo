package com.example.guestredo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.guestredo.R
import com.example.guestredo.database.GuestDatabase
import com.example.guestredo.database.GuestEntity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), GuestInsert.GuestInsertListener, GuestQuery.GustQueryListener {



    private lateinit var myDAO: GuestDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        myDAO = Room.databaseBuilder(
            this,
            GuestDatabase::class.java,
            "guest.db"
            .allowMainThreadQueries()
            .build()

                    addGuest()
        setContentView(R.layout.activity_main)
    }

    fun addGuest(name: String, relationship: String) {

        MyDAO.guestDAO = myDAO.guestDAO().getAllGuests()
        val guest = GuestEntity(name, relationship)
        val stringBuilder = StringBuilder()

    }

}
