package io.github.boostersamples

import android.app.Activity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity_main_greeting.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, (0..100).map { "$it" })
        activity_main_greeting.setOnScrollListener(object : AbsListView.OnScrollListener {
            override fun onScroll(view: AbsListView?, firstVisibleItem: Int, visibleItemCount: Int, totalItemCount: Int) {
                // Thread.sleep(100)
            }

            override fun onScrollStateChanged(view: AbsListView?, scrollState: Int) {
            }
        })
    }

}
