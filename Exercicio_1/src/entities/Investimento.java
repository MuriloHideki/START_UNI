package entities;

public class Investimento {
	protected double valorInicial;
	public double jurosMensais;
	
	public Investimento() {
	}

	public Investimento(double valorInicial, double jurosMensais) {
		super();
		this.valorInicial = valorInicial;
		this.jurosMensais = jurosMensais;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getJurosMensais() {
		return jurosMensais;
	}

	public void setJurosMensais(double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}

	public double calcularLucro(int meses) {
		return (valorInicial * Math.pow((1 + (jurosMensais)/100), meses) - valorInicial);
	}

}
