package ProjetoGol;

public class Goleiro {
	private String nome;
	private int id, velocidade, flexibilidade, agilidade, coordenacao, forca, equilibrio;
	private int AAG;
	
	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
		//RECEBENDO ATRIBUTOS DOS GOLEIROS
		setId(id);
		setNome(nome);
		setVelocidade(velocidade);
		setFlexibilidade(flexibilidade);
		setAgilidade(agilidade);
		setCoordenacao(coordenacao);
		setForca(forca);
		setEquilibrio(equilibrio);
		
		//CALCULANDO ÁREA DE ALCANCE;
		setAAG(velocidade, flexibilidade, agilidade, coordenacao, forca, equilibrio);
	}

	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//VELOCIDADE
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	//FLEXIBILIDADE
	public int getFlexibilidade() {
		return flexibilidade;
	}
	public void setFlexibilidade(int flexibilidade) {
		this.flexibilidade = flexibilidade;
	}

	//AGILIDADE
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	//COORDENAÇÃO
	public int getCoordenacao() {
		return coordenacao;
	}
	public void setCoordenacao(int coordenacao) {
		this.coordenacao = coordenacao;
	}

	//FORÇA
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	//EQUILIBRIO
	public int getEquilibrio() {
		return equilibrio;
	}
	public void setEquilibrio(int equilibrio) {
		this.equilibrio = equilibrio;
	}

	//CALCULANDO AREA DE ALCANCE
	public int getAAG() {
		return AAG;
	}
	public void setAAG(int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
		this.AAG=((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coordenacao*2)+forca+(equilibrio*2)/8);
	}
	
}
