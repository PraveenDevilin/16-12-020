package org.Cons;

public class STring {

	public static void main(String[] args) {
		String s = "Hello Welcome";
		String s1 = "Hello Welcome";
		String z = "Praveen";
		String z1 = "Sudharasan";

		StringBuffer x = new StringBuffer("Praveen");
		StringBuffer x1 = new StringBuffer("Sudharsan");

		String p = new String("Hello Welcome");
		String p1 = new String("Hello Welcome");

		String str = "ABCD";

		System.out.println(s.charAt(12));
		System.out.println(s.length());

		System.out.println(s.equalsIgnoreCase("hEllo Welcome"));
		System.out.println(s.contains("Hello Welcome z"));
		String[] a = s.split(" ");
		for (String b : a) {
			System.out.println(b);

		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(3));
		System.out.println(s.subSequence(3, 10));

		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf('o'));
		System.out.println(s.replaceAll("e", "a"));
		System.out.println(str.isEmpty());
		System.out.println(s.startsWith("e"));
		System.out.println(s.endsWith("ome"));
		System.out.println(str.compareTo("AB"));

		// Literal String
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));

		// Non Literal String

		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(p1));

		// Immutable

		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(z1));
		String con = z1.concat(z);
		System.out.println(con);
		System.out.println(System.identityHashCode(con));
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(x1));
		StringBuffer app = x.append(x1);
		System.out.println(app);
		System.out.println(System.identityHashCode(app));
	}
}
