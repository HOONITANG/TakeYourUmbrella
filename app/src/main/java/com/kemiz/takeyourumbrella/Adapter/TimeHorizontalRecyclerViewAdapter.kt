package com.kemiz.takeyourumbrella.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kemiz.takeyourumbrella.R

class TimeHorizontalRecyclerViewAdapter(private val dataList: List<List<Any>>): RecyclerView.Adapter<TimeHorizontalRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.time_horizontal_row, parent, false)
        // 아이템 레이아웃의 layout_width를 wrap_content로 설정
        view.layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val verticalDataList = dataList[position]
        val verticalAdapter = TimeHorizontalRecyclerViewItemAdapter(verticalDataList)

        // LinearLayoutManager를 수직으로 설정
        // holder = time_horizontal_row.xml임.
        // LinearLayout으로 감싸져 데이터를 출력임.
        val layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.VERTICAL, false)
        holder.verticalRecyclerView.layoutManager = layoutManager
        // LinearLayoutManager Data설정
        holder.verticalRecyclerView.adapter = verticalAdapter
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // row.xml > verticalRecyclerView
        val verticalRecyclerView: RecyclerView = itemView.findViewById(R.id.timeHorizontalRowRecyclerView)
    }
}