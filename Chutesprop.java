package ProjetoGol;

public class Chutesprop {
	private int forca, id, x, y;
	
	

	public Chutesprop(int id,  int x, int y, int forca) {
		setForca(forca);
		setId(id);
		setX(x);
		setY(y);
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
}