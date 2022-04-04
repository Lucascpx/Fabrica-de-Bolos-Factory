

package FabicaBolos;


public class TesteFabrica {
     public static void main(String[] args) {
         
        FabricaFactory ff = new FabricaFactory();
         
        AbstractBolo f1 = ff.getAbstractBolo(FabricaFactory.Sabor.Abacaxi);
        f1.sobreoBolo();       
        f1.receita();
        
        System.out.println("\t");
        
        AbstractBolo f2 = ff.getAbstractBolo(FabricaFactory.Sabor.Choconinho);
        f2.sobreoBolo();       
        f2.receita();
        
        System.out.println("\t");
        
        AbstractBolo f3 = ff.getAbstractBolo(FabricaFactory.Sabor.FlorestaNegra);
        f3.sobreoBolo();       
        f3.receita();
        
        System.out.println("\t");
        
        AbstractBolo f4 = ff.getAbstractBolo(FabricaFactory.Sabor.Prestigio);
        f4.sobreoBolo();       
        f4.receita();
         
    }
    
    
}
