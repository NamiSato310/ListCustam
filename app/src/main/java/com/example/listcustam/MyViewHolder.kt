package com.example.listcustam

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    //ウィジェットへの参照をプロパティに格納
    val title = itemView.findViewById<TextView>(R.id.title)
    val tag = itemView.findViewById<TextView>(R.id.tag)
    val desc = itemView.findViewById<TextView>(R.id.desc)
}