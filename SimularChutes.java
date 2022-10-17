package ProjetoGol;
import java.util.ArrayList;

public class SimularChutes {
	private String resultado="";
	private Goleiro goleiro;
	private Chutesprop chute;

	public SimularChutes(ArrayList<String> LocaldoGol, ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros) {
		setResultado(ListaChutes, ListaGoleiros);
	}

	//GERANDO RESULTADO
	public String getResultado() {
		return resultado;
	}
	public void setResultado(ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros) {
		for(int i=0; i<26; i++) {
			goleiro.equals(ListaGoleiros);
			for(int j=0; j<30; j++) {
				chute.equals(ListaChutes);
				if(goleiro.getForca()>=chute.getForca()) {
					resultado="Goleiro "+goleiro.getNome()+" agarrou chute-"+chute.getId()+"\n\n";
				}
			}
		}
	}
}
