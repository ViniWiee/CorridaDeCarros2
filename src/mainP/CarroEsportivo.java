package mainP;

public class CarroEsportivo extends VeiculoMotorizado {

	
	private String desenho[] = {"        __         \n",
									"      ~( @\\ \\   \n",
									"   _____]_[_/_>__   \n",
									"  / __ \\<> |  __ \\      \n",
									"=\\_/__\\_\\__|_/__\\_D\n"
									,"   (__)      (__)    \n \n"};
	
	private Roda rodas[]= {new Roda(), new Roda(), new Roda(), new Roda()};
	
	public CarroEsportivo() {
		super();
		this.setValorIpva(CalcularIpva());
		this.setDesenho(desenho);
		this.setRodas(rodas);
	}
	
	public void imprimeDesenho() {
		String aux = "";
		for(int i = 0; i < this.getDist() ;i++) {
			aux = "          " + aux;
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(aux + this.getDesenho()[i]);
		}
	}

	public boolean isAllCalib() {
		for(int i =0; i<4; i++) {
			if(rodas[i].isCalib() == false) {
				return false;
			}
		}	
		return true;
		
	}
	
	public double CalcularIpva() {
		return Ipva.valorInicial * Ipva.Ferrari;
	}
	
}
