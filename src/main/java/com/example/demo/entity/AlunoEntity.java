package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Aluno")
public class AlunoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_aluno.", example = "123", required = true)
	@Column(name = "id_aluno", length = 9)
	private Integer id_aluno;
	
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "nome", length = 100)
	private String nome;
	
	
	@Schema(description = "idade.", example = "123", required = true)
	@Size(max = 2)
	@Column(name="idade", length = 100)
	private Integer idade;
	
	@Embedded
	private Endereco endereco;
	
	

}
