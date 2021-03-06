package br.com.congregacao.model;

import java.time.LocalDate;
import java.util.List;

import br.com.congregacao.model.dao.ObjectDomain;

public class Pregador implements ObjectDomain{

	private long  id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private String email;
	private boolean status;
	private String numero;
	private String complemento;
	private String logradouro;
	private String cep;
	private String bairro;
	private Arquivo imagem;
	private TipoPregador tipoPregador;
	private Pais pais;
	private Estado estado;
	private List<TelefonePregador> telefones;

	public Pregador() {
	
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public List<TelefonePregador> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefonePregador> telefones) {
		this.telefones = telefones;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Arquivo getImagem() {
		return imagem;
	}

	public void setImagem(Arquivo imagem) {
		this.imagem = imagem;
	}

	public TipoPregador getTipoPregador() {
		return tipoPregador;
	}

	public void setTipoPregador(TipoPregador tipoPregador) {
		this.tipoPregador = tipoPregador;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pregador [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento="
				+ dataNascimento + ", email=" + email + ", status=" + status + ", numero=" + numero + ", complemento="
				+ complemento + ", logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", imagem="
				+ imagem + ", tipoPregador=" + tipoPregador + ", pais=" + pais + ", estado=" + estado + ", telefones="
				+ telefones + "]";
	}

	public Long getIdDoArquivoOuRetorneNull() {
		if( imagem == null )
			return null;
		return imagem.getId();
	}
	
	public long getIdDoTipoDePregador(){
		return tipoPregador.getId();
	}
	
	public long getIdDoPais(){
		return pais.getId();
	}

	public long getIdDoEstado(){
		return estado.getId();
	}

	
}

