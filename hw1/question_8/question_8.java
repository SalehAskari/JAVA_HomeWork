import javax.print.attribute.standard.*;

class question_8 {
	public static void main(String[] args) {
		
		//test
		int tst []  = {1,4,2,1,4,4,4};
		int max = maxSpan(tst, 7);
		System.out.println(max);
	}
	
	//func
	public static int maxSpan(int[] a , int siz){
		
		//arrey
		int temp ;
		int lenght;
		int max = 0;
		
		//loop for discover maxSpan
		for (int i = 0 ; i < siz ; i++) {
			for (int j = ( i + 1 ) ; j < siz ; j++) {
				if (a[i] == a[j]){
					temp = a[i];
					lenght = (( j - i ) + 1);
					
					if (lenght > max) {
						max = lenght;
					}
				}
			}
		}
		return max;
	}
}