package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

/*
 * Uma classe dro é criada contendo os dados que devem ser retornados
 * na reposta de uma requisição.
 * Nunca deve-se retornar um entity para não enviar dados que não devem serem retornados.
 *
 */
public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
			
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public static List<TopicoDto> converter(List<Topico> topicos){
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	public Long getId() {
		return id;
	}	
	public String getTitulo() {
		return titulo;
	}	
	public String getMensagem() {
		return mensagem;
	}
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
}
