package mainP;

public class Bike extends Veiculo {
	
	private Roda rodas[] = {new Roda(), new Roda()};
	private String desenho[] = {"   __o\n",
								" _`\\<,_\n", 
								"(*)/ (*)\n\n"};
	
	public Bike() {
		super();
		this.setDesenho(desenho);
		this.setRodas(rodas);
		
	}

	public void imprimeDesenho() {
		String aux = "";
		for(int i = 0; i < this.getDist();i++) {
			aux = "  " + aux;
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

}
