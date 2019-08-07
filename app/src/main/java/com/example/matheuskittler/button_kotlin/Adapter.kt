package com.example.matheuskittler.button_kotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_things.view.*

class Adapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var context: Context
    lateinit var things: ArrayList<Things>
    lateinit var inflater: LayoutInflater

    fun addThings(things: Things) {
        this.things.add(things)
    }

    constructor(context: Context, things: ArrayList<Things>, inflater: LayoutInflater) : this() {
        this.context = context
        this.things = things
        this.inflater = inflater
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.row_things, parent, false))
    }

    override fun getItemCount(): Int = things.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val things = things[position]

        holder.itemView.tvName.text = things.name
        holder.itemView.tvLastName.text = things.lastName
        holder.itemView.tvSugest.text = things.sugest
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

}