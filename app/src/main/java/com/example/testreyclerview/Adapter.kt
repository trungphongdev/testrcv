package com.example.testreyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testreyclerview.databinding.ItemRcvBinding

class Adapter : ListAdapter<Item, ItemViewHolder>(ItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRcvBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int, payloads: MutableList<Any>) {
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads)
        } else {
            if (payloads[0] != null) {
                holder.bind(item = getItem(position))
            }
        }
    }

}

class ItemViewHolder(
    private val binding: ItemRcvBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        this.binding.tvNumber.text = item.value
    }
}



class ItemDiffCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.key == newItem.key
    }

    override fun getChangePayload(oldItem: Item, newItem: Item): String? {
        return if (oldItem.value != newItem.value) newItem.value else null
    }
}