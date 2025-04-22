import java.util.Scanner;
public class Q1{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade: ");
        int velocidade = Integer.valueOf(scanner.nextLine());
        
        if(velocidade <= 80) {
            System.out.println("Verde");
        }else{
            System.out.println("Vermelho");
        }    
    } 
     
}

