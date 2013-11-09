
public class Arvore {

	public Nodo Raiz;
		
	public Arvore(){
        this.Raiz=null;
    }
	
	 public void inserir(int chave,String val){
	        if(this.Raiz == null){
	            this.Raiz = new Nodo(chave,val,true);
	            this.Raiz.pai = null;
	        }else{
	            inserirValor(this.Raiz,chave,val);
	            System.out.println("chave inserida");
	       }
	 }
	 
	 private void inserirValor(Nodo no,int chave,String val){
	        if(chave < no.chave){
	           if(no.esq == null){
	               no.esq = new Nodo(chave,val,false);
	               no.esq.pai = no;
	               ValidaInsercao1(no);
	           }else{
	               inserirValor(no.esq,chave,val);
	           } 
	        }else if(chave > no.chave){
	            if(no.dir == null){
	               no.dir = new Nodo(chave,val,true);
	               no.dir.pai = no; 
	               ValidaInsercao1(no);
	           }else{
	               inserirValor(no.dir,chave,val);
	           }
	        }
	    }
	 
	 public void busca(Nodo no,int chave){
	        
	        if(chave == this.Raiz.chave){
	            System.out.println("sou a raiz ");
	        }else{
	            if(chave == no.chave){
	                System.out.println("achei: "+no.chave +" \nminha cor e: "+no.cor+" \nmeu valor e: "+no.valor+
	                		" \nmeu pai e: "+no.pai.chave);
	            }else{
	                if(chave > no.chave){
	                    busca(no.dir,chave);
	                }else if(chave < no.chave){
	                    busca(no.esq,chave);
	                }
	            }
	        }
	    }
	 
	private Nodo getTio(Nodo no){
	        
	        if(no.pai != null && no.pai.pai == null){
	            if(no.pai.esq == no){
	                return no.dir;
	            }else{
	                return no.esq;
	            }
	        }else if(no.pai != null && no.pai.pai != null){
	            if(no.pai.pai.esq == no.pai){
	                return no.pai.pai.dir;
	            }else{
	                return no.pai.pai.esq;
	                
	            }
	        }else{
	            return null;
	        }
	        
	    }
	 
	   private void trocaNodo(Nodo velho,Nodo novo){
	        if(velho.pai == null){
	            this.Raiz = novo;
	        }else{
	            if(velho == velho.pai.esq){
	                velho.pai.esq = novo;
	            }else{
	                velho.pai.dir = novo;
	            }
	        }
	        if(novo != null){
	            novo.pai = velho.pai;
	        }
	    }
	
	   //valida primeiro caso
	   private void ValidaInsercao1(Nodo no){
		   	if(no.pai == null){
				no.cor = true;
			}else{
				ValidaInsercao2(no);
			}
	   }
	   //valida segundo caso
	   private void ValidaInsercao2(Nodo no){
		   	if (no.pai.cor=true){
			
		   	}else{
		   		ValidaInsercao3(no);
		   	}
	   }
	   //valida terceiro caso
		private void ValidaInsercao3(Nodo no){
			if(getTio(no).cor == false){
	            no.pai.cor = true;
	            getTio(no).cor = true;
	            if(no.pai.pai != null){
	                no.pai.pai.cor = false;
	            }
			}else {
				ValidaInsercao4(no);
			}
		}
		
		//valida quarto caso	
		private void ValidaInsercao4(Nodo no){
			if(no == no.pai.dir && no.pai == no.pai.pai.esq){
	            rotacionaEsq(no.pai);
	            no = no.esq;
	        }else if(no == no.pai.esq && no.pai == no.pai.pai.dir){
	            rotacionaDir(no.pai);
	            no = no.dir;
	        	}
			ValidaInsercao5(no);
		}
		//valida quinto caso
		private void ValidaInsercao5(Nodo no){
			no.pai.cor = true;
			getTio(no).cor = false;
			if(no == no.pai.esq && no.pai ==no.pai.pai.esq){
				rotacionaDir(no.pai.pai);
			}else{
	      	 if(no == no.pai.dir && no.pai == no.pai.pai.dir){
	      	 	rotacionaEsq(no.pai.pai);
	      	 }
			}
		}
	   

		
		private void rotacionaDir(Nodo no){
	        Nodo n = no.esq;
	        trocaNodo(no, n);
	        no.esq = n.dir;
	        if(n.dir != null){
	            n.dir.pai = no;
	        }
	        n.dir = no;
	        no.pai = n;

	    }
		
		
		 private void rotacionaEsq(Nodo no){
		        Nodo n = no.dir;
		        trocaNodo(no, n);
		        no.dir = n.esq;
		        if(n.esq != null){
		            n.esq.pai = no;
		        }
		        n.esq = no;
		        no.pai = n;

		    }
		 
		 public Nodo removeNo(Nodo no,int val)throws Exception{
	         
	         if(no != null){
	             if(val > no.chave){
	                 no.dir = removeNo(no.dir, val);
	             }else if(val < no.chave){
	                 no.esq = removeNo(no.esq, val);
	             }else{
	                 if(no.dir != null && no.esq != null){
	                     no.chave = encontraMin(no.dir).chave;
	                     no.dir = removeMin(no.dir);
	                     
	                 }else{
	                     no = (no.esq != null) ? no.esq : no.dir;
	                 }
	             }
	             return no;
	         }else{
	             return null;
	         }
	         
	     }
	     
	     private Nodo removeMin(Nodo no){
	         if(no != null){
	             if(no.esq != null){
	                 no.esq = removeMin(no.esq);
	                 return no;
	             }else{
	                 return no.dir;
	             }
	         }
	         return null;
	     }
	     private Nodo encontraMin(Nodo no){
	         if(no != null){
	             while(no.esq != null){
	                 no = no.esq;
	             }
	         }
	         return no;
	     }
	
}
