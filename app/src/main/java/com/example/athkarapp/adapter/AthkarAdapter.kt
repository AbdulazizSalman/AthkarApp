package com.example.athkarapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.athkarapp.R
import com.example.athkarapp.model.Athkar

class AthkarAdapter(
        private val dataset:List<Athkar>,
        private val context:Context
                    )
    :RecyclerView.Adapter<AthkarAdapter.AthkarViewHolder>(){//End AthkarAdapter


    class  AthkarViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView:TextView = view.findViewById(R.id.item_text)
        val imageView:ImageView = view.findViewById(R.id.item_image)

} //End AthkarViewHolde

    //تعرف ملف layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthkarViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_athkar,parent,false)
        return AthkarViewHolder(adapterLayout)
        }

    //نربط البيانات بالقالب الخاص بها بمساعدةViewHolder
    override fun onBindViewHolder(holder: AthkarViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.getString(item.textID)
        holder.imageView.setImageResource(item.imageID)
    }
    //تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size

}