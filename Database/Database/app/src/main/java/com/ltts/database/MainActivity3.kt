package com.ltts.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_adapter)

        var kk = findViewById<RecyclerView>(R.id.myrecyclerview)

        kk.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<user>()

        myDatalist.add(user("karthik","12345","karthik@gamil.com","9592336132"))

        kk.adapter = MyAdapter(myDatalist)

    }
}