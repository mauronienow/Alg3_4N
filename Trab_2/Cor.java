public class Cor {
	private static int Vermelho = 0;
	private static int Verde =1;
	private static int Azul = 2;

	private static int cor[] = new int[3];

	public static void Cor(int r, int g, int b){
	    cor[Vermelho]   = r;
	    cor[Verde] = g;
	    cor[Azul]  = b;
	}

	public int getVermelho() {
		return cor[Vermelho];
	}

	public  void setVermelho(int v) {
		cor[Vermelho] = v;
	}

	public  int getVerde() {
		return cor[Verde];
	}

	public  void setVerde(int v) {
		cor[Verde] = v;
	}

	public  int getAzul() {
		return cor[Azul];
	}

	public void setBLUE(int a) {
		cor[Azul] = a;
	}
}
 
