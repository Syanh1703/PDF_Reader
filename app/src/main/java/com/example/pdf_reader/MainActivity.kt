package com.example.pdf_reader

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Menu
import androidx.appcompat.app.ActionBar
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapters.DataModel
import com.example.adapters.ItemAdapters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Edit the app name
        supportActionBar!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar!!.setCustomView(R.layout.center_app_name)

        reViewBookList.layoutManager = LinearLayoutManager(this)
        val itemAdapters = ItemAdapters(this, getItemList())
        reViewBookList.adapter = itemAdapters
    }

    private fun getItemList():ArrayList<DataModel>
    {
        val list = ArrayList<DataModel>()
        list.add(DataModel("Sherlock Holmes",R.drawable.sherlock))
        list.add(DataModel("Sir Alex Ferguson",R.drawable.alex))
        list.add(DataModel("The Call From The Wild", R.drawable.the_call))
        list.add(DataModel("The A.B.C Murders", R.drawable.the_abc))
        list.add(DataModel("Nothing Last Forever", R.drawable.nothing_last_forever))
        return list
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_first_page,menu)
        return super.onCreateOptionsMenu(menu)
    }

}
