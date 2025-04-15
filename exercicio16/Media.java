package exercicio16;

public class Media {
    
    private float soma;
    private float contador;

    public Media (){
        this.soma = 0.0f;
        this.contador = 0.0f;
    }

    public void Acrescenta(float valor){
        this.soma += valor;
        this.contador++;
    }

    public float MediaAtual(){
        return this.soma/this.contador;
    }
    

}
