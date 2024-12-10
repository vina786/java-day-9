
import java.util.*;

public class lengthlastword {
    public static void main(String[] args) {
        //counts the last word digits value
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        
        if (words.length > 0) {
            String lastWord = words[words.length - 1];
            System.out.println(lastWord.length());
        } else {
            System.out.println(0); // In case of an empty input
        }
    }
}