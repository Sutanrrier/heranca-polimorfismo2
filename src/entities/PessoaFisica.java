package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto() {
		double valorImposto = 0.0; //Valor do imposto a ser calculado;
		if (rendaAnual < 20000) {
			if (gastosSaude > 0) {
				valorImposto = (rendaAnual * 0.15) - (gastosSaude * 0.5);
			}
			else {
				valorImposto = (rendaAnual * 0.15);
			}
		}
		else {
			if (gastosSaude > 0) {
				valorImposto = (rendaAnual * 0.25) - (gastosSaude * 0.5);
			}
			else {
				valorImposto = (rendaAnual * 0.25);
			}
		}
		return valorImposto;	
	}
	
}
