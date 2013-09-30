public class Circulo extends Shape {
	private Ponto ponto;
	private int raio;
	public Circulo(Imagem imagem) {
		super(imagem);
		// TODO Auto-generated constructor stub
	}
	public  void draw(int cor)
	{
	    float fact = (float) (Math.PI/180.0);
	    int ang;

	    for (ang=0; ang < 360; ++ang)
	    {
	    	int int_x = (int) Math.abs(Math.cos(ang * fact) * raio + ponto.getX());
		    int int_y = (int) Math.abs(Math.sin(ang * fact) * raio + ponto.getY());

	        imagem.setPixel(new Ponto(int_x, int_y),cor);
	    }
	}
	public void setCentro(Ponto p) {
		 this.ponto = ponto;
	 
	}
	 
	public void setRaio(int r) {
		this.raio=r;
	 
	}
	 
}