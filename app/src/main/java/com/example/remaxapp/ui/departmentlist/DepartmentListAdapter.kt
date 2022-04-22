package com.example.remaxapp.ui.departmentlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.remaxapp.data.models.Department
import com.example.remaxapp.databinding.ItemDepartmentBinding

class DepartmentListAdapter(
    val objList: List<Department>
) : RecyclerView.Adapter<DepartmentListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemDepartmentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDepartmentBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val obj = objList[position]
        val binding = holder.binding
        binding.tvTitleDepartment.text = obj.title
        binding.tvDescriptionDepartment.text = obj.description
        binding.tvBedsNumber.text = obj.bedsNumber.toString()
        binding.tvPriceDepartment.text = obj.price.toString()
    }

    override fun getItemCount(): Int {
        return objList.size
    }
}