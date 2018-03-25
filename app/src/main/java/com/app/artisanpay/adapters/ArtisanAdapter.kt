package com.app.artisanpay.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.app.artisanpay.R
import com.app.artisanpay.data.model.Artisan

/**
 * Created by toluadetuyi on 12/12/17.
 */
class ArtisanAdapter(val artisans: List<Artisan>) : RecyclerView.Adapter<ArtisanAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_artisan, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.view.findViewById<TextView>(R.id.name).text="Dreadful Kotlin"

    }

    override fun getItemCount(): Int = artisans.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}