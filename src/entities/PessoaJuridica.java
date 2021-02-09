package entities;

public class PessoaJuridica extends Pessoa {
	private int numFunc;
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String name, Double rendaAnual, int numFunc) {
		super(name, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}
	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public Double imposto() {
		double valorImposto = 0.0; //Valor do imposto a ser calculado;
		if (numFunc > 10) {
			valorImposto = (rendaAnual * 0.14);
		}
		else {
			valorImposto = (rendaAnual * 0.16);
		}
		return valorImposto;	
	}

}
