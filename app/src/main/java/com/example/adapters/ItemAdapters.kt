package com.example.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pdf_reader.R
import kotlinx.android.synthetic.main.boook_item.view.*

class ItemAdapters (val context :Context, val items :ArrayList<DataModel>)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.boook_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if(holder is ViewHolder)
        {
            holder.bookName.text = item.bookName
            holder.bookImg.setImageResource(item.bookCoverImg)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view : View) :RecyclerView.ViewHolder(view)
    {
        val bookName :TextView = view.txtViewBookName
        val bookImg :ImageView = view.imgViewBookPic
        val optionsBtn :ImageButton = view.imgBtnMoreOptions
    }
}