package com.example.remaxapp.ui.departmentlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.remaxapp.data.models.Department
import com.example.remaxapp.databinding.FragmentListDepartmentBinding

class DepartmentListFragment : Fragment() {
    private lateinit var binding: FragmentListDepartmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListDepartmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val departmentList = listOf<Department>(
            Department("Depa1", "Lindo depa", 1234.5, 3),
            Department("Depa2", "Lindo depa", 1234.5, 3),
            Department("Depa3", "Lindo depa", 1234.5, 3),
            Department("Depa4", "Lindo depa", 1234.5, 3),
            Department("Depa5", "Lindo depa", 1234.5, 3),
            Department("Depa6", "Lindo depa", 1234.5, 3),
        )
        val recycler = binding.rvDepartmentList
        recycler.adapter = DepartmentListAdapter(departmentList)

    }

}