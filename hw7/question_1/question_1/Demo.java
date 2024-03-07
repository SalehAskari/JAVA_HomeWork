
class Demo {
	public static void main(String[] args) {
		
		BST<Integer> age = new  BST <Integer>();
		age.add(20);
		age.add(13);
		age.add(19);
		BST<String> name = new BST <String>();
		name.add("Saleh");
		name.add("Hadi");
		name.add("Ali");
		BST<String> eye = new BST <String>();
		eye.add("Blue");
		eye.add("Red");
		eye.add("green");
		eye.add("black");
		
		System.out.println("Age size : " + age.size());
		System.out.println("Name size : " + name.size());
		System.out.println("Eye size : " + eye.size());
		System.out.println("Is he 20 years old ? " + age.containts(20));
		System.out.println("Is it Mr Hadi ? " + name.containts("Ali"));
		System.out.println("Is the eye brown ? " + eye.containts("Brown"));
		try{
			System.out.println("Max age : " + age.getMaxElement());
			System.out.println("Min age : " + age.getMinElement());
			System.out.println("Max name : " + name.getMaxElement());
			System.out.println("Min name : " + name.getMinElement());
			System.out.println("Max eye : " + eye.getMaxElement());
			System.out.println("Min eye : " + eye.getMinElement());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}