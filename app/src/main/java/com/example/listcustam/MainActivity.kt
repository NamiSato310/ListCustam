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
            mapOf("title" to "革命のエチュード","tag" to "ピアノ",
            "desc" to "ピアノの詩人と言われたショパンの代表的なピアノ曲です。"),
            mapOf("title" to "G線上のアリア","tag" to "バイオリン",
                "desc" to "バッハの作品です。"),
            mapOf("title" to "シャコンヌ","tag" to "チェロ",
                "desc" to "これもバッハの作品です"),
            mapOf("title" to "夜の女王のアリア","tag" to "声楽",
                "desc" to "モーツアルト作曲"),
        )

        val list = findViewById<ListView>(R.id.list)
        //Map配列とレイアウトと関連付け
        list.adapter = SimpleAdapter(
            this,
            data,
            R.layout.list_item,
            arrayOf("title","tag","desc"),
            intArrayOf(R.id.title,R.id.tag,R.id.desc)
        )
    }
}