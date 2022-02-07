package com.example.listcustam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ListViewに表示するデータを準備
        val data = listOf(
           ListItem(1,"革命のエチュード","ピアノ","ピアノの詩人と言われたショパンの代表的なピアノ曲です。"),
           ListItem(2,"G線上のアリア","バイオリン","バッハの作品です。"),
           ListItem(3,"シャコンヌ","チェロ","これもバッハの作品です"),
           ListItem(4,"夜の女王のアリア","声楽","モーツアルト作曲"),
        )

        val list = findViewById<ListView>(R.id.list)
        //Map配列とレイアウトと関連付け
        list.adapter = MyListAdapter(this,data,R.layout.list_item)
    }
}