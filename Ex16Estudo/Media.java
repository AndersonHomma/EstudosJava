package exercicios.Ex16Estudo;

public class Media {
    public float soma;
    public float contador;

    public Media (){
        soma = 0;
        contador = 0;
    }

    public void Acrescenta(float valor){
        this.soma += valor;
        contador++;
    }

    public float MediaAtual (){
        return this.soma/this.contador;
    }
}
