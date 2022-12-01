package space.lobanovi.m3_hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display: TextView
    lateinit var edit_fist: EditText
    lateinit var edit_second: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var miltiply: Button
    lateinit var div: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display_result)
        edit_fist = findViewById(R.id.edit_fist)
        edit_second = findViewById(R.id.edit_second)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.Subtract)
        miltiply = findViewById(R.id.Multiply)
        div = findViewById(R.id.Divide)

        add.setOnClickListener{
            val res1 = edit_fist.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
          addition(res1,res2)
        }

    sub.setOnClickListener{
        val res1 = edit_fist.text.toString().toInt()
        val res2 = edit_second.text.toString().toInt()
        subtraction(res1,res2)
    }

        miltiply.setOnClickListener{
            val res1 = edit_fist.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            multiplication(res1,res2)
        }

        div.setOnClickListener{
            val res1 = edit_fist.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            division(res1,res2)
        }
}

    private fun addition(res1: Int, res2: Int) {
        val result = res1 + res2
        display.text = result.toString()
    }

    private fun subtraction(res1: Int, res2: Int) {
        val result = res1 - res2
        display.text = result.toString()
    }

    private fun multiplication(res1: Int, res2: Int) {
        val result = res1 * res2
        display.text = result.toString()
    }

    private fun division(res1: Int, res2: Int) {
        val result = res1 / res2
        display.text = result.toString()
    }
}