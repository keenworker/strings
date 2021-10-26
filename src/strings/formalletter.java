package strings;

public class formalletter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sujan");
        System.out.println(letter);
	}
}
