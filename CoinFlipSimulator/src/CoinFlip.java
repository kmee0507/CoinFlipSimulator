import java.util.*;
public class CoinFlip {
	
	static void flipCoin(int n){
		for (int i = 0;i<n;i++){
			Random r = new Random();
			int flip = r.nextInt(2);
			if(flip == 0)
				System.out.println("Heads");
			else
				System.out.println("Tails");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many coin flips do you want to do: ");
		int count = sc.nextInt();
		System.out.println("\n");
		flipCoin(count);
		
	}
}
