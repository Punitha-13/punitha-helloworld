import java.util.Scanner;

public class AddComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (i < input.length()-1) {
                result.append(",");
            }
        }
        System.out.println(result.toString());
    }
}
