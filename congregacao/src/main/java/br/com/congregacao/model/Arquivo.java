package br.com.congregacao.model;

import br.com.congregacao.model.dao.ObjectDomain;

public class Arquivo implements ObjectDomain{

	private long id;
	private String nome      = "";
	private String diretorio = "";
	private String extencao  = "";
	
	public Arquivo() {
		
	}
	
	public Arquivo(long id) {
		this.id = id;
	}



	public Arquivo(String nome, String diretorio, String extencao) {
		this.nome = nome;
		this.diretorio = diretorio;
		this.extencao = extencao;
	}
	
	public Arquivo(int id, String nome, String diretorio, String extencao) {
		this.id = id;
		this.nome = nome;
		this.diretorio = diretorio;
		this.extencao = extencao;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretorio() {
		return diretorio;
	}
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	public String getExtencao() {
		return extencao;
	}
	public void setExtencao(String extencao) {
		this.extencao = extencao;
	}
	

	@Override
	public String toString() {
		return "Arquivo [id=" + id + ", nome=" + nome + ", diretorio=" + diretorio + ", extencao=" + extencao + "]";
	}

	
		
	
}
