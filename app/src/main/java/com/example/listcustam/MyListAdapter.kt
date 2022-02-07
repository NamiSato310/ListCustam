package com.example.listcustam
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyListAdapter(
    private val context: Context,
    private  val data:List<ListItem>,
    private  val resource:Int
):BaseAdapter() {
    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
    as LayoutInflater

    //データ項目の個数を取得
    override fun getCount(): Int {
        return data.size
    }

    //指定された項目を取得
    override fun getItem(position: Int): ListItem {
        return data[position]
    }

    //指定された項目を識別するためのidを取得
    override fun getItemId(position: Int): Long {
        return data[position].id
    }

    //リスト項目に表示するためのViewを取得
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = getItem(position)
        val sview = convertView?:inflater.inflate(resource,null)
        sview.findViewById<TextView>(R.id.title).text = item.title
        sview.findViewById<TextView>(R.id.tag).text = item.tag
        sview.findViewById<TextView>(R.id.desc).text = item.desc
        return sview


    }
}