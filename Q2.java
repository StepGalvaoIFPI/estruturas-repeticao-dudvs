import java.util.Scanner;
public class Q2{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Salario: ");
        double salario = Double.valueOf(scanner.nextLine());
        double aumento;
        double novo_salario;
        
        if(salario > 1250) {
            aumento = salario*0.1;
            novo_salario = salario + aumento;
            System.out.printf("Novo Salario = %.2f\n", novo_salario);
            System.out.printf("Aumento = %.2f\n", aumento);
        }else{
            aumento = salario*0.15;
            novo_salario = salario + aumento;
            System.out.printf("Novo Salario = %.2f\n",novo_salario);
            System.out.printf("Aumento = %.2f\n", aumento);
        }    
    } 
     
}

