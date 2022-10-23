package ProjetoGol;
import java.util.ArrayList;

public class VerificarGoleiros {
	private Goleiro guardargoleiro;
	private String melhorGoleiro, apresentar="";
	private int chutesporgoleiro[]=new int[26];
	private int chutesmelhorgoleiro;
	
	public VerificarGoleiros(Goleiro[] goleiros) {
		setMelhorGoleiro(goleiros);
	}
	
	public String getMelhorGoleiro() {
		return melhorGoleiro;
	}
	public void setMelhorGoleiro(Goleiro[] goleiros) {
		for(int i=0; i<26; i++) {
			chutesporgoleiro[i]=goleiros[i].getChutesagarrados();
			if(i>0) {
				if(guardargoleiro.getChutesagarrados()<goleiros[i].getChutesagarrados()) {
					melhorGoleiro=goleiros[i].getNome();
					chutesmelhorgoleiro=goleiros[i].getChutesagarrados();
					guardargoleiro=goleiros[i];
				}
			} else {
				melhorGoleiro=goleiros[i].getNome();
				chutesporgoleiro[i]=goleiros[i].getChutesagarrados();
				guardargoleiro=goleiros[i];
			}
			apresentar+="\n\nO goleiro: "+goleiros[i].getNome()+"\nAgarrou: "+chutesporgoleiro[i]+" chutes.";
		}
		apresentar+="\n\nO MELHOR GOLEIRO É: "+melhorGoleiro+"\nAgarrou: "+chutesmelhorgoleiro+" chutes!";
	}
	
	public String getApresentar() {
		return apresentar;
	}
}
