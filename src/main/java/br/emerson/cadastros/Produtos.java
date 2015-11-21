package br.emerson.cadastros;

import java.math.BigDecimal;

import br.emerson.enuns.Categoria;
import br.emerson.enuns.Unidade;

public class Produtos {
	private int id;
	private int codigobarras;
	private Categoria categoria;
	private String descrição;
	private Unidade unidade;
	private BigDecimal custo;
	private BigDecimal margemLucro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(int codigobarras) {
		this.codigobarras = codigobarras;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}

}
