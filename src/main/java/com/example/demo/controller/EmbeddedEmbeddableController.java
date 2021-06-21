package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AlunoEntity;
import com.example.demo.service.EmbeddedEmbeddableService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Validated
@RequestMapping("/api/EmbeddedEmbeddable")
@Tag(name = "Embedded Embeddable Controller", description = "Embedded Embeddable crud API")
public class EmbeddedEmbeddableController {
	
	@Autowired
	private EmbeddedEmbeddableService embeddedEmbeddableService;
	
	@Operation(summary = "Busca todos os EmbeddedEmbeddable", description = "Busca todos os EmbeddedEmbeddable", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, EmbeddedEmbeddable encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum EmbeddedEmbeddable encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<AlunoEntity>> buscaTodos() {

		return new ResponseEntity<List<AlunoEntity>>(embeddedEmbeddableService.buscaTodasEmbeddedEmbeddable(), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de EmbeddedEmbeddable", description = "Cadastro de EmbeddedEmbeddable", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, EmbeddedEmbeddable cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, EmbeddedEmbeddable não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "cadastro", produces = { "application/json", "application/xml" })
	public ResponseEntity<AlunoEntity> cadastroEmbeddedEmbeddable(@RequestBody @Valid AlunoEntity alunoEntity) throws Exception {

		return new ResponseEntity<AlunoEntity>(embeddedEmbeddableService.cadastroEmbeddedEmbeddable(alunoEntity), HttpStatus.OK);
	}

}
