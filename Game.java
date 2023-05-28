import java.util.Random;
import java.util.Scanner;

public class Game{
    public static void main(String[] args){
        int numeroAleatorio = new Random().nextInt(100);
        int chances = 5;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Guessing Game!/nTell me a number and try to the get it rigth the number generate of the system! You have 5 chances");
        System.out.println(numeroAleatorio);
        do{
            System.out.println("Digit the number:");
            int numeroParaLeitura = leitura.nextInt();

            if(numeroParaLeitura == numeroAleatorio){
                System.out.println("Congratulation! You Win!");
                break;
            }else{
                if(numeroParaLeitura > numeroAleatorio){
                    System.out.println("The number was too big! Try a smaller");
                }else{
                    System.out.println("The number was too short! Try a bigger");
                }
                chances--;
            }
        }while(chances > 0);
        if(chances == 0){
            System.out.println("Your chances are over :(/nTo play again restart the program");
        }else{
            System.out.println("Thank you for gaming. See you soon ;)");
        }
        
    }
}