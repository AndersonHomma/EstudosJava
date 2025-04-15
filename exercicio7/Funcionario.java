package exercicio7;

public class Funcionario {
    
    double salario;
    int experiencia;

    public void aumentarSalario(){
        
        if(experiencia	>= 0 && experiencia	<= 2){
            salario += (salario*0.1);            
        }else{
            if(experiencia >= 3 && experiencia <= 5) {
               salario += (salario*0.15); 
            }else{
                if(experiencia > 5){
                    salario += (salario*0.2);
                }
            }
        }        
    }
}

