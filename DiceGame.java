import java.util.Random;
class DiceGame{
    public static void main(String[] args){
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
    }
}
