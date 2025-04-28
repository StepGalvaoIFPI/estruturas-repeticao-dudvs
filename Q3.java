import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu salario: ");
        double salario = Double.valueOf(scanner.nextLine());
        double imposto;
        double inss;
        
        if(salario>2000){
            imposto = salario * 0.15;
            inss = salario * 0.10;
            System.out.println("Salario: R$" + salario);
            System.out.println("Imposto: R$" + imposto);
            System.out.println("INSS: R$" + inss);
        }else{
            imposto = 0;
            inss = 0;
            System.out.println("Salario: R$" + salario);
            System.out.println("Imposto: R$" + imposto);
            System.out.println("INSS: R$" + inss);
            
        }
    }
}
