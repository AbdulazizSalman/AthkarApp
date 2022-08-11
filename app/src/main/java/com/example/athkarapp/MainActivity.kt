package com.example.athkarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.athkarapp.adapter.AthkarAdapter
import com.example.athkarapp.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //list Of Athkar
        val AthkarList = Datasource().loadAthkar()
        //Adapter Of Athkar
        val adapter = AthkarAdapter(AthkarList,this)
        //Recycluar View
        val recyclerView : RecyclerView = findViewById(R.id.Rcv_athkar)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)


    }
}