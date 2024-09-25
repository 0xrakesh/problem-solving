import java.util.Scanner;

public class FeesCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student type");
        String student = sc.nextLine();
        System.out.println("Enter tuition fee");
        int tuition = sc.nextInt();
        System.out.println("Enter bus fee");
        int bus = sc.nextInt();
        System.out.println("Enter hostel fee");
        int hostel = sc.nextInt();
        int fees = switch (student) {
            case "MSH" -> tuition + hostel;
            case "MSDS" -> tuition + bus;
            case "MGSDS" -> (tuition + (tuition / 100 * 50)) + bus;
            default -> (tuition + (tuition / 100 * 50)) + hostel;
        };
        System.out.println("The fees to be paid by the student is Rs."+fees+".00");
    }
}
