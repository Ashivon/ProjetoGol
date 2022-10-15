package ProjetoGol;
import java.util.ArrayList;
import java.util.Random;

public class Chute {
	private String chutouem="";
	private int chutouquadrante;
	
	public Chute (ArrayList<String> LocaldoGol, int x, int y) {
		Regiao chutada = new Regiao(LocaldoGol, x, y);
		setChutouem(chutada);
	}
	
	//COORDENADAS
	public String getChutouem() {
		return chutouem;
	}
	public void setChutouem(Regiao chutada) {
		chutouem = chutada.getSecao();
	}

	//QUADRANTE
	public int getChutouquadrante() {
		return chutouquadrante;
	}
	public void setChutouquadrante(Regiao chutada) {
		chutouquadrante = chutada.getQuadrante();
	}
}
