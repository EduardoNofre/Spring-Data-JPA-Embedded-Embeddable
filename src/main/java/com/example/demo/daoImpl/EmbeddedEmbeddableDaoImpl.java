package com.example.demo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmbeddedEmbeddableDao;
import com.example.demo.entity.AlunoEntity;
import com.example.demo.repository.EmbeddedEmbeddableRepository;

@Repository
public class EmbeddedEmbeddableDaoImpl implements EmbeddedEmbeddableDao {

	@Autowired
	private EmbeddedEmbeddableRepository embeddedEmbeddableRepository;

	@Override
	public List<AlunoEntity> buscaTodos() {
		return embeddedEmbeddableRepository.findAll();
	}

	@Override
	public AlunoEntity inserir(AlunoEntity alunoEntity) {
		return embeddedEmbeddableRepository.save(alunoEntity);
	}

}
