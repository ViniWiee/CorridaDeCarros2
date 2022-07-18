package mainP;
import java.util.Random;
public abstract class Veiculo{
	
	// Atributos do veiculo
	
	public static int quantidadeVeiculos = 0;
	private int id;
	private int qtrodas;
	private int dist;
	private boolean venda;
	private Roda rodas[];
	private String desenho[];
	
	
	// Método construtor do objeto veiculo
	public Veiculo() {
		this.dist = 0;
		Random r = new Random();
		this.venda = r.nextBoolean();
		setQuantidadeVeiculos(getQuantidadeVeiculos() + 1);
		this.id = getQuantidadeVeiculos();
		
	}
	
	
	// Método construtor do objeto Veiculo, porém, sem a necessidade de passar argumentos para criar o objeto.
	// Aqui fazemos uma sobrecarga do método construtor.
	
	
	public abstract void imprimeDesenho();
	public abstract boolean isAllCalib();


	static int getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}


	static void setQuantidadeVeiculos(int quantidadeVeiculos) {
		Veiculo.quantidadeVeiculos = quantidadeVeiculos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQtrodas() {
		return qtrodas;
	}


	public void setQtrodas(int qtrodas) {
		this.qtrodas = qtrodas;
	}


	public int getDist() {
		return dist;
	}


	public void setDist(int dist) {
		this.dist = dist;
	}


	public boolean isVenda() {
		return venda;
	}


	public void setVenda(boolean venda) {
		this.venda = venda;
	}


	public Roda[] getRodas() {
		return rodas;
	}


	public void setRodas(Roda[] rodas) {
		this.rodas = rodas;
	}


	public String[] getDesenho() {
		return desenho;
	}


	public void setDesenho(String[] desenho) {
		this.desenho = desenho;
	}
	
	
	
}
