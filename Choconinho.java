
package FabicaBolos;

public class Choconinho extends AbstractBolo{

    public Choconinho() {        
        setNome("Bolo de Choconinho");
        setTipo("Sobremesa");
        setValor(25.00f);
    }
    
    @Override
    public void sobreoBolo() {
        System.out.println(getNome()+ ": " + getTipo()+"."+"\nValor: " +getValor()+"R$"+
                "\nMassa doce, leite ninho e chocolate.");
        
    }

    @Override
    public void receita() {
        System.out.println("Receita: Leite em pó, leite, manteiga, ovo, açúcar,"
                + " \noléo, cacau em pó, fermento e farinha de trigo.");
        
    }
}

    
    