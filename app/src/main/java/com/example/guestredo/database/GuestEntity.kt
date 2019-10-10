package com.example.guestredo.database

import androidx.room.*

@Entity(tableName = "my_guests")
data class GuestEntity(
    @PrimaryKey(autoGenerate = true) var primaryKey: int?,
    @ColumnInfo(name = "guest_name") var guestName: String,
    @ColumnInfo(name = "guest_relationship") var guestRelationship: String
) {
    constructor(
        guestName: String,
        guestRelationship: String
    ) : this(null, guestName, guestRelationship)
}
