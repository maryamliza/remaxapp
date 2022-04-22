package com.example.remaxapp.data.sources

import com.example.remaxapp.data.models.Department

class DepartmentRepository {

    fun getDepartments(): List<Department> {
        return listOf(
            Department("Depa1", "Lindo depa", 500000.0, 3),
            Department("Depa2", "Nuevo depa", 560000.0, 1),
            Department("Depa3", "Lindo depa", 650000.0, 2),
            Department("Depa4", "Lindo depa", 490000.0, 3),
            Department("Depa5", "Lindo depa", 510500.0, 4),
            Department("Depa6", "Lindo depa", 500900.0, 3),
        )
    }
}