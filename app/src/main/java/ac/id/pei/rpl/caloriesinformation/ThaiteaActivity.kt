package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThaiteaActivity : AppCompatActivity() {
    lateinit var kembali: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thaitea)
        kembali = findViewById(R.id.btn_kembali)
        kembali.setOnClickListener {
            val pindah = Intent(this, RecipeActivity::class.java)
            startActivity(pindah)
        }
    }
}