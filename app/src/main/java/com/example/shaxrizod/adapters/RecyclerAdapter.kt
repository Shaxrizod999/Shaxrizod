package com.example.shaxrizod.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.shaxrizod.R
import com.example.shaxrizod.models.Place
import kotlinx.android.synthetic.main.item_excample.view.*

class RecyclerAdapter(var list: List<Place>, var listener: OnClick) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(place: Place) {
            itemView.apply {
                place.image?.let { iv_image.setImageResource(it) }
                tv_name.text = place.name
                card_item.animation = AnimationUtils.loadAnimation(card_item.context, R.anim.animation_itam)
            }
            itemView.setOnClickListener {
                listener.onItemClick(place)
            }
        }
    } 
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_excample,
                parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size

    interface OnClick {
        fun onItemClick(place: Place)
    }
}