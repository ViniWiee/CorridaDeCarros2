package mainP;

public class CarroPopular extends VeiculoMotorizado implements Ipva{
	

	private String desenho[] = {"    ____\n",
			" __/  |_ \\_\n",
			"|  _     _``-.  \n",
			"'-(_)---(_)--'\n\n\n"};
	

	private Roda rodas[] = {new Roda(), new Roda(), new Roda(), new Roda()};
	
	public CarroPopular() {
		super();
		this.setValorIpva(CalcularIpva());
		this.setDesenho(desenho);
		this.setRodas(rodas);
	}

	public void imprimeDesenho() {
		String aux = "";
		for(int i = 0; i < this.getDist();i++) {
			aux = "     " + aux;
		}
		for(int i = 0; i < 4; i++) {
			System.out.print(aux + this.getDesenho()[i]);
		}
	}

	public boolean isAllCalib() {
		for(int i =0; i<4; i++) {
			if(this.getRodas()[i].isCalib() == false) {
				return false;
			}
		}	
		return true;
		
	}

	public double CalcularIpva() {
		return Ipva.valorInicial * Ipva.CarroPopular;
	}
	
}
