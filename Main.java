package ProjetoGol;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> LocaldoGol= new ArrayList<String>();
		ArrayList<Object> ListaChutes = new ArrayList<Object>();
		ArrayList<Object> ListaGoleiros =  new ArrayList<Object>();
		MontarRegioes montar =  new MontarRegioes(LocaldoGol, ListaChutes, ListaGoleiros);
		
		int foras=0, traves=0, travessoes=0, gols=0;
		int c, l;
		Regiao acertou;
		for(int i=0; i<9; i++) {
			for(int j=0; j<18; j++) {
				acertou=new Regiao(LocaldoGol, i, j);
				System.out.println("Acertou: "+acertou.getSecao());
				System.out.println("Quadrante: "+acertou.getQuadrante());
				foras+=acertou.getFora();
				traves+=acertou.getTrave();
				travessoes+=acertou.getTravessao();
				gols+=acertou.getGol();
			}
		}
		System.out.println("------ LOCAIS E QUANTIDADES ------");
		System.out.println("Foras: "+foras);
		System.out.println("Travessões: "+travessoes);
		System.out.println("Traves: "+traves);
		System.out.println("Gols: "+gols);
		
		Random gerarcoluna = new Random();
		Random gerarlinha = new Random();
		l=gerarlinha.nextInt(8);
		c=gerarcoluna.nextInt(17);
		
		System.out.println("linha: "+l+" coluna: "+c);
		acertou=new Regiao(LocaldoGol, l, c);
		
		System.out.println(acertou.getSecao()+"\n"+acertou.getQuadrante());
		
		SimularChutes testedegoleiro = new SimularChutes(LocaldoGol, ListaChutes, ListaGoleiros);
		System.out.println(testedegoleiro.getResultado());
	}
}
