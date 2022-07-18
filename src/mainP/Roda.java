package mainP;

import java.io.Serializable;
import java.util.Random;

public class Roda implements Serializable {
	
	// Atributos da classe roda

	private static final long serialVersionUID = 1L;
	private boolean calib;
	
	// Método construtor do objeto roda
	
	public Roda() {
		// Criando o objeto R da classe Random para randomizar parametros
		Random r = new Random();
		
		this.calib = r.nextBoolean(); 
	
	}

	
	// Getters and Setters da classe roda. Repare que o getter é isCalib, que retorna um booleano.
	
	
	public boolean isCalib() {
		return calib;
	}

	public void setCalib(boolean calib) {
		this.calib = calib;
	}

	
}
