package com.example.Barebones.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Barebones.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
