package ac.id.pei.rpl.caloriesinformation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FirebaseAdapterFruit(private val listDataku: ArrayList<FirebaseData>): RecyclerView.Adapter<FirebaseAdapterFruit.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View): RecyclerView.ViewHolder(myView) {
        var tvNama: TextView = myView.findViewById(R.id.tv_nama)
        var tvBerat: TextView = myView.findViewById(R.id.tv_berat)
        var tvKalori: TextView = myView.findViewById(R.id.tv_kalori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku: View = LayoutInflater.from(parent.context).inflate(R.layout.data_fruit, parent, false)
        return FirebaseViewHolder(viewku)
    }


    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val data = listDataku[position]
        holder.tvNama.text = data.Nama
        holder.tvBerat.text = data.Berat
        holder.tvKalori.text = data.Kalori
    }

    override fun getItemCount(): Int {
        return listDataku.size
    }
}
