public class Retangulo extends Shape {
 
	public Retangulo(Imagem imagem) {
		super(imagem);
		
	}

	private Reta reta;
	private Ponto p1,p2,p3,p4;
	
	public void setVertices(Ponto p0, Ponto p1) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = new Ponto(p2.getX(),p1.getY());
		this.p4 = new Ponto(p1.getX(), p2.getY());	
	 
	}
	public void draw(int cor) {

		reta.setVertices(p1, p3);
		reta.draw(cor);
		reta.setVertices(p3, p2);
		reta.draw(cor);
		reta.setVertices(p2, p4);
		reta.draw(cor);
		reta.setVertices(p4, p1); 
		reta.draw(cor);
	}
	 
}
 
