package com.example.listcustam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val rv = findViewById<RecyclerView>(R.id.rv)
        //固定サイズの場合にパフォーマンスを向上
        rv.setHasFixedSize(true)
        //レイアウトマネージャーの準備&設定
        rv.layoutManager = LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.VERTICAL
        }
        rv.adapter = MyListAdapter(data)

    }
}