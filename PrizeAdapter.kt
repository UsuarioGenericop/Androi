import com.droids.androidcourse.slotmachine.Prize
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.droids.androidcourse.R

class PrizeAdapter(val context: Context?, data: List<Prize>) :
    RecyclerView.Adapter<PrizeAdapter.ViewHolder>() {

    private val itemsList: List<Prize> = data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.view_prize_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prize = itemsList[position]
        holder.prizeImage.setImageResource(prize.image)
        holder.prizeValue.text = prize.price.toString()
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var prizeImage: ImageView = itemView.findViewById(R.id.ivPrizeDesign)
        var prizeValue: TextView = itemView.findViewById(R.id.ivPrizeValue)
    }
}