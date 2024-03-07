
class BST < T extends Comparable<T>> {
	private Farnush farnush ;
	private int size;
	class Farnush {
		private T element;
		private Farnush right;
		private Farnush left;
		
		public Farnush(){
			right = left = null;
		}
		
		public Farnush(T element){
			this.element = element;
		}
	}
	public void add(T element){
		farnush = add(element, farnush);
		
	}
	private Farnush add(T element , Farnush farnush){
		if (farnush == null) {
			size++;
			return new Farnush(element);
		}
		
		if (element.compareTo(farnush.element) < 0) {
			farnush.left = add(element , farnush.left);
		}
		else if (element.compareTo(farnush.element) > 0) {
			farnush.right = add(element,farnush.right);
		}
		return farnush;
		
		
	}
	public boolean containts(T element){
		return containts(element , farnush);
	}
	private boolean containts(T element , Farnush farnush){
		if (farnush == null) {
			return false;
		}
		if (farnush.element== element) {
			return true;
		}
		if (element.compareTo(farnush.element) < 0) {
			return containts(element , farnush.left);
		}
		else if (element.compareTo(farnush.element) > 0) {
			return containts(element , farnush.right);
		}
		else {
			return true;
		}
	}
	public int size(){
		return this.size;
	}
	public T getMaxElement() throws IllegalStateException {
		if (farnush == null) {
			throw new IllegalStateException(0);
		}
		Farnush f = farnush;
		while (f.right != null) {
			f = f.right;
		}
		return f.element; 
	}
	
	public T getMinElement() throws IllegalStateException {
		if (farnush == null) {
			throw new IllegalStateException(1);
		}
		
		Farnush f = farnush;
		while (f.left != null) {
			f = f.left;
		}
		return f.element; 
	}
}