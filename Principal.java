import java.util.ArrayList;
import java.util.Collections;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> cartas = new ArrayList();
		ArrayList<String> jogador1 = new ArrayList();
		ArrayList<String> jogador2 = new ArrayList();
		ArrayList<String> jogador3 = new ArrayList();
		ArrayList<String> jogador4 = new ArrayList();
		String descarte;
		
		String aux=" ";
		String aux1=" ";
		String aux3=" ";
		String jg1=" ";
		String jg2=" ";
		String jg3=" ";
		String jg4=" ";
		
		for (int i=0; i<9; i++){
			cartas.add("C"+(i+1));
			cartas.add("O"+(i+1));
			cartas.add("E"+(i+1));
			cartas.add("P"+(i+1));
		}
		
	
		
		cartas.add("CX");
		cartas.add("OX");
		cartas.add("EX");
		cartas.add("PX");
		cartas.add("CJ");
		cartas.add("OJ");
		cartas.add("EJ");
		cartas.add("PJ");
		cartas.add("CQ");
		cartas.add("OQ");
		cartas.add("EQ");
		cartas.add("PQ");
		cartas.add("CK");
		cartas.add("OK");
		cartas.add("EK");
		cartas.add("PK");
		
		for(String a:cartas){
			aux=aux + " " + a;
		}
				
		System.out.println("CARTAS DO BARALHO - "+ cartas.size()+ " CARTAS" + "\n " + aux  );
		
		Collections.shuffle(cartas);
		
		for(String b:cartas){
			aux1=aux1 + " " + b;
		}
		
		System.out.println("CARTAS DO EMBARALHADAS " + "\n " +aux1+"\n ");
		
		
		
		jogador1.add(cartas.get(0));
		jogador1.add(cartas.get(1));
		jogador1.add(cartas.get(2));
		jogador1.add(cartas.get(3));
		jogador1.add(cartas.get(4));
		
		jogador2.add(cartas.get(5));
		jogador2.add(cartas.get(6));
		jogador2.add(cartas.get(7));
		jogador2.add(cartas.get(8));
		jogador2.add(cartas.get(9));
		
		jogador3.add(cartas.get(10));
		jogador3.add(cartas.get(11));
		jogador3.add(cartas.get(12));
		jogador3.add(cartas.get(13));
		jogador3.add(cartas.get(14));
		
		jogador4.add(cartas.get(15));
		jogador4.add(cartas.get(16));
		jogador4.add(cartas.get(17));
		jogador4.add(cartas.get(18));
		jogador4.add(cartas.get(19));
		
		descarte=cartas.get(20);
		
		for(String c:jogador1){
			jg1=jg1 + " " + c;
		}
		for(String d:jogador2){
			jg2=jg2 + " " + d;
		}
		for(String e:jogador3){
			jg3=jg3 + " " + e;
		}
		for(String f:jogador4){
			jg4=jg4 + " " + f;
		}
		
		System.out.println("CARTAS INICIAS DE CADA JOGADOR");
		System.out.println("JOGADOR 1 " + jg1);
		System.out.println("JOGADOR 2 " + jg2);
		System.out.println("JOGADOR 3 " + jg3);
		System.out.println("JOGADOR 4 " + jg4);
		System.out.println("\n "+"CARTA INICIAL DA PILHA DE DESCARTE " + descarte);
		
		for (int i=0; i<21; i++) {
			cartas.remove(i);
			}
		
		for(String b:cartas){
			aux3=aux3 + " " + b;
		}
		
		System.out.println("\n "+"CARTAS DISPONIVEIS PARA COMPRA - " + cartas.size()+ " CARTAS" + "\n " +aux3);
		
		
		String vencedor = null;
		int jogvencedor = 0;
	
		System.out.println("\n " + "*** INICIO DO JOGO ***" + "\n ");
		
		do{
			String cartasjg1=" ";
			String cartasjg2=" ";
			String cartasjg3=" ";
			String cartasjg4=" ";
			int comprar;
			
			
			//JOGADOR 1
			int posjog1 = -1;	
			for (int i=0; i<jogador1.size(); i++) {
								
				if ((jogador1.get(i).charAt(0) ==descarte.charAt(0))||(jogador1.get(i).charAt(1) ==descarte.charAt(1))){
					posjog1=i;
				}
			}
			if(posjog1!=-1){
				descarte=jogador1.get(posjog1);
				jogador1.remove(posjog1);
				System.out.println("JOGADOR 1 DESCARTOU UMA CARTA"+ "\n ");
				int qtdjog1=jogador1.size();
					if(qtdjog1==0){
						jogvencedor=1;
						if (jogvencedor==1){
							vencedor="JOGADOR 1 É O VENCEDOR";
							}
						}
				}else{
					comprar=cartas.size();
					if(comprar==0){
						jogvencedor=1;
						vencedor="JOGO SEM VENCEDOR, SEM CARTAS NA PILHA DE COMPRA";
					}else{
					jogador1.add(cartas.get(0));
					cartas.remove(0);
					System.out.println("JOGADOR 1 COMPROU UMA CARTA"+ "\n ");
					}
				}
			for(String a:jogador1){
				cartasjg1=cartasjg1 + " " + a;
			}
			//System.out.println(cartasjg1);	
			
			//JOGADOR 2
			
			int posjog2 = -1;	
			for (int i=0; i<jogador2.size(); i++) {
								
				if ((jogador2.get(i).charAt(0) ==descarte.charAt(0))||(jogador2.get(i).charAt(1) ==descarte.charAt(1))){
					posjog2=i;
				}
			}
			if(posjog2!=-1){
				descarte=jogador2.get(posjog2);
				jogador2.remove(posjog2);
				System.out.println("JOGADOR 2 DESCARTOU UMA CARTA"+ "\n ");
				int qtdjog2=jogador2.size();
				
				if(qtdjog2==0){
					jogvencedor=1;
					if (jogvencedor==1){
						vencedor="JOGADOR 2 É O VENCEDOR";
					}
					}
				
				}else{
					comprar=cartas.size();
					if(comprar==0){
						jogvencedor=1;
						vencedor="JOGO SEM VENCEDOR, SEM CARTAS NA PILHA DE COMPRA";
					}else{
						jogador2.add(cartas.get(0));
						cartas.remove(0);
						System.out.println("JOGADOR 2 COMPROU UMA CARTA"+ "\n ");
					}
				}
			for(String a:jogador2){
				cartasjg2=cartasjg2 + " " + a;
			}	
			//System.out.println(cartasjg2);	
			
			
			//JOGADOR 3
			int posjog3 = -1;	
			for (int i=0; i<jogador3.size(); i++) {
								
				if ((jogador3.get(i).charAt(0) ==descarte.charAt(0))||(jogador3.get(i).charAt(1) ==descarte.charAt(1))){
					posjog3=i;
				}
			}
			if(posjog3!=-1){
				descarte=jogador3.get(posjog3);
				jogador3.remove(posjog3);
				System.out.println("JOGADOR 3 DESCARTOU UMA CARTA"+ "\n ");
				int qtdjog3=jogador3.size();
				
				if(qtdjog3==0){
					jogvencedor=1;
					if (jogvencedor==1){
						vencedor="JOGADOR 3 É O VENCEDOR";
					}
					}
				
				}else{
					comprar=cartas.size();
					if(comprar==0){
						jogvencedor=1;
						vencedor="JOGO SEM VENCEDOR, SEM CARTAS NA PILHA DE COMPRA";
					}else{
					jogador3.add(cartas.get(0));
					cartas.remove(0);
					System.out.println("JOGADOR 3 COMPROU UMA CARTA"+ "\n ");
					}
				}
			for(String a:jogador3){
				cartasjg3=cartasjg3 + " " + a;
			}	
			//System.out.println(cartasjg3);	
			
			
			//JOGADOR 4
			
			int posjog4 = -1;	
			for (int i=0; i<jogador4.size(); i++) {
								
				if ((jogador4.get(i).charAt(0) ==descarte.charAt(0))||(jogador4.get(i).charAt(1) ==descarte.charAt(1))){
					posjog3=i;
				}
			}
			if(posjog4!=-1){
				descarte=jogador4.get(posjog4);
				jogador4.remove(posjog4);
				System.out.println("JOGADOR 4 DESCARTOU UMA CARTA"+ "\n ");
				int qtdjog4=jogador4.size();
				
				if(qtdjog4==0){
					jogvencedor=1;
					if (jogvencedor==1){
						vencedor="JOGADOR 4 É O VENCEDOR";
					}
					}
				
				}else{
					comprar=cartas.size();
					if(comprar==0){
						jogvencedor=1;
						vencedor="JOGO SEM VENCEDOR, SEM CARTAS NA PILHA DE COMPRA";
					}else{
					jogador4.add(cartas.get(0));
					cartas.remove(0);
					System.out.println("JOGADOR 4 COMPROU UMA CARTA"+ "\n ");
					}
				}
			for(String a:jogador4){
				cartasjg4=cartasjg4 + " " + a;
			}
			//System.out.println(cartasjg4);	
			
			comprar=cartas.size();
			System.out.println( "\n "+"CARTAS DISPONÍVEIS PARA COMPRAR " + comprar + "\n ");
			
			if(comprar==0){
				jogvencedor=1;
				vencedor="JOGO SEM VENCEDOR, SEM CARTAS NA PILHA DE COMPRA";
				
			}
			
		}while (jogvencedor==0);
	
		System.out.println(vencedor );
		
		System.out.println("\n " + "*** FIM DO JOGO ***");
	
	}
}
