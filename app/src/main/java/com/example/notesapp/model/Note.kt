package com.example.notesapp.model

import com.google.firebase.Timestamp


data class Note(var id : String,var date : Timestamp, var note : String)