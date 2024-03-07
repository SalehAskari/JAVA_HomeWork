import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


class Main {
	public static void main(String[] args) {
		Random random = new Random();
		BlockingQueue <Integer> list = new LinkedBlockingQueue<Integer>(10);
		int cunter [] = {0,0,0};
		//int coci = 0;
		
		Thread creatCoci = new Thread(() -> {
		
				try{
					for(int i = 1 ; i <= 10 ; i++){
						try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println(e.getMessage());
								
							}
						list.put(i);
						System.out.println(i + " ـ Cooking");
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		});
	Thread eatingCociHumer = new Thread(() -> {
		for (int i = 1 ; i <= 10 ; i++) {
			//System.out.println("SIZE : " + list.size());
			try {
				int select = random.nextInt(3);
				cunter[select]++;
				try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				
				if (select == 0) {
					System.out.println( list.take() + " _ Eating Lisa");
				}
				else if (select == 1) {
					System.out.println( list.take() + " _ Eating Bart");
				}
				else if ((select == 2) && (cunter[select] >= 2 && cunter[select] <= 4)) {
					//System.out.println("h1");
					System.out.println( list.take() + " _ Eating Humer");
				}
				if (cunter[2] < 2 && list.size() == 8) {
					while (cunter[2] < 2) {
						//System.out.println("h2");
						System.out.println( list.take() + " _ Eating Humer");
						cunter[2]++;
						i++;
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		
	});
		creatCoci.start();
		eatingCociHumer.start();
			
			try {
				creatCoci.join();
				eatingCociHumer.join();
			
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
	}
}
}