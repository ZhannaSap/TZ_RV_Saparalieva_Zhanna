package com.example.otbor_na_stazhirovku

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.otbor_na_stazhirovku.databinding.ItemBinding

class ItemAdapter(
    private var itemList: ArrayList<ItemModel>,
    private val onClick: (position: ItemModel) -> Unit
) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), onClick
        )
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       holder.bind(itemList[position])
    }
}


class ItemViewHolder(
    private var binding: ItemBinding,
    private val onClick: (position: ItemModel) -> Unit
) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ItemModel) {
        itemView.setOnClickListener {
            onClick(item)
        }
        binding.run {
            Glide.with(img).load(item.image).into(img)
            tvName.text = item.name
            tvYear.text = item.year
        }

    }
}
