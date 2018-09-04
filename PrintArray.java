package CodingDemo;
class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	MyException(int age) {
		if (age > 60) {
			System.out.println("Age is Greater than 60");
		} else if (age < 15) {
			System.out.println("Age is less than 15");
		}
	}
}
class PrintArray {
	public static void main(String[] args) throws MyException {
		PrintArray p = new PrintArray();
		p.show(70);
		
	}
	void show(int age)  throws MyException {
		      if(age>15 && age<60) {
		    	  System.out.println("................................."+age);
		      }
		      throw new MyException(age);
	}
	 
}
