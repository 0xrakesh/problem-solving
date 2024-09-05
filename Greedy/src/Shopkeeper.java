import java.util.Scanner;

public class Shopkeeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customers = sc.nextInt();
        int[] pricing = new int[customers];
        for(int i=0;i<customers;i++) pricing[i] = sc.nextInt();
        int one = 0, two = 0, three = 0;
        boolean isDone = true;
        for(int price:pricing) {
            if(price==30) one++;
            else if(price==60) {
                if(one<1) {
                    isDone = false;
                    break;
                }
                one--;
                two++;
            }
            else {
                if(two<1 && one < 3) {
                    isDone = false;
                    break;
                }
                if(two>0) {
                    two--;
                }
                else {
                    one-=3;
                }
                three++;
            }
        }
        System.out.println((isDone?"Transaction Successful":"Transaction Failed"));
    }
}
