import java.util.*;

class GroceryStore {
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.print("number of brothers : ");
		int numberOfBrother = Scanner.nextInt();
		int [] mony = new int[numberOfBrother + 1];
				
		Thread [] thread  = new Thread [numberOfBrother];
		
		for (int i = 0 ; i < numberOfBrother ; i++) {
			int temp = i;
			thread[i] = new Thread(() -> {
				Scanner s = new Scanner(System.in);
				System.out.print((temp+1) + " - Number of financial changes : ");
				int change = s.nextInt();
				for (int j = 0; j < change ; j++) {
					System.out.print((j+1) +" : ");
					mony[temp] += s.nextInt();
					mony[numberOfBrother] += mony[temp];
				}
					
			});
			thread[i].start();
			try {
				thread[i].join();
			} catch (Exception e) {
				
			}
		}
	Thread print = new Thread(() ->{
		for (int i = 0 ; i < numberOfBrother ; i++) {
			System.out.println((i+1) + " : " + mony[i] +  " | " + mony[numberOfBrother]);
		}
			
		
	});
		print.start();
	
	}
}