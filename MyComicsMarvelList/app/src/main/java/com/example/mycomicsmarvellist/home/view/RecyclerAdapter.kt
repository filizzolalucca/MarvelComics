package com.example.mycomicsmarvellist.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githublist.app.utils.commum.extensions.setOnSingleClickListener
import com.example.mycomicsmarvellist.databinding.ItemComicBinding
import com.example.mycomicsmarvellist.home.entity.ResultAD

class RecyclerAdapter(val comics : List<ResultAD>,
                      private val itemClicked:(String) -> Unit
): RecyclerView.Adapter<RecyclerAdapter.AdapterVH>() {





    class AdapterVH(itemBinding:ItemComicBinding):RecyclerView.ViewHolder(itemBinding.root){
        val binding = itemBinding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterVH {
        val itemBinding = ItemComicBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val comicVH = AdapterVH(itemBinding)

        itemBinding.root.setOnSingleClickListener{
            itemClicked(comics[comicVH.adapterPosition].title)
        }


        return comicVH

    }

    override fun onBindViewHolder(holder: AdapterVH, position: Int) {
        holder.binding.comic = comics[position]
    }

    override fun getItemCount(): Int {
        return comics.size
    }
}



