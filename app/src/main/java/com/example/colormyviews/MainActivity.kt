package com.example.colormyviews
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        var clickableViews: List<View> =listOf(binding.boxOneTextView,binding.boxTwoTextView
            ,binding.boxThreeTextView,binding.boxFourTextView,binding.boxFiveTextView)

        for(item in clickableViews){
            item. setOnClickListener(){makeColord(it)}
        }
    }

    private fun makeColord(view :View) {
when(view.id) {
    R.id.box_one_textView -> view.setBackgroundColor(Color.GRAY)
    R.id.box_two_textView -> view.setBackgroundColor(Color.DKGRAY)
    R.id.box_three_textView -> view.setBackgroundColor(Color.CYAN)
    R.id.box_four_textView -> view.setBackgroundColor(Color.GREEN)
    else  -> view.setBackgroundColor(Color.GREEN)

}

    }

}