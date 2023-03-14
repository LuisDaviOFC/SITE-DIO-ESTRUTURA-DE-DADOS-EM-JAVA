package Filas;

public class Fila {
    private No refNoEntradaFila;
    
    public Fila(){
        this.refNoEntradaFila = null;
    }
    
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    
    public No first(){
        if(!this.isempty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                break;
                }
            }
        }
        return null;
    }
    
        public No dequeue(){
        if(!this.isempty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo; 
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
        }
        return null;
    }
    
    public boolean isempty(){
        return refNoEntradaFila == null? true:false;
    }
    
   @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "-------------\n";
        
        No  noAuxiliar = refNoEntradaFila;
        
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{object=" + noAuxiliar.getObject() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}