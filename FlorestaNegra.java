
package FabicaBolos;

public class FlorestaNegra extends AbstractBolo{

    public FlorestaNegra() {
        
        setNome("Bolo de Floresta Negra");
        setTipo("Sobremesa");
        setValor(27.00f);
    }
  
   @Override
    public void sobreoBolo() {
        System.out.println(getNome()+ ": " + getTipo()+"."+ "\nValor: " +getValor()+"R$"+
                "\nMassa doce de chocolate, chantilly e cerejas.");
    }

    @Override
    public void receita() {
        System.out.println("Receita: Essência de baunilha, cereja, água, chocolate em pó, "
                + "\novo, açúcar, creme de leite, fermento e farinha de trigo.");
    }
}
