import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
        Grafo gra = new Grafo();
        int de;
        int para;
        System.out.print("Digite o local e nome do arquivo para leitura ");
        String arquivo=Ler.next();
        
        gra.setLocalArquivo(arquivo);
        
        try{
        	gra.criarGrafo();
        }catch (Exception e){
        	System.out.print(e.getMessage());
        }
        System.out.print("Digite o vertice de partida: ");
        de = Ler.nextInt();
        System.out.print("Digite o vertice de destino: ");
        para = Ler.nextInt();
        System.out.print("\n");
        
             
        gra.Dijkstra();
        
        System.out.println(gra.menorCaminho(de, para));
        System.out.println(gra.menorCaminho1(de, para));
    }
		

	

}
