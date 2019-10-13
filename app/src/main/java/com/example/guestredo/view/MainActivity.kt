package com.example.guestredo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.guestredo.R
//import com.example.guestredo.adapter.GuestListAdapter
import com.example.guestredo.database.GuestDatabase
import com.example.guestredo.database.GuestEntity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), FragmentGuestListListener {

    private val fragmentGuestList = FragmentGuestList()

//    , GuestInsert.GuestInsertListener, GuestQuery.GustQueryListener

    private lateinit var myDAO: GuestDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setUpRecyclerView()
//
//        fun toRecycler (view: View) {
//            val goTo = Intent(this, recycler_view::class.java)
//
//            startActivity(recycler_view)
//
//           fun setUpRecyclerView(() {
//                mainRecyclerView.adapter = GuestListAdapter(guestList)
//                mainRecyclerView().layoutManager = LinearLayoutManager(contex: this)
//                    (mainRecyclerView.adapter as GuestListAdapter).notifyDataSetChanged()
//
//            }

    //    }

        myDAO = Room.databaseBuilder(
            this,
            GuestDatabase::class.java,
            "guest.db")
            .allowMainThreadQueries()
            .build()



        addGuestButtonview.setOnClickListener {
            var myGuest = nameEditTextview.text.toString()
            var myRelationship = relationshipEditTextview.text.toString()
            var guestEntity = GuestEntity(myGuest, myRelationship)
            myDAO.guestDAO().insertGuest(guestEntity)
        }

        guestListButton.setOnClickListener{
//            var guestList = myDAO.guestDAO().getAllGuests().toString()
//            show_guests.text = gList
          //  toRecycler()
        }

        clearButtonview.setOnClickListener{
            myDAO.guestDAO().clear()
        }
    }

}








