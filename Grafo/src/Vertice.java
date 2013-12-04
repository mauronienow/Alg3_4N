import java.util.ArrayList;

public class Vertice {
    private int vertice;
    private int custo = Integer.MAX_VALUE;
    private boolean visitado = false;
    private int precedente = -1;
    private ArrayList<Integer> verticesVizinhos = new ArrayList<Integer>();
    private ArrayList<Integer> peso = new ArrayList<Integer>();
    
    public int getcusto() {
        return custo;
    }

    public int getPrecedente() {
        return precedente;
    }

    public void setPrecedente(int precedente) {
        this.precedente = precedente;
    }

    public void setcusto(int custo) {
        this.custo = custo;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getvertice() {
        return vertice;
    }

    public void setvertice(int vertice) {
        this.vertice = vertice;
    }

    public ArrayList<Integer> getVerticeVizinhos() {
        return verticesVizinhos;
    }

    public void setVerticeVizinhos(int are) {
        this.verticesVizinhos.add(are);
    }

    public ArrayList<Integer> getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso.add(peso);
    }
    
}