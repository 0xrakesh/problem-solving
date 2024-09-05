import java.util.Scanner;

public class UniqueTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();
        StringBuilder unique = new StringBuilder();
        for(int i=0;i<ticket.length();i++) {
            if(ticket.charAt(i) == 'G') continue;
            else if(i+1<ticket.length() && ticket.charAt(i) == 'E' && ticket.charAt(i+1) == 'F') {
                i++;
                continue;
            }
            else if(i+1<ticket.length() && ticket.charAt(i) == 'F' && ticket.charAt(i+1) == 'E') {
                i++;
                continue;
            }
            else unique.append(ticket.charAt(i));
        }
        System.out.println(unique.toString());
    }
}
