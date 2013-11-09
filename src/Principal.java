import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Principal {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Arvore RBT = new Arvore ();
		int opcao = 0;
		System.out.println("Informe o caminho para ler o arquivo e seu nome");
		String caminho=ler.next();
		
		
		 FileInputStream fstream = new FileInputStream(caminho);
	        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

	        String linha;

	        while ((linha = br.readLine()) != null)   {
	            String valor[];
	            valor = linha.split("=");
	            RBT.inserir(Integer.parseInt(valor[0]),valor[1]);
	            
	        }
	      
	        br.close();
	        
	        System.out.println("Informe a opção desejada:" + "\n"+
    	 			"1 - Inserir um nodo" + "\n" + 
    	 			"2 - Buscar um nodo"+ "\n" +
    	 			"3 - Excluir um nodo"+ "\n" +
    	 			"4 - sair");
        	opcao=ler.nextInt();
        	
	        do{
	        	
	        	switch (opcao){
	        	
	        	case 1:
	        		System.out.println("Digite a chave:");
	        		int chave=ler.nextInt();	        		
	        		System.out.println("Digite o valor:");
	        		String valor=ler.next();
	        		RBT.inserir(chave,valor);
	        		break;
	        	case 2:
	        		System.out.println("Digite a chave que deseja buscar:");
	        		int chave1=ler.nextInt();
	        		RBT.busca(RBT.Raiz,chave1 );
	        		break;
	        	case 3:
	        		System.out.println("Digite a chave que deseja excluir:");
	        		int chave3=ler.nextInt();
	        		try{
	        		RBT.removeNo(RBT.Raiz,chave3 );
	        		System.out.println("chave romovida");
	        		}catch (Exception e){
	        			System.out.println(e.getMessage());
	        		}
	        		break;
	        	
	        	default:
	        		 System.out.println("Opção inválida.");
	        	
	        	
	        	}
	        	System.out.println("Informe a opção desejada:" + "\n"+
	    	 			"1 - Inserir um nodo" + "\n" + 
	    	 			"2 - Buscar um nodo"+ "\n" +
	    	 			"3 - Excluir um nodo"+ "\n" +
	    	 			"4 - sair");
	        	opcao=ler.nextInt();
	        		        	
	        }while (opcao!=4);
	       
	        
	      
	    }
	
		

	}


