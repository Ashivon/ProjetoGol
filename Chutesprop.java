package ProjetoGol;
import java.util.ArrayList;

public class Chutesprop {
	private int forca, id, x, y, quadrante;
	private String chutouem="";
	private int chutouquadrante;
	private Regiao chutada;
	
	public Chutesprop(int id,  int x, int y, int forca, ArrayList<String> LocaldoGol) {
		setForca(forca);
		setId(id);
		setX(x);
		setY(y);
		setQuadrante(x, y);
		setChutouem(x, y, LocaldoGol);
	}
	
	//LUGAR DO GOL
	public String getChutouem() {
		return chutouem;
	}

	public void setChutouem(int x, int y, ArrayList<String> LocaldoGol) {
		chutada= new Regiao(LocaldoGol, x, y);
		chutouem=chutada.getSecao();
	}

	//RECEBENDO FORÇA E ID
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//RECEBENDO X e Y
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//RECEBENDO QUADRANTE
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
}