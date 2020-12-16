package org.Cons;

public class Sample implements Praveen {
	
public static void main(String[] args) {
	
//
	Sample s = new Sample();
//			s.setAge(24);
//			s.setName("Sudha");
//			s.setPhoneno(9600665651561l);
//			
//			System.out.println(s.getAge());
	s.out();
	s.out();
	
}

@Override
public void out() {
	System.out.println("Praveen");
	
}

@Override
public void out(int a) {
	System.out.println("Sudhar");
	
}
}
