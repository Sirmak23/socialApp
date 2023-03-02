package com.irmak.multiview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.irmak.multiview.adapter.NewsFeedAdapter
import com.irmak.multiview.model.NewsFeedModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val newsFeedArray = ArrayList<NewsFeedModel>()
        newsFeedArray.add((NewsFeedModel("https://www.google.com/url?sa=i&url=https%3A%2F%2Ftr.pinterest.com%2FMatmazelhanim%2Fprofil-resimleri%2F&psig=AOvVaw1JGRBJQuyvc6enolJ6YqdF&ust=1677831877316000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCOC3wvnovP0CFQAAAAAdAAAAABAE",
        "merve",
            "48 mins",
            2,
            "hello guys",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Ftr%2Fimages%2Fsearch%2Fmanzaralar%2F&psig=AOvVaw2bn8xQfRyNCPwMl4ktZSl0&ust=1677832007069000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCKDssrfpvP0CFQAAAAAdAAAAABAE",
            "")))


        val adapter = NewsFeedAdapter(this,newsFeedArray)
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter

    }

}
