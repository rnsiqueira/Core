package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	private BigDecimal valor;
	@ManyToOne
	private Conta conta;

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@ManyToMany
	public List<Categoria> moviemntacoes;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public List<Categoria> getMoviemntacoes() {
		return moviemntacoes;
	}

	public void setMoviemntacoes(List<Categoria> moviemntacoes) {
		this.moviemntacoes = moviemntacoes;
	}


	 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + " Nome: " + nome + " Descrição: " + descricao + " Tipo: " + tipo + " Data: " + 
				data.getTime()
				+ " Valor: " + valor + " Conta: " + conta.getId();
	}

}
