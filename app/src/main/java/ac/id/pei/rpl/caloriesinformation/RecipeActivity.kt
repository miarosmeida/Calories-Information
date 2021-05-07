package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecipeActivity : AppCompatActivity() {
    lateinit var kembali: ImageView
    lateinit var Eskrim: ImageView
    lateinit var Pasta: ImageView
    lateinit var Pancake: ImageView
    lateinit var Bakwan: ImageView
    lateinit var Thaitea: ImageView
    lateinit var Sambal: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        kembali = findViewById(R.id.btn_kembali)
        Eskrim = findViewById(R.id.eskrim)
        Pasta = findViewById(R.id.pasta)
        Pancake = findViewById(R.id.pancake)
        Bakwan = findViewById(R.id.bakwan)
        Thaitea = findViewById(R.id.thaitea)
        Sambal = findViewById(R.id.sambal)
        kembali.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
        Eskrim.setOnClickListener {
            val pindah = Intent(this, EskrimActivity::class.java)
            startActivity(pindah)
        }
        Pasta.setOnClickListener {
            val pindah = Intent(this, PastaActivity::class.java)
            startActivity(pindah)
        }
        Pancake.setOnClickListener {
            val pindah = Intent(this, PancakeActivity::class.java)
            startActivity(pindah)
        }
        Bakwan.setOnClickListener {
            val pindah = Intent(this, BakwanActivity::class.java)
            startActivity(pindah)
        }
        Thaitea.setOnClickListener {
            val pindah = Intent(this, ThaiteaActivity::class.java)
            startActivity(pindah)
        }
        Sambal.setOnClickListener {
            val pindah = Intent(this,SambalActivity::class.java)
            startActivity(pindah)
        }
    }
}