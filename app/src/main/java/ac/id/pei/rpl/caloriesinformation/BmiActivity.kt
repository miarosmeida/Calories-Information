package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiActivity : AppCompatActivity() {
    lateinit var kembali: ImageView
    lateinit var height : EditText
    lateinit var weight : EditText
    lateinit var result : TextView
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
        kembali = findViewById(R.id.btn_kembali)
        btn = findViewById(R.id.btn_bmi)
        weight = findViewById(R.id.weight)
        height = findViewById(R.id.height)
        result = findViewById(R.id.result)
        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = w/(h*h)
            result.text = "%.2f".format(res)

        }
        kembali.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }

    }
}