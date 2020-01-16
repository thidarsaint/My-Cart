package com.tds.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tds.mycart.Adapter.CartAdapter
import com.tds.mycart.model.Cart

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView : RecyclerView = findViewById(R.id.recycle_cart)
        val itemList = ArrayList<Cart>()
        itemList.add(Cart(R.drawable.finegrainsugar, "Fine Grain Sugar", 20.00))
        itemList.add(Cart(R.drawable.peanut, "Peanut", 20.00))
        itemList.add(Cart(R.drawable.daawatrice, "Daawat Rice", 30.00))

        val cartAdapter = CartAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = cartAdapter
    }
}
