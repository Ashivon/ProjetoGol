package ProjetoGol;
import java.util.ArrayList;

public class MontarRegioes {
	public MontarRegioes(ArrayList<String> LocaldoGol, ArrayList<Object> ListaChutes, ArrayList<Object> ListaGoleiros) {
		Chutesprop chute;
		Goleiro goleiro;
		
		//MONTANDO REGIÕES DO GOL
		LocaldoGol.add(0, "FORA");
		LocaldoGol.add(1, "TRAVE");
		LocaldoGol.add(2, "TRAVESSÃO");
		LocaldoGol.add(3, "GOL");
		
		//MONTANDO REGIOES DOS CHUTES
		ListaChutes.add(0, chute=new Chutesprop(1, 4, 7, 2, LocaldoGol));
		ListaChutes.add(1, chute=new Chutesprop(2, 3, 6, 6, LocaldoGol));
		ListaChutes.add(2, chute=new Chutesprop(3, 4, 15, 9, LocaldoGol));
		ListaChutes.add(3, chute=new Chutesprop(4, 6, 11, 5, LocaldoGol));
		ListaChutes.add(4, chute=new Chutesprop(5, 8, 13, 3, LocaldoGol));
		ListaChutes.add(5, chute=new Chutesprop(6, 6, 4, 3, LocaldoGol));
		ListaChutes.add(6, chute=new Chutesprop(7, 5, 8, 4, LocaldoGol));
		ListaChutes.add(7, chute=new Chutesprop(8, 7, 14, 7, LocaldoGol));
		ListaChutes.add(8, chute=new Chutesprop(9, 7, 14, 8, LocaldoGol));
		ListaChutes.add(9, chute=new Chutesprop(10, 6, 12, 4, LocaldoGol));
		ListaChutes.add(10, chute=new Chutesprop(11, 5, 15, 2, LocaldoGol));
		ListaChutes.add(11, chute=new Chutesprop(12, 6, 4, 7, LocaldoGol));
		ListaChutes.add(12, chute=new Chutesprop(13, 8, 2, 3, LocaldoGol));
		ListaChutes.add(13, chute=new Chutesprop(14, 7, 10, 9, LocaldoGol));
		ListaChutes.add(14, chute=new Chutesprop(15, 7, 12, 10, LocaldoGol));
		ListaChutes.add(15, chute=new Chutesprop(16, 4, 2, 5, LocaldoGol));
		ListaChutes.add(16, chute=new Chutesprop(17, 5, 13, 3, LocaldoGol));
		ListaChutes.add(17, chute=new Chutesprop(18, 4, 16, 10, LocaldoGol));
		ListaChutes.add(18, chute=new Chutesprop(19, 5, 16, 10, LocaldoGol));
		ListaChutes.add(19, chute=new Chutesprop(20, 3, 14, 10, LocaldoGol));
		ListaChutes.add(20, chute=new Chutesprop(21, 1, 8, 9, LocaldoGol));
		ListaChutes.add(21, chute=new Chutesprop(22, 8, 16, 4, LocaldoGol));
		ListaChutes.add(22, chute=new Chutesprop(23, 6, 14, 8, LocaldoGol));
		ListaChutes.add(23, chute=new Chutesprop(24, 7, 11, 7, LocaldoGol));
		ListaChutes.add(24, chute=new Chutesprop(25, 0, 3, 6, LocaldoGol));
		ListaChutes.add(25, chute=new Chutesprop(26, 6, 7, 5, LocaldoGol));
		ListaChutes.add(26, chute=new Chutesprop(27, 8, 4, 3, LocaldoGol));
		ListaChutes.add(27, chute=new Chutesprop(28, 6, 7, 4, LocaldoGol));
		ListaChutes.add(28, chute=new Chutesprop(29, 2, 13, 10, LocaldoGol));
		ListaChutes.add(29, chute=new Chutesprop(30, 5, 3, 7, LocaldoGol));
		
		//MONTANDO GOLEIROS
		ListaGoleiros.add(0, goleiro=new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		ListaGoleiros.add(1, goleiro=new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10));
		ListaGoleiros.add(2, goleiro=new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7));
		ListaGoleiros.add(3, goleiro=new Goleiro(4, "Ajani Harding", 6, 6, 5, 7, 6, 6));
		ListaGoleiros.add(4, goleiro=new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10));
		ListaGoleiros.add(5, goleiro=new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6));
		ListaGoleiros.add(6, goleiro=new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8));
		ListaGoleiros.add(7, goleiro=new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5));
		ListaGoleiros.add(8, goleiro=new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6));
		ListaGoleiros.add(9, goleiro=new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5));
		ListaGoleiros.add(10, goleiro=new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8));
		ListaGoleiros.add(11, goleiro=new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6));
		ListaGoleiros.add(12, goleiro=new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9));
		ListaGoleiros.add(13, goleiro=new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7));
		ListaGoleiros.add(14, goleiro=new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6));
		ListaGoleiros.add(15, goleiro=new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5));
		ListaGoleiros.add(16, goleiro=new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10));
		ListaGoleiros.add(17, goleiro=new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7));
		ListaGoleiros.add(18, goleiro=new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9));
		ListaGoleiros.add(19, goleiro=new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10));
		ListaGoleiros.add(20, goleiro=new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7));
		ListaGoleiros.add(21, goleiro=new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9));
		ListaGoleiros.add(22, goleiro=new Goleiro(23, "Senichi Lorio", 7, 7, 5, 8, 10, 5));
		ListaGoleiros.add(23, goleiro=new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9));
		ListaGoleiros.add(24, goleiro=new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5));
		ListaGoleiros.add(25, goleiro=new Goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8));
	}
}
