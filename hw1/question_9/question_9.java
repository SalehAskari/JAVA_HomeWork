import javax.xml.transform.*;

class question_9 {
	public static void main(String[] args){
		
	//tets
	int a [] = {2,3,4,2,3,4,5,6};	
	int result = maxHurs(a , 7);
	System.out.println(result);
	}
	
	//func
	public static int maxHurs(int [] a , int size){
		
		//arrey
		int cunter = 0;
		
		//loop for check arrey and discover rise
		for (int i = 0 ; i < size ; i++) {
			if(a[i] < a [i + 1]){
				cunter++;
			}
		}
		return cunter;
	}
}