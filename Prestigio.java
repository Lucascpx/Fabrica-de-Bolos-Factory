
package FabicaBolos;

public class Prestigio extends AbstractBolo {
    
    public Prestigio() {
        
        setNome("Bolo de Prestigio");
        setTipo("Sobremesa");
        setValor(25.00f);
    }
    
   @Override
    public void sobreoBolo() {
        System.out.println(getNome()+ ": " + getTipo()+"."+ "\nValor:" +getValor()+"R$"+
                "\nMassa doce de chocolate, coco e chocolate.");
 }

    @Override
    public void receita() {
        System.out.println("Receita: Coco ralado, leite, chocolate em pó, leite de coco, "
                + "\nmargarina, ovo, açúcar, oléo, fermento e farinha de trigo.");
    }
}

