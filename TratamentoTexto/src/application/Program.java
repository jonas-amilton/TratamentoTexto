package application;

public class Program {

	public static void main(String[] args) {
		String original = "  abcde FGHI ABC abc DEFG   ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		
		System.out.println("LowerCase: -" + s1);
		System.out.println("toUpperCase: -" + s2);
        System.out.println("trim: -" + s3 + "-");
		
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(vect[0]);
	}

}
