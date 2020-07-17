package com.example.detikclone.NewsAdapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.detikclone.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewAdapter (val  context: Context, val  listnews: List<news>) :
    RecyclerView.Adapter<NewAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentnews: news? = null
        var currentPosition: Int = 0

        fun setData(currnews: news, pos: Int) {
            itemView.tvw_title.text = currnews!!.title
            itemView.tvw_desc.text = currnews!!.desc
            itemView.img_news.setImageResource(currnews!!.photo)


            this.currentnews
            this.currentPosition

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return  MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewAdapter.MyViewHolder, position: Int) {
       var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemClickCallBack.OnItemClick(listnews[position])}
    }

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    interface OnItemClickCallBack{
        fun OnItemClick(data: news)
    }



}