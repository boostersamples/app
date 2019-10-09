package io.github.boostersamples

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.concurrent.Executors

class MainActivity : Activity(), View.OnClickListener {

    private val executor = Executors.newSingleThreadExecutor()

    private lateinit var txtGreeting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.txtGreeting = findViewById(R.id.activity_main_greeting)
        this.txtGreeting.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.activity_main_greeting -> {
                executor.execute {
                    println(">>>>" + System.currentTimeMillis())
                    Thread.sleep(5000L)
                    println("<<<<" + System.currentTimeMillis())
                }
            }
        }
    }

}
