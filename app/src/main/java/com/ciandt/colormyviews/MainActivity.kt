package com.ciandt.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ciandt.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setListeners()

        binding.clean.setOnClickListener {
            setListenersReverse()
        }

    }
    private fun setListeners(){
        val clickableView:List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.red,
            binding.yellow,
            binding.green,
            binding.root
        )
        for(item in clickableView){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.red -> binding.boxThreeText.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.yellow -> binding.boxFourText.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.green -> binding.boxFiveText.setBackgroundResource(android.R.color.holo_green_light)


            else ->{
                view.setBackgroundColor(Color.LTGRAY)
            }

        }

    }
    private fun setListenersReverse(){
        val clickableView:List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.root,
        )
        for(item in clickableView){
            item.setBackgroundColor(Color.WHITE)
        }
    }


}