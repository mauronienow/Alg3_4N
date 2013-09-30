import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Imagem {
 
	private Shape shape;
	private int width;
	private int height;
	private int[][] imagem;
	
	
	public Imagem(int width, int height){
	    this.width = width;
	    this.height = height;
	    this.imagem = new int[width][height];
	  }
	
	public void setPixel(Ponto p, int cor) {
		int x = p.getX();
		int y = p.getY();
		
		this.imagem[x][y]=cor;

		
	 
	}
	 
	public void setShape(Shape s, Cor c) {
		
	 
	}
	public void salvar(){
		int x,y;
		try {
			File file = new File( "c:/imagem.ppm");
			FileWriter fw = new FileWriter(file, true);

			BufferedWriter bw = new BufferedWriter(fw);
			if(file.exists()){

				
			bw.write("P2\n");
			bw.write(this.width +" "+ this.height +"\n" );
			bw.write("255\n");
			for(x = 0 ; x < this.width ; x++){	
					for( y = 0 ; y < this.height ; y++){	
							bw.write(imagem[x][y]+" ");
							bw.write("\n");
						}

					}
				
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	 
}
 
