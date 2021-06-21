package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.AlunoEntity;

public interface EmbeddedEmbeddableDao {

	List<AlunoEntity> buscaTodos();
	AlunoEntity inserir(AlunoEntity alunoEntity);

}
