package com.example.webservicevolley

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : AppCompatActivity() {

    internal lateinit var contentTV: TextView

    override fun onCreate(savedInstancveState: Bundle?) {
        super.onCreate(savedInstancveState)
        setContentView(R.layout.activity_main)
        contentTV = findViewById(R.id.contentTV)


        fun loadData() {


            val Link = "https://jsonplaceholder.typicode.com/posts"
            val request = StringRequest(
                Link,
                Response.Listener { response -> contentTV.text = response },
                Response.ErrorListener { error -> Log.e("Volley Error", error.localizedMessage!!) })

            Volley.newRequestQueue(this).add(request)
        }
    }
}