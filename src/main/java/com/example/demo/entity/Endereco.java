package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@Table(name = "Endereco")
public class Endereco {
	
	@Schema(description = "rua.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "rua", length = 100)
	private String rua;
	
	@Schema(description = "Numero.", example = "123", required = true)
	@Size(max = 50)
	@Column(name = "Numero", length = 100)
	private Integer Numero;
	
	@Schema(description = "Complemento.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "Complemento", length = 100)
	private String Complemento;
	
	@ManyToOne
	private Cidade cidade;
	

}
