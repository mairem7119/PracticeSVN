import java.util.Scanner;

public class congTruHaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aNumber, bNumber;
        char kt;
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Nhập vào số thứ nhất: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        bNumber = scanner.nextInt();
        System.out.println("Nhập phép toán (+, -): ");
        kt = scanner.next().charAt(0);
         
        switch (kt) {
        case '+':
            System.out.println(aNumber + " + " + bNumber + " = " + (aNumber + bNumber));
            break;
        case '-':
            System.out.println(aNumber + " - " + bNumber + " = " + (aNumber - bNumber));
            break;
        default:
            System.out.println("Nhập phép tính không hợp lệ.");
        }
	}

}
