package com.example.demo.entity;

import javax.persistence.Column;
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
@Table(name = "Cidade")
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_Cidade.", example = "123", required = true)
	@Column(name = "id_Cidade", length = 9)
	private Integer id_Cidade;
	
	
	@Schema(description = "Nome Cidade.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "NomeCidade", length = 100)
	private String NomeCidade;
	

}
