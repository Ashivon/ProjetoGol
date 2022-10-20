package ProjetoGol;
import java.util.ArrayList;
import java.util.Random;

public class Defesa {
	private int areaGoleiro;
	private String agarrar="";
	private int linhadefesa, colunadefesa, contlinhas, contcolunas, auxlinhas=0;
	
	public Defesa(Goleiro goleiros, Chutesprop chutes, ArrayList<String> LocaldoGol) {
		setAgarrar(LocaldoGol, linhadefesa, colunadefesa, contcolunas, auxlinhas, goleiros, chutes);
	}
	
	//INICIANDO TENTATIVA DO GOLEIRO
	public String getAgarrar() {
		return agarrar;
	}
	public void setAgarrar(ArrayList<String> LocaldoGol, int linhadefesa, int colunadefesa, int contcolunas, int auxlinhas, Goleiro goleiros, Chutesprop chutes) {

		//GERANDO COORDENADAS ALEATÓRIAS
		Random gerarcoluna = new Random();
		Random gerarlinha = new Random();
				
		//1 QUADRANTE
		if(chutes.getQuadrante()==1) {	
			if(chutes.getX()>=0 && chutes.getX()<=4 && chutes.getY()>=0 && chutes.getY()<=8) {
				this.linhadefesa=gerarlinha.nextInt(4);
				this.colunadefesa=gerarcoluna.nextInt(8);
			}
		}
		//2 QUADRANTE
		if(chutes.getQuadrante()==2) {
			if(chutes.getX()>=0 && chutes.getX()<=4 && chutes.getY()>=9 && chutes.getY()<=17) {
				this.linhadefesa=gerarlinha.nextInt(4);
				this.colunadefesa=gerarcoluna.nextInt(8)+9;
			}
		}
		//3 QUADRANTE
		if(chutes.getQuadrante()==3) {
			if(chutes.getX()>=5 && chutes.getX()<=8 && chutes.getY()>=0 && chutes.getY()<=8) {
				this.linhadefesa=gerarlinha.nextInt(4)+5;
				this.colunadefesa=gerarcoluna.nextInt(8);
			}
		}
		//4 QUADRANTE
		if(chutes.getQuadrante()==4) {
			if(chutes.getX()>=5 && chutes.getX()<=8 && chutes.getY()>=9 && chutes.getY()<=17) {
				this.linhadefesa=gerarlinha.nextInt(4)+5;
				this.colunadefesa=gerarcoluna.nextInt(8)+9;
			}
		}
				
		//CRIANDO AREA DE ATUAÇÃO DO GOLEIRO
		for(int i=1; i<=goleiros.getAAG(); i++) {
			contlinhas++;
			if(goleiros.getAAG()%4==0) {
				this.contcolunas++;
				this.auxlinhas=contlinhas;
			}
		}
		//INICIANDO TENTATIVA
		if(this.auxlinhas>4) {
			if(chutes.getX()>=(this.linhadefesa-4) && chutes.getX()<=this.linhadefesa && chutes.getY()<=(this.colunadefesa+this.contcolunas) && chutes.getY()>=this.colunadefesa) {
				if(goleiros.getForca()>=chutes.getForca()) {
					agarrar+="Goleiro "+goleiros.getNome()+" agarrou\nChute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
				} else {
					agarrar+="Goleiro "+goleiros.getNome()+" não agarrou chute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
				}
			} else {
				agarrar+="Goleiro "+goleiros.getNome()+" não agarrou chute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
			}
		} else {
			if(chutes.getX()>=(this.linhadefesa-contlinhas) && chutes.getX()<=this.linhadefesa && chutes.getY()==this.colunadefesa) {
				if(goleiros.getForca()>=chutes.getForca()) {
					agarrar+="Goleiro "+goleiros.getNome()+" agarrou chute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
				} else {
					agarrar+="Goleiro "+goleiros.getNome()+" não agarrou chute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
				}
			} else {
				agarrar+="Goleiro "+goleiros.getNome()+" não agarrou chute-"+chutes.getId()+"\nNo "+chutes.getQuadrante()+"° quadrante\nCoordenadas: "+this.linhadefesa+"(linha) : "+this.colunadefesa+"(coluna)\nAcertou em: "+chutes.getChutouem()+"\n\n";
			}
		}
	}
}	