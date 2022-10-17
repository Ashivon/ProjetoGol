package ProjetoGol;
import java.util.ArrayList;

public class MontarRegioes {
	public MontarRegioes(ArrayList<String> local, ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros) {
		Chutesprop chute;
		Goleiro goleiro;
		
		//MONTANDO REGIÕES DO GOL
		local.add(0, "FORA");
		local.add(1, "TRAVE");
		local.add(2, "TRAVESSÃO");
		local.add(3, "GOL");
		
		//MONTANDO REGIOES DOS CHUTES
		ListaChutes.add(0, chute=new Chutesprop(1, 4, 7, 2));
		ListaChutes.add(1, chute=new Chutesprop(2, 4, 7, 2));
		ListaChutes.add(2, chute=new Chutesprop(3, 4, 7, 2));
		ListaChutes.add(3, chute=new Chutesprop(4, 4, 7, 2));
		ListaChutes.add(4, chute=new Chutesprop(5, 4, 7, 2));
		ListaChutes.add(5, chute=new Chutesprop(6, 4, 7, 2));
		ListaChutes.add(6, chute=new Chutesprop(7, 4, 7, 2));
		ListaChutes.add(7, chute=new Chutesprop(8, 4, 7, 2));
		ListaChutes.add(8, chute=new Chutesprop(9, 4, 7, 2));
		ListaChutes.add(9, chute=new Chutesprop(10, 4, 7, 2));
		ListaChutes.add(10, chute=new Chutesprop(11, 4, 7, 2));
		ListaChutes.add(11, chute=new Chutesprop(12, 4, 7, 2));
		ListaChutes.add(12, chute=new Chutesprop(13, 4, 7, 2));
		ListaChutes.add(13, chute=new Chutesprop(14, 4, 7, 2));
		ListaChutes.add(14, chute=new Chutesprop(15, 4, 7, 2));
		ListaChutes.add(15, chute=new Chutesprop(16, 4, 7, 2));
		ListaChutes.add(16, chute=new Chutesprop(17, 4, 7, 2));
		ListaChutes.add(17, chute=new Chutesprop(18, 4, 7, 2));
		ListaChutes.add(18, chute=new Chutesprop(19, 4, 7, 2));
		ListaChutes.add(19, chute=new Chutesprop(20, 4, 7, 2));
		ListaChutes.add(20, chute=new Chutesprop(21, 4, 7, 2));
		ListaChutes.add(21, chute=new Chutesprop(22, 4, 7, 2));
		ListaChutes.add(22, chute=new Chutesprop(23, 4, 7, 2));
		ListaChutes.add(23, chute=new Chutesprop(24, 4, 7, 2));
		ListaChutes.add(24, chute=new Chutesprop(25, 4, 7, 2));
		ListaChutes.add(25, chute=new Chutesprop(26, 4, 7, 2));
		ListaChutes.add(26, chute=new Chutesprop(27, 4, 7, 2));
		ListaChutes.add(27, chute=new Chutesprop(28, 4, 7, 2));
		ListaChutes.add(28, chute=new Chutesprop(29, 4, 7, 2));
		ListaChutes.add(29, chute=new Chutesprop(30, 4, 7, 2));
		
		//MONTANDO GOLEIROS
		ListaGoleiros.add(0, goleiro=new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(1, goleiro=new Goleiro(2, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(2, goleiro=new Goleiro(3, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(3, goleiro=new Goleiro(4, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(4, goleiro=new Goleiro(5, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(5, goleiro=new Goleiro(6, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(6, goleiro=new Goleiro(7, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(7, goleiro=new Goleiro(8, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(8, goleiro=new Goleiro(9, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(9, goleiro=new Goleiro(10, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(10, goleiro=new Goleiro(11, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(11, goleiro=new Goleiro(12, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(12, goleiro=new Goleiro(13, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(13, goleiro=new Goleiro(14, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(14, goleiro=new Goleiro(15, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(15, goleiro=new Goleiro(16, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(16, goleiro=new Goleiro(17, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(17, goleiro=new Goleiro(18, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(18, goleiro=new Goleiro(19, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(19, goleiro=new Goleiro(20, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(20, goleiro=new Goleiro(21, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(21, goleiro=new Goleiro(22, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(22, goleiro=new Goleiro(23, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(23, goleiro=new Goleiro(24, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(24, goleiro=new Goleiro(25, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(25, goleiro=new Goleiro(26, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
	}
}
