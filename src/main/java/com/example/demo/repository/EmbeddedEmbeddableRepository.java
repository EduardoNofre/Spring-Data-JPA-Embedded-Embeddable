package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AlunoEntity;

@Repository
public interface EmbeddedEmbeddableRepository extends JpaRepository<AlunoEntity, Integer> {

}
