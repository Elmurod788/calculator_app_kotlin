package xyz.elmurod.timetableinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun Change(view: View) {
            var fragment: Fragment? = null
            when (view.id) {
                R.id.button1 -> fragment = FragmentOne()
                R.id.button2 -> fragment = FragmentTwo()
                R.id.button3 -> fragment = FragmentThree()
                R.id.button4 -> fragment = FragmentFour()
                R.id.button5 -> fragment = FragmentFive()
                R.id.button6 -> fragment = FragmentSix()
            }
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            assert(fragment != null)
            ft.replace(R.id.fr_place, fragment!!)
            ft.commit()
    }
}}