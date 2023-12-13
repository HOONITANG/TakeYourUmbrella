package com.kemiz.takeyourumbrella.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kemiz.takeyourumbrella.Data.TimeHorizontalViewSectionHeader
import com.kemiz.takeyourumbrella.Data.VerticalItem
import com.kemiz.takeyourumbrella.R

class TimeHorizontalRecyclerViewItemAdapter(private val dataList: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val SECTION_HEADER = 0
    private val ITEM = 1

    inner class SectionHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSection: TextView = itemView.findViewById(R.id.textViewSection)
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewTimeVertical: ImageView = itemView.findViewById(R.id.imageViewTimeVertical)
        val textViewTimeDegrees: TextView = itemView.findViewById(R.id.timeDegreesTextView)
        val textViewTimePercentage: TextView = itemView.findViewById(R.id.timePercentageTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            SECTION_HEADER -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.time_horizontal_row_vertical_section, parent, false)
                SectionHeaderViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.time_horizontal_row_vertical_item, parent, false)
                ItemViewHolder(view)
            }
        }
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.time_horizontal_row_vertical_item, parent, false)
//        return ViewHolder(view)
    }


//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val data = dataList[position]
//        holder.bind(data)
//    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SectionHeaderViewHolder -> {
                val sectionHeader = dataList[position] as TimeHorizontalViewSectionHeader
                holder.textViewSection.text = sectionHeader.title
            }
            is ItemViewHolder -> {
                val item = dataList[position] as VerticalItem
                holder.imageViewTimeVertical.setImageResource(item.imageResource)
                holder.textViewTimeDegrees.text = item.degrees
                holder.textViewTimePercentage.text = item.percentage
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (dataList[position] is TimeHorizontalViewSectionHeader) {
            SECTION_HEADER
        } else {
            ITEM
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}