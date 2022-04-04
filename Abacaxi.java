
package FabicaBolos;

public class Abacaxi extends AbstractBolo {
    

    public Abacaxi(){        
        setNome("Bolo de Abacaxi");
        setTipo("Sobremesa");
        setValor(22.00f);        
    }
    
    @Override
    public void sobreoBolo() {
        System.out.println(getNome()+ ": " + getTipo()+"."+  
                "\nValor: " +getValor()+"R$"+ "\nMassa doce e fatias de abacaxi.");        
    }

    @Override
    public void receita() {
        System.out.println("Receita: Abacaxi, ovo, margarina, açúcar, "
                + "\noléo, leite, fermento e farinha de trigo.");
      
    }
}



  
    


