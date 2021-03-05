package entities;

public class InvestimentoComIR extends Investimento {
	public InvestimentoComIR(double valorInicial, double jurosMensais, double result) {
		super(valorInicial, jurosMensais);
	}
	
	
	public double calcularLucroIR(int meses) {
		
		if(meses < 6) {
			return (0.225*(valorInicial * Math.pow((1 + (jurosMensais)/100), meses) - valorInicial));
		}else if(meses >= 6 && meses < 12) {
			return (0.20*(valorInicial * Math.pow((1 + (jurosMensais)/100), meses) - valorInicial));
		}else if(meses >= 12 && meses < 24) {
			return (0.175*(valorInicial * Math.pow((1 + (jurosMensais)/100), meses) - valorInicial));
		}else{
			return (0.15*(valorInicial * Math.pow((1 + (jurosMensais)/100), meses) - valorInicial));
		}
		
	}
	
}