package mainP;

import java.util.Random;

public abstract class VeiculoMotorizado extends Veiculo {

	private boolean ipva;
	private double combustivel = 3.5;
	private double ValorIpva;
	
	public VeiculoMotorizado() {
		super();
		Random r = new Random();
		this.ipva = r.nextBoolean();
	}
	
	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public boolean getIpva(){
		return this.ipva;
	}
	public void setIpva(boolean bol) {
		this.ipva = bol;
	}
	
	public abstract void imprimeDesenho();
	public abstract boolean isAllCalib();

	public double getValorIpva() {
		return ValorIpva;
	}

	public void setValorIpva(double valorIpva) {
		ValorIpva = valorIpva;
	}
	
	

}
