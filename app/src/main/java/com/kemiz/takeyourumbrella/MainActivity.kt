package com.kemiz.takeyourumbrella

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kemiz.takeyourumbrella.Adapter.TimeHorizontalRecyclerViewAdapter
import com.kemiz.takeyourumbrella.Data.TimeHorizontalViewSectionHeader
import com.kemiz.takeyourumbrella.Data.VerticalItem

class MainActivity : AppCompatActivity() {
    // private lateinit var recyclerView: RecyclerView
    // private lateinit var adapter: TimeHorizontalRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // horizontalRecyclerView
        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        var adapter: TimeHorizontalRecyclerViewAdapter

        var recyclerView2: RecyclerView = findViewById(R.id.recyclerView2)
        var adapter2: TimeHorizontalRecyclerViewAdapter

        // 간격 설정
        // val itemDecoration = HorizontalSpaceItemDecoration(resources.getDimensionPixelSize(R.dimen.item_space))
        // recyclerView.addItemDecoration(itemDecoration)

        // 어댑터 생성 및 RecyclerView에 연결
        val dataList: List<List<Any>> = listOf(
            listOf(TimeHorizontalViewSectionHeader(""),
                VerticalItem(R.drawable.gisang, "기상청"),
                VerticalItem(R.drawable.tomorrow, "tomorrow.io"),
                VerticalItem(R.drawable.openweather, "openWeather")),
            listOf(TimeHorizontalViewSectionHeader("오늘"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("21시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("22시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("23시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("24시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            // ... 추가적인 데이터 리스트
        )

        val dataList2: List<List<Any>> = listOf(
            listOf(TimeHorizontalViewSectionHeader(""),
                VerticalItem(R.drawable.ic_launcher_foreground, "기상청"),
                VerticalItem(R.drawable.ic_launcher_foreground, "투모로우"),
                VerticalItem(R.drawable.ic_launcher_foreground, "오픈웨더")),
            listOf(TimeHorizontalViewSectionHeader("오늘"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("21시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("22시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("23시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("24시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("오늘"),
                VerticalItem(R.drawable.ic_launcher_foreground, "기상청"),
                VerticalItem(R.drawable.ic_launcher_foreground, "투모로우"),
                VerticalItem(R.drawable.ic_launcher_foreground, "오픈웨더")),
            listOf(TimeHorizontalViewSectionHeader("20시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("21시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("22시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("23시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            listOf(TimeHorizontalViewSectionHeader("24시"),
                VerticalItem(R.drawable.ic_launcher_foreground, "11℃", "5%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "12℃", "15%"),
                VerticalItem(R.drawable.ic_launcher_foreground, "13℃", "25%")),
            // ... 추가적인 데이터 리스트
        )

        adapter = TimeHorizontalRecyclerViewAdapter(dataList)
        adapter2 = TimeHorizontalRecyclerViewAdapter(dataList2)

        // RecyclerView에 수평 방향 레이아웃 매니저 설정
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        recyclerView.adapter = adapter

        recyclerView2.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        recyclerView2.adapter = adapter2
    }
}