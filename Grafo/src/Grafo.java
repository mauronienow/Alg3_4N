import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class Grafo {
	
		private String arquivo;
	    private Scanner Ler=new Scanner(System.in);
	    private ArrayList<Vertice> grafo = new ArrayList<Vertice>();
	    private ArrayList<Integer> caminho = new ArrayList<Integer>();
	    private int verticeExiste = -1;
	    private int vizinhoExiste = -1;

	    public void setLocalArquivo(String arquivo){
	    	this.arquivo=arquivo;
	    }

	    public void criarGrafo() throws FileNotFoundException, IOException {
	    	this.Ler = new Scanner(new FileReader(arquivo));
	    	
	    	String idVertice, vizinho;
	    	int origem;
	    	int destino;
	    	int peso=0;
	    	
	        idVertice = Ler.next();
	        origem=Ler.nextInt();
	        destino=Ler.nextInt();
	        
	        Vertice ver = new Vertice();
	        ver.setvertice(origem);
	        vizinho = Ler.next();
	        this.vizinhoExiste = vizinhoExiste(Integer.parseInt(vizinho));
	        if (this.vizinhoExiste == -1) {
	            Vertice ver3 = new Vertice();

	           ver3.setvertice(Integer.parseInt(vizinho));

	            grafo.add(ver3);
	        }
	        ver.setVerticeVizinhos(destino);
	        ver.setPeso(peso);

	        grafo.add(ver);

	        while (Ler.hasNext()) {
	            origem=Ler.nextInt();
		        destino=Ler.nextInt();

	            this.verticeExiste = verticeExiste(origem);
	            if (this.verticeExiste != -1) {
	                
	                vizinhoExiste = vizinhoExiste(destino);
	                if (vizinhoExiste == -1) {
	                    Vertice ver4 = new Vertice();

	                    ver4.setvertice(destino);

	                    grafo.add(ver4);
	                }
	                grafo.get(this.verticeExiste).setVerticeVizinhos(destino);
	                grafo.get(this.verticeExiste).setPeso(peso);
	            } else {
	                Vertice ver1 = new Vertice();
	                ver1.setvertice(origem);
	                
	                this.vizinhoExiste = vizinhoExiste(destino);
	                if (this.vizinhoExiste == -1) {
	                    Vertice ver5 = new Vertice();

	                    ver5.setvertice(destino);

	                    grafo.add(ver5);
	                }
	                ver1.setVerticeVizinhos(destino);
	                ver1.setPeso(peso);
	                grafo.add(ver1);
	            }
	        }
	    }

	    public int verticeExiste(int nodo) {
	        this.verticeExiste = -1;
	        for (int i = 0; i < grafo.size(); i++) {
	            if (grafo.get(i).getvertice() == nodo) {
	                this.verticeExiste = i;
	                break;
	            }
	        }
	        return this.verticeExiste;
	    }
	    
	    public int vizinhoExiste(int nodo) {
	        this.vizinhoExiste = -1;
	        for (int i = 0; i < grafo.size(); i++) {
	            if (grafo.get(i).getvertice() == nodo) {
	                this.vizinhoExiste = i;
	                break;
	            }
	        }
	        return this.vizinhoExiste;
	    }
    public void Dijkstra() {
	        int existeNaoVisitado;
	        int menorNaoVisitada = Integer.MAX_VALUE;
	        do {
	            existeNaoVisitado = 0;

	            for (int i = 0; i < grafo.size(); i++) {
	                if (grafo.get(i).getcusto() <= menorNaoVisitada && (grafo.get(i).isVisitado() == false)) {
	                    menorNaoVisitada = grafo.get(i).getcusto();
	                }
	            }

	            for (int i = 0; i < grafo.size(); i++) {
	                if (grafo.get(i).getcusto() == menorNaoVisitada && (grafo.get(i).isVisitado() == false)) {
	                    grafo.get(i).setVisitado(true);

	                    for (int j = 0; j < grafo.get(i).getVerticeVizinhos().size(); j++) {
	                        int id = grafo.get(i).getVerticeVizinhos().get(j);
	                        
	                        for(int k = 0; k < grafo.size(); k++){
	                            if(grafo.get(k).getvertice() == id){
	                                id = k;
	                                break;
	                            }
	                        }
	                        
	                        int soma = grafo.get(i).getcusto() + grafo.get(i).getPeso().get(j);
	                        if(soma < 0){
	                            soma = Integer.MAX_VALUE;
	                        }
	                        
	                        if (grafo.get(id).getcusto() > soma) {
	                            grafo.get(id).setcusto(grafo.get(i).getcusto() + grafo.get(i).getPeso().get(j));
	                            grafo.get(id).setPrecedente(grafo.get(i).getvertice());
	                        }
	                    }
	                    menorNaoVisitada = Integer.MAX_VALUE;
	                    break;
	                }
	            }

	            for (int i = 0; i < grafo.size(); i++) {
	                if (!grafo.get(i).isVisitado()) {
	                    existeNaoVisitado++;
	                }
	            }

	        } while (existeNaoVisitado != 0);
	    }

	    public String menorCaminho(int de, int para) {
	        String menorCaminho = de + " > ";
	        
	        this.caminho.add(para);

	        for (int i = 0; i < this.grafo.size(); i++) {
	            if (this.grafo.get(i).getvertice() == para && para != de) {
	                
	               	this.caminho.add(this.grafo.get(i).getPrecedente());
	                
	                para = this.grafo.get(i).getPrecedente();
	                //i = 0;
	               
	                
	            }
	        }

	        for (int i = caminho.size() - 1; i >= 0; i--) {
	            menorCaminho = menorCaminho + this.caminho.get(i);
	            if(i != 0){
	                 menorCaminho = menorCaminho + " > ";
	            }
	        }

	        return menorCaminho;
	    }
	    
	    public String menorCaminho1(int de, int para) {
	        String menorCaminho = de + " > ";
	        String menorCaminho1 = de + " > ";
	        this.caminho.add(para);

	        for (int i = 0; i < this.grafo.size(); i++) {
	            if (this.grafo.get(i).getvertice() == para && para != de) {
	                
	                para = this.grafo.get(i).getPrecedente();
	               
	                menorCaminho1=menorCaminho1+this.grafo.get(i).getPrecedente();
	                
	            }
	        }

	        for (int i = caminho.size() - 1; i >= 0; i--) {
	            menorCaminho = menorCaminho + this.caminho.get(i);
	            if(i != 0){
	                 menorCaminho = menorCaminho + " > ";
	            }
	        }

	        return menorCaminho1;
	    }
	}