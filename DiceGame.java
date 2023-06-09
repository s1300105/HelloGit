import java.util.Random;
import java.util.Scanner;
class DiceGame{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scanner.nextLine();
	System.out.println("Hello, "+name+"!");
	
	int a,b,c;
	Random random = new Random();
	a = random.nextInt(6)+1;

	random = new Random();
	b = random.nextInt(6)+1;
	
	c=a+b;
	
	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+a);
	System.out.println("Die 2: "+b);
	System.out.println("Total value: "+c);
	if(c>=7) System.out.println("You won");
	else System.out.println("You lost");
    }
}
