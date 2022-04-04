
package FabicaBolos;

public class FabricaFactory {

    public enum Sabor {
        Abacaxi, Choconinho, FlorestaNegra, Prestigio;
    }
    public AbstractBolo getAbstractBolo(Sabor s){
         AbstractBolo f = null;
        
        switch (s){
            
            case Abacaxi :
            f = new Abacaxi();
                break;
                
            case Choconinho:
            f =  new Choconinho();
                break;
                
            case FlorestaNegra :
            f =  new FlorestaNegra();
                break;
                
            case Prestigio :  
            f =  new Prestigio();
                break;                              
        }
        return f;
      
    }
}
    
    

