package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var menu: ImageView
    lateinit var recipe: ImageView
    lateinit var bmi: ImageView
    lateinit var about: ImageView
    lateinit var btnSignOut: ImageView
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menu = findViewById(R.id.meal)
        recipe = findViewById(R.id.recipe)
        bmi = findViewById(R.id.bmi)
        about = findViewById(R.id.about)
        btnSignOut = findViewById(R.id.btn_main_signout)
        firebaseAuth = FirebaseAuth.getInstance()
        menu.setOnClickListener {
            val pindah = Intent(this, MenuActivity::class.java)
            startActivity(pindah)
        }
        recipe.setOnClickListener {
            val pindah = Intent(this, RecipeActivity::class.java)
            startActivity(pindah)
        }
        bmi.setOnClickListener {
            val pindah = Intent(this, BmiActivity::class.java)
            startActivity(pindah)
        }
        about.setOnClickListener {
            val pindah = Intent(this, AboutActivity::class.java)
            startActivity(pindah)
        }

        btnSignOut.setOnClickListener {
            firebaseAuth.signOut()
            checkme()
        }

    }
    fun checkme() {
        val currentUser = firebaseAuth!!.currentUser
        if (currentUser == null) {
            val pindah = Intent(this, LoginActivity::class.java)
            startActivity(pindah)
        }
    }
}

