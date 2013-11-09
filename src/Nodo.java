
public class Nodo {
    
    public int chave;
    public String valor;
    public Nodo esq, dir,pai;
    public int n;
    boolean cor;//preto = true
    

    public Nodo(int chave,String valor,boolean cor){
        this.chave                  =   chave;
        this.valor                  =   valor; 
        this.cor                    =   cor; 
    }
	

}
