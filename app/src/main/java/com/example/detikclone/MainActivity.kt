package com.example.detikclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikclone.NewsAdapter.NewAdapter
import com.example.detikclone.NewsAdapter.NewsModel
import com.example.detikclone.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlinenews: news?
        if (NewsModel.newslist.size>0){
            headlinenews = NewsModel.newslist[NewsModel.newslist.size-1]
            tvn_TitleHeadLine.setText(headlinenews.title)
            tvn_DescHeadLine.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.photo)

            cdv_newsheadline.setOnClickListener{
                val intent_detail = Intent( this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                        putExtra(DetailActivity.cont_Deskripsi, headlinenews.deskripsi)
                    }

                startActivity(intent_detail)
                finish()

            }

        }

        val layManager = LinearLayoutManager( this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewAdapter( this, NewsModel.newslist)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallBack(object : NewAdapter.OnItemClickCallBack{
            override fun OnItemClick(data: news) {
                val intent = Intent( this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                        putExtra(DetailActivity.cont_Deskripsi, data.deskripsi.toString())
                    }

                startActivity(intent)
                finish()

            }
        })

    }
}