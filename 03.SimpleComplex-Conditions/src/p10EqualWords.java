import java.util.Scanner;

public class p10EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine().toLowerCase();
        String secondWord = scanner.nextLine().toLowerCase();

        if (firstWord.equals(secondWord)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
