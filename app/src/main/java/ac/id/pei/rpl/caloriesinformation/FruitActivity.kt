package ac.id.pei.rpl.caloriesinformation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class FruitActivity : AppCompatActivity() {
    lateinit var fire: DatabaseReference
    lateinit var kembali: ImageView
    private lateinit var layoutku: RecyclerView
    private var ambilDatabase: ArrayList<FirebaseData> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)
        kembali = findViewById(R.id.btn_kembali)
        layoutku = findViewById(R.id.rv_datafruit)
        fire = FirebaseDatabase.getInstance().getReference("Fruit")
        kembali.setOnClickListener {
            val pindah = Intent(this, MenuActivity::class.java)
            startActivity(pindah)
        }
    }

    override fun onStart(){
        super.onStart()
        loadMeFirst()
    }

    private fun loadMeNow(){
        layoutku.layoutManager = LinearLayoutManager(this)
        val myA = FirebaseAdapterDrink(ambilDatabase)
        layoutku.adapter = myA
    }

    private fun loadMeFirst(){
        fire.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot!!.exists()){
                    ambilDatabase.clear()
                    for (x in snapshot.children){
                        val mymy = x.getValue(FirebaseData::class.java)
                        ambilDatabase.add(mymy!!)
                    }
                }
                loadMeNow()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}