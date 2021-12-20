package com.example.mycomicsmarvellist.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycomicsmarvellist.R
import com.example.mycomicsmarvellist.databinding.ActivityMainBinding
import com.example.mycomicsmarvellist.home.entity.ResultAD

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var adapter:RecyclerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this





    }

    private fun configurarRecyclerView(){
        binding.recyclerComics.layoutManager = LinearLayoutManager(this)
        binding.recyclerComics.hasFixedSize()
        binding.recyclerComics.addItemDecoration(DividerItemDecoration(this, LinearLayout.VERTICAL))
    }

    private fun definirAdapter(comics:List<ResultAD>){
        if(adapter == null){
            adapter = RecyclerAdapter(comics,::cliclekItem)
        }

        binding.recyclerComics.adapter = adapter
    }


    private fun cliclekItem(nome:String){
        //FireBaseAqui
    }
}