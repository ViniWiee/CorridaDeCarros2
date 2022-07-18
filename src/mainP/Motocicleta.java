package mainP;

public class Motocicleta extends VeiculoMotorizado implements Ipva{
	
	
	private String desenho[] = {"   ,_oo\n",
								".-/c-//::\n",
								"(_)'==(_)\n \n"};
	
	private Roda rodas[] = {new Roda(), new Roda()};
	
	public Motocicleta() {
		super();
		this.setDesenho(desenho);
		this.setRodas(rodas);
	}


	public void imprimeDesenho() {
		String aux = "";
		for(int i = 0; i < this.getDist(); i++) {
			aux = "   " + aux;
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(aux + this.getDesenho()[i]);
		}
	}

	
	public boolean isAllCalib() {
		for(int i =0; i<2; i++) {
			if(rodas[i].isCalib() == false) {
				return false;
			}
		}	
		return true;
	}


	public double CalcularIpva() {
		return Ipva.valorInicial * Ipva.Motocicleta;
	}
	
	protected double ValorIpva = CalcularIpva();

}
