package ProjetoGol;

import java.util.ArrayList;

public class Regiao {
	private String secao;
	private int x, y;
	private int trave=0, gol=0, travessao=0, fora=0;
	private int quadrante;
	
	public Regiao(ArrayList<String> local, int x, int y) {
		setY(y);
		setX(x);
		setSecao(local, x, y);
		setQuadrante(x, y);
		
	}
	//Recebendo X
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	//Recebendo Y
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Gerando Região
	public String getSecao() {
		return secao;
	}
	public void setSecao(ArrayList local, int x, int y) {
		if(x>=2 && y>=2 && y<=15) {
			secao=(String) local.get(3);
			gol++;
		}
		if(x==0 || x==1 || y==0 || y==1 || y==16 || y==17) {
			if((y==1 && x>1) || (y==16 && x>1)) {
				secao=(String) local.get(1);
				trave++;
			}
			if(x==1 && y>=1 && y<=16) {
				secao=(String) local.get(2);
				travessao++;
			}
			if(x==0 || y==0 || y==17) {
				secao=(String) local.get(0);
				fora++;
			}
		}
	}
	
	//Gerando Quadrantes
	public int getQuadrante() {
		return quadrante;
	}
	public void setQuadrante(int x, int y) {
		//1 QUADRANTE
		if(x>=0 && x<=4 && y>=0 && y<=8)
			this.quadrante=1;
		//2 QUADRANTE
		if(x>=0 && x<=4 && y>=9 && y<=17)
			this.quadrante=2;
		//3 QUADRANTE
		if(x>=5 && x<=8 && y>=0 && y<=8)
			this.quadrante=3;
		//4 QUADRANTE
		if(x>=5 && x<=8 && y>=9 && y<=17)
			this.quadrante=4;
	}
	
	//Quantidade de locais
	public int getTrave() {
		return trave;
	}
	public int getGol() {
		return gol;
	}
	public int getTravessao() {
		return travessao;
	}
	public int getFora() {
		return fora;
	}
}
