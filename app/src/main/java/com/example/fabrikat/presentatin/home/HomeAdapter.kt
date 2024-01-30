package com.example.fabrikat.presentatin.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fabrikat.data.NoteModel
import com.example.fabrikat.databinding.FabricatItemRvBinding


class HomeAdapter() : ListAdapter<NoteModel, HomeAdapter.HomeViewHolder>(HomeCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding =
            FabricatItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
    }

    inner class HomeViewHolder(private val binding: FabricatItemRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: NoteModel) {
            binding.tvtitle.text = model.title
            binding.tvmani.text = model.description
            binding.characterImage.imageAlpha = model.img
        }
    }

    class HomeCallback : DiffUtil.ItemCallback<NoteModel>() {
        override fun areItemsTheSame(oldItem: NoteModel, newItem: NoteModel) =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: NoteModel, newItem: NoteModel) =
            oldItem == newItem
    }

}
