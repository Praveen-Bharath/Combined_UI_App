package com.example.gridandlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.my_recycler_view)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Model>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..6) {
            data.add(Model("Item $i",R.drawable.image))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = MyAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        var manager = GridLayoutManager(this,2)
        var recyclerview1 = findViewById<RecyclerView>(R.id.my_recycler_view2)
        recyclerview1.layoutManager=manager
        recyclerview1.adapter=Adapter(getData())
    }
    private fun getData():ArrayList<DataModel>
    {
        var list =  ArrayList<DataModel>()

        var model= DataModel("news1",R.drawable.image)
        list.add(model)
        var model1= DataModel("news2",R.drawable.image1)
        list.add(model1)
        var model2= DataModel("news3",R.drawable.image2)
        list.add(model2)
        var model3= DataModel("news4",R.drawable.image3)
        list.add(model3)
        var model4= DataModel("news5",R.drawable.image4)
        list.add(model4)

        var model5= DataModel("news1",R.drawable.image)
        list.add(model5)

        return list
    }
}