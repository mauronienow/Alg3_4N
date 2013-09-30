public class Triangulo extends Shape {
	private Ponto p1;
	private Ponto p2;
	private Ponto p3;
	
	public Triangulo(Imagem imagem) {
		super(imagem);
	}

	private Reta reta;
	 
	public void setVertices(Ponto p0, Ponto p1, Ponto p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;	 
	}
	public void draw(int cor) {

		reta.setVertices(p1, p2);
		reta.draw(cor);
		reta.setVertices(p2, p3);
		reta.draw(cor);
		reta.setVertices(p3, p1);
		reta.draw(cor);
	}
	 
}
 
