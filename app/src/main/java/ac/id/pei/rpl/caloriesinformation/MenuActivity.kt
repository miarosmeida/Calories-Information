package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    lateinit var kembali: ImageView
    lateinit var Foodmenu: LinearLayout
    lateinit var Drinkmenu: LinearLayout
    lateinit var Sayurmenu: LinearLayout
    lateinit var Fruit: LinearLayout
    lateinit var Laukmenu: LinearLayout
    lateinit var Jfmenu: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        kembali = findViewById(R.id.btn_kembali)
        Foodmenu = findViewById(R.id.foodmenu)
        Drinkmenu = findViewById(R.id.drinkmenu)
        Sayurmenu = findViewById(R.id.sayurmenu)
        Fruit = findViewById(R.id.fruitmenu)
        Laukmenu = findViewById(R.id.laukmenu)
        Jfmenu = findViewById(R.id.jfmenu)
        kembali.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }

        Foodmenu.setOnClickListener {
            val pindah = Intent(this, CaloriActivity::class.java)
            startActivity(pindah)
        }
        Drinkmenu.setOnClickListener {
            val pindah = Intent(this, DrinkActivity::class.java)
            startActivity(pindah)
        }
        Sayurmenu.setOnClickListener {
            val pindah = Intent(this, SayurActivity::class.java)
            startActivity(pindah)
        }
        Fruit.setOnClickListener {
            val pindah = Intent(this, FruitActivity::class.java)
            startActivity(pindah)
        }
        Laukmenu.setOnClickListener {
            val pindah = Intent(this, SideDishesActivity::class.java)
            startActivity(pindah)
        }
        Jfmenu.setOnClickListener {
            val pindah = Intent(this,JunkFoodActivity::class.java)
            startActivity(pindah)
        }
    }
}