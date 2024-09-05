import java.util.Scanner;

public class LitreOfMilkBuy {

    public static boolean gain(int rupee, int glass, int plastic, int exchange) {
        int pl = rupee-plastic;
        int gl = (rupee-glass)+exchange;
        return pl <= gl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();
        int plastic = sc.nextInt();
        int glass = sc.nextInt();
        int exchange = sc.nextInt();
        int litre = 0;
        int minimal = Math.min(plastic,glass);
        while(rupee>=minimal) {
            if(rupee>=glass && gain(rupee, glass, plastic, exchange)) {
                rupee -= glass;
                litre++;
                rupee += exchange;
            }
            else {
                rupee -= plastic;
                litre++;
            }
        }
        System.out.println(litre);
    }
}
