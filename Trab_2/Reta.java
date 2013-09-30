public class Reta extends Shape {
	private int x0,y0,x1,y1;
	
	private Triangulo triangulo;
	private Retangulo retangulo;
	
	public Reta(Imagem imagem) {
		super(imagem);
	}
	
	public void setVertices(Ponto p0, Ponto p1) {
		x0 = p0.getX();
		y0 = p0.getY();
		x1 = p1.getX();
		y1 = p1.getY();
	}
	public void draw(int cor)
	{

	    int e2;
	    float dx = Math.abs(x1-x0);
	    float dy = Math.abs(y1-y0);

	    int sx = (x0 <= x1) ? 1 : -1; 
	    int sy = (y0 <= y1) ? 1 : -1; 

	    int err = (int) (dx - dy);

	    for (;;)
	    {	
	        imagem.setPixel(new Ponto(x0,y0),cor);

	        if ((x0 == x1) && (y0 == y1))
	            break;

	        e2 = err * 2;

	        if (e2 > -dy) {
	            err -= dy;
	            x0 += sx;
	        }

	        if (e2 < dx) {
	            err += dx;
	            y0 += sy;
	        }
	    }
	}
	 
}
 
