import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RingsAndRod {
    static class Color {
        public boolean red, green, blue;
        Color() {
            red = false;
            green = false;
            blue = false;
        }
        public boolean isValid() {
            return red && green && blue;
        }
    }

    public static void optimal(String rings) {
        Set<Character>[] rods = new HashSet[10];
        for (int i = 0; i < 10; i++) {
            rods[i] = new HashSet<>();
        }

        // Process the input string
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';  // Convert char '0'-'9' to integer 0-9

            // Add the color to the corresponding rod's set
            rods[rod].add(color);
        }

        // Count rods that have all three colors
        int count = 0;
        for (Set<Character> rod : rods) {
            if (rod.contains('R') && rod.contains('G') && rod.contains('B')) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Color[] colors = new Color[10];
        for(int i=0;i<10;i++) colors[i] = new Color();

        for(int i=0;i<word.length();i+=2) {
            char color = word.charAt(i);
            int rod = word.charAt(i+1) - '0';
            if(color=='R') colors[rod].red = true;
            else if(color=='G') colors[rod].green = true;
            else if (color=='B') colors[rod].blue = true;
        }

        int total = 0;

        for(int i=0;i<10;i++) {
            if(colors[i].isValid()) total++;
        }
        System.out.println(total);
        optimal(word);
    }
}
