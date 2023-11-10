package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Departamento;
import java.lang.Long;

@Repository
public interface IDepartamentoDAO extends JpaRepository<Departamento, Long> {

}