
package FabicaBolos;

abstract class AbstractBolo {

    private String nome;
    private String tipo;
    private float valor; 
    
    public void sobreoBolo(){
    }

    public void receita(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}




