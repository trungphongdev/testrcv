package com.example.testreyclerview

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val adapter: Adapter = Adapter()
    private val hashMap = LinkedHashMap<String,String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setDataAdapter()
        val timer = object: CountDownTimer(200000, 500) {
            override fun onTick(millisUntilFinished: Long) {
                adapter.submitList(getRandomList())
            }

            override fun onFinish() {

            }
        }

    }

    private fun setDataAdapter() {
        adapter.setData(getDataFromApi())
    }

    private fun getDataFromApi(): List<Item> {
        hashMap.put("PMP1","1")
        hashMap.put("PMP2","2")
        hashMap.put("PMP3","3")
        hashMap.put("PMP4","4")
        hashMap.put("PMP5","5")
        hashMap.put("PMP6","6")
        hashMap.put("PMP7","7")
        hashMap.put("PMP8","8")
        hashMap.put("PMP9","9")
        hashMap.put("PMP10","10")
        hashMap.put("PMP11","11")
        hashMap.put("PMP12","12")
        hashMap.put("PMP13","13")
        hashMap.put("PMP14","14")
        hashMap.put("PMP15","15")
        hashMap.put("PMP16","16")
        hashMap.put("PMP17","17")
        hashMap.put("PMP18","18")
        hashMap.put("PMP19","19")
        hashMap.put("PMP20","20")
        hashMap.put("PMP21","21")
        hashMap.put("PMP22","22")
        hashMap.put("PMP23","23")
        hashMap.put("PMP24","24")
        hashMap.put("PMP25","25")
        hashMap.put("PMP26","26")
        hashMap.put("PMP27","27")
        hashMap.put("PMP28","28")
        hashMap.put("PMP29","29")
        hashMap.put("PMP30","30")
        hashMap.put("PMP31","31")
        hashMap.put("PMP32","32")
        hashMap.put("PMP33","33")
        hashMap.put("PMP34","34")
        hashMap.put("PMP35","35")
        hashMap.put("PMP36","36")
        hashMap.put("PMP37","36")
        hashMap.put("PMP38","36")
        hashMap.put("PMP39","36")
        hashMap.put("PMP40","36")
        hashMap.put("PMP41","36")
        hashMap.put("PMP42","36")
        hashMap.put("PMP43","36")
        hashMap.put("PMP44","36")
        hashMap.put("PMP45","36")
        hashMap.put("PMP46","36")
        hashMap.put("PMP47","36")
        hashMap.put("PMP48","36")
        hashMap.put("PMP49","36")
        hashMap.put("PMP50","36")
        return LinkedHashMap<String, String>(hashMap).toList().map {
            Item(it.first, it.second)
        }
    }

    private fun getRandomList(): List<Item> {
        val random  = Random.nextInt()
        hashMap.put("PMP1","$random")
        hashMap.put("PMP2","$random")
        hashMap.put("PMP3","$random")
        hashMap.put("PMP4","$random")
        hashMap.put("PMP5","$random")
        hashMap.put("PMP6","$random")
        hashMap.put("PMP7","$random")
        hashMap.put("PMP8","$random")
        hashMap.put("PMP9","$random")
        hashMap.put("PMP10","$random")
        hashMap.put("PMP11","11")
        hashMap.put("PMP12","$random")
        hashMap.put("PMP13","$random")
        hashMap.put("PMP14","14")
        hashMap.put("PMP15","15")
        hashMap.put("PMP16","$random")
        hashMap.put("PMP17","17")
        hashMap.put("PMP18","18")
        hashMap.put("PMP19","19")
        hashMap.put("PMP20","$random")
        hashMap.put("PMP21","$random")
        hashMap.put("PMP37","$random")
        hashMap.put("PMP38","$random")
        hashMap.put("PMP39","$random")
        hashMap.put("PMP41","$random")
        hashMap.put("PMP42","$random")
        hashMap.put("PMP43","$random")
        hashMap.put("PMP44","$random")
        hashMap.put("PMP45","$random")
        hashMap.put("PMP46","$random")
        hashMap.put("PMP47","$random")
        hashMap.put("PMP48","$random")
        hashMap.put("PMP49","$random")
        hashMap.put("PMP50","$random")
        return hashMap.toList().map {
            Item(it.first, it.second)
        }
    }


    private fun initViews() {
        findViewById<RecyclerView>(R.id.rcvData).apply {
            adapter = this@MainActivity.adapter
            itemAnimator = DefaultItemAnimator()
        }
    }
}
data class Item(val key: String, val value: String)