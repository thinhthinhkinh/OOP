package tuan2_QLxe;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Vehicle[] xe = new Vehicle[3];

	        for (int i = 0; i < xe.length; i++) {
	            System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
	            System.out.print("Chu so huu: ");
	            String chusohuu = scanner.nextLine();
	            System.out.print("Mau ma: ");
	            String mauxe = scanner.nextLine();
	            System.out.print("Dung tich (cc): ");
	            double dungtich = scanner.nextDouble();
	            System.out.print("Gia thanh: ");
	            double gia = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline

	            xe[i] = new Vehicle(chusohuu, mauxe, dungtich, gia);
	        }

	        System.out.println("\nThong tin thue cua xe:");
	        for (Vehicle vehicle : xe) {
	            vehicle.displayInfo();
	        }

	        scanner.close();
	    }
}
