package br.emerson.enuns;

public enum Estado {
	PR("Paran�"), SC("Santa Catarina"), RS("Rio Grande do Sul"), SP("S�o Paulo");

	private String nome;

	private Estado(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

}
