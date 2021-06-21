package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoImpl.EmbeddedEmbeddableDaoImpl;
import com.example.demo.entity.AlunoEntity;

@Service
public class EmbeddedEmbeddableService {
	
	@Autowired
	private EmbeddedEmbeddableDaoImpl embeddedEmbeddableDaoImpl;

	public List<AlunoEntity> buscaTodasEmbeddedEmbeddable() {
		return embeddedEmbeddableDaoImpl.buscaTodos();
	}

	public AlunoEntity cadastroEmbeddedEmbeddable(AlunoEntity alunoEntity) {
		return embeddedEmbeddableDaoImpl.inserir(alunoEntity);
	}
	
}
