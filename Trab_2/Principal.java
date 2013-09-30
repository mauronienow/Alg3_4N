import java.util.Scanner;


public class Principal {
	private static Imagem[][] imagem;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Ler=new Scanner(System.in);
		int largura;
		int altura;
		int cor=0;
		String comando="";
		
		
		
		
		do{
		
		System.out.println("Digite o comando desejado");
		comando=Ler.next();
	
			if (comando.equalsIgnoreCase("imagem")){
				System.out.println("informe a altura da imagem");
				altura=Ler.nextInt();
				System.out.println("informe a largura da imagem");
				largura=Ler.nextInt();
				imagem=new Imagem [altura][largura];
				
			} 
		
			
			//salvar
			if (comando.equalsIgnoreCase("salvar")){
				
				
			}
		
			//cor
			if (comando.equalsIgnoreCase("cor")){
			System.out.println("Iforme o tom de cinza (0 a 255)");
			cor=Ler.nextInt();
			
			}
		
		
		//circulo
			if (comando.equalsIgnoreCase("circulo")){
				Circulo circ = new Circulo(null);
				System.out.println("Digite o ponto central do circulo: x e y");
				int x = Ler.nextInt();
				int y = Ler.nextInt();
				Ponto ponto = new Ponto(x,y);
				circ.setCentro(ponto);
	    		System.out.println("Digite o valor do Raio Para Desenhar o circulo:");
	    		circ.setRaio(Ler.nextInt());	
	    		circ.draw(cor);
			}
			//reta
			if (comando.equalsIgnoreCase("reta")){
				Reta reta = new Reta(null);
				System.out.println("Informe os dados para a reta");
				System.out.println("X0");
				int x0=Ler.nextInt();
				System.out.println("Y0");
				int y0=Ler.nextInt();
	    		Ponto ponto1 = new Ponto(x0,y0);
	    		System.out.println("X1");
				int x1=Ler.nextInt();
				System.out.println("Y1");
				int y1=Ler.nextInt();
	    		Ponto ponto2 = new Ponto(x1, y1);
	    		reta.setVertices(ponto1, ponto2);
	    		reta.draw(cor);
				}
		
			//retangulo
			if (comando.equalsIgnoreCase("retangulo")){
				System.out.println("Informe os dados para o retangulo");
				Retangulo retangulo = new Retangulo(null);
				System.out.println("X0");
				int x0=Ler.nextInt();
				System.out.println("Y0");
				int y0=Ler.nextInt();
	    		Ponto ponto3 = new Ponto(x0,y0);
	    		System.out.println("X1");
				int x1=Ler.nextInt();
				System.out.println("Y1");
				int y1=Ler.nextInt();
	    		Ponto ponto4 = new Ponto(x1,y1);
	    		retangulo.setVertices(ponto3, ponto4);
	    		retangulo.draw(cor);
				}
		
			//triangulo
			if (comando.equalsIgnoreCase("triangulo")){
				System.out.println("Informe os vertices do trinagulo");
				Triangulo triangulo = new Triangulo(null);
				System.out.println("X0");
				int x0=Ler.nextInt();
				System.out.println("Y0");
				int y0=Ler.nextInt();
				Ponto ponto5 = new Ponto(x0,y0);
				System.out.println("X1");
				int x1=Ler.nextInt();
				System.out.println("Y1");
				int y1=Ler.nextInt();
				Ponto ponto6 = new Ponto(x1,y1);
	    		System.out.println("X2");
				int x2=Ler.nextInt();
				System.out.println("Y2");
				int y2=Ler.nextInt();
				Ponto ponto7 = new Ponto(x2,y2);
	    		triangulo.setVertices(ponto5, ponto6, ponto7);
	    		triangulo.draw(cor);
	    		}
		
		
			}while (!comando.equalsIgnoreCase("sair"));
	

	
		}
		
		
	}


