package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    lateinit var kembali: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        kembali = findViewById(R.id.btn_kembali)
        kembali.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
    }
}