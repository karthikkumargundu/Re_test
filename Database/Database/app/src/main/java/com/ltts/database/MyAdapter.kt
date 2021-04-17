package com.ltts.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var userlist : ArrayList<user>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun holdingViews(users : user){
            var myName = itemView.findViewById<TextView>(R.id.textViewName)
            var myPassword = itemView.findViewById<TextView>(R.id.textView2)
            var myEmail = itemView.findViewById<TextView>(R.id.textViewEmail)
            var myPhone = itemView.findViewById<TextView>(R.id.textViewPhone)

            myName.setText(users.name)
            myPassword.setText(users.password)
            myEmail.setText(users.email)
            myPhone.setText(users.phone)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
        var v = LayoutInflater.from(parent.context).inflate(R.layout.activity_my_adapter,parent,false)

        return MyViewHolder(v)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return userlist.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.holdingViews(userlist[position])
    }


}