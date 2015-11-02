package br.emerson.enuns;

public enum Estado {
	PR("Paraná"), SC("Santa Catarina"), RS("Rio Grande do Sul"), SP("São Paulo");

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
