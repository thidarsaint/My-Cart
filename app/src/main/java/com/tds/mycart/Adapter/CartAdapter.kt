package com.tds.mycart.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.tds.mycart.R
import com.tds.mycart.model.Cart
import kotlinx.android.synthetic.main.cart_item.view.*

class CartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var itemImage = itemView.findViewById<ImageView>(R.id.img_item)

    var itemName = itemView.findViewById<TextView>(R.id.txt_item_name)

    var itemPrice = itemView.findViewById<TextView>(R.id.txt_item_price)

    var txtKilo = itemView.findViewById<TextView>(R.id.txt_kilo)
    var btnPlus = itemView.findViewById<Button>(R.id.btn_plus)
    var btnMinus = itemView.findViewById<Button>(R.id.btn_minus)

}

class CartAdapter (var itemList: ArrayList<Cart>): RecyclerView.Adapter<CartViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].itemImage)
        holder.itemName.text = itemList[position].itemName
        holder.itemPrice.text = itemList[position].itemPrice.toString()

        holder.btnPlus.setOnClickListener {
            var count : Int = holder.txtKilo.text.toString().toInt()
            count++
            holder.txtKilo.text = count.toString()
        }

        holder.btnMinus.setOnClickListener {
            var count : Int = holder.txtKilo.text.toString().toInt()
            if(count > 0)
            {
                count--
            }
            holder.txtKilo.text = count.toString()
        }
    }

}