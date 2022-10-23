package ProjetoGol;
import java.util.ArrayList;

public class SimularChutes {
	private String resultado="", lugar="";
	private int linhadefesa, colunadefesa, linhagol, colunagol, def=0, gol=0, cont;
	private Defesa montarDefesa;
	
	public SimularChutes(ArrayList<String> LocaldoGol, ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros, Chutesprop chutes[], Goleiro goleiros[]) {
		setResultado(LocaldoGol, ListaChutes, ListaGoleiros, chutes, goleiros);
	}

	//GERANDO RESULTADO
	public String getResultado() {
		return resultado;
	}
	public void setResultado(ArrayList<String> LocaldoGol, ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros, Chutesprop chutes[], Goleiro goleiros[]) {
		for(int i=0; i<26; i++) {
			goleiros[i]=(Goleiro) ListaGoleiros.get(i);
			for(int j=0; j<30; j++) {
				chutes[j]=(Chutesprop) ListaChutes.get(j);
				montarDefesa=new Defesa(goleiros[i], chutes[j], LocaldoGol);
				resultado+=montarDefesa.getAgarrar();
			}
//			for(int j=0; j<8; j++) {
//				for(int k=0; k<19; k++) {
//					for(int l=0; l<30; l++) {
//						if(chutes[l].getY()==j && chutes[l].getX()==k) {
//							if(chutes[l].getDefgol()==0) {
//								resultado+=" | * | ";
//								cont++;
//							} else {
//								resultado+=" | X | ";
//								cont++;
//							}
//						}
//						if(cont==0)
//							resultado+=" |   | ";
//						cont=0;
//					}
//				}
//				resultado+="\n";
//			}
		}
	}
}
