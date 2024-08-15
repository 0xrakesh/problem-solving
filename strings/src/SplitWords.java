import java.util.Scanner;

public class SplitWords {
    static class Result {
        public final String output1;
        public final String output2;
        public final String output3;
        Result(String a, String b, String c) {
            output1 = a;
            output2 = b;
            output3 = c;
        }
    }
    public static Result separateWords(String input1,String input2,String input3) {
        String[] p1 = splitWord(input1);
        String[] p2 = splitWord(input2);
        String[] p3 = splitWord(input3);

        StringBuilder o3 = new StringBuilder();
        o3.append(p1[2]).append(p2[2]).append(p3[2]);
        for(int i=0;i<o3.length();i++) {
            if(Character.isUpperCase(o3.charAt(i))) o3.setCharAt(i,Character.toLowerCase(o3.charAt(i)));
            else o3.setCharAt(i,Character.toUpperCase(o3.charAt(i)));
        }

        return new Result(p1[0] + p2[0] + p3[0], p1[1] + p2[1] + p3[1],o3.toString() );
    }

    public static String[] splitWord(String word) {
        int n = word.length();
        int div = n/3;
        int rem = n%3;
        String p1,p2,p3;
        if(rem==0) {
            p1 = word.substring(0,div);
            p2 = word.substring(div, div*2);
            p3 = word.substring(div*2,div*3);
        }
        else if(rem==1) {
            p1 = word.substring(0,div);
            p2 = word.substring(div,(div*2)+1);
            p3 = word.substring((div*2)+1);
        }
        else {
            p1 = word.substring(0,div+1);
            p2 = word.substring(div+1, (div*2)+1);
            p3 = word.substring((div*2)+1);
        }

        System.out.println(p1+" "+p2+" "+p3);
        return new String[]{p1,p2,p3};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        Result res = separateWords(a,b,c);
        System.out.println(res.output1+" "+res.output2+" "+res.output3);
    }
}
