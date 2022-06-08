package Hesaplamalar;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int birthyear;
        boolean error = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dogum Yilinizi Giriniz :");
        birthyear = input.nextInt();

        if ((birthyear < 0) || (birthyear > 2022)) {
            System.out.println("Hatali Giris Yaptiniz");
        }else {

        if (birthyear % 12 == 0) {
            System.out.print("Cin Zodyagi Burcunuz : Maymun");
        } else if (birthyear % 12 == 1) {
            System.out.print("Cin Zodyagi Burcunuz : Horoz");
        } else if (birthyear % 12 == 2) {
            System.out.print("Cin Zodyagi Burcunuz : Kopek");
        } else if (birthyear % 12 == 3) {
            System.out.print("Cin Zodyagi Burcunuz : Domuz");
        } else if (birthyear % 12 == 4) {
            System.out.print("Cin Zodyagi Burcunuz : Fare");
        } else if (birthyear % 12 == 5) {
            System.out.print("Cin Zodyagi Burcunuz : Okuz");
        } else if (birthyear % 12 == 6) {
            System.out.print("Cin Zodyagi Burcunuz : Kaplan");
        } else if (birthyear % 12 == 7) {
            System.out.print("Cin Zodyagi Burcunuz : Tavsan");
        } else if (birthyear % 12 == 8) {
            System.out.print("Cin Zodyagi Burcunuz : Ejderha");
        } else if (birthyear % 12 == 9) {
            System.out.print("Cin Zodyagi Burcunuz : Yilan");
        } else if (birthyear % 12 == 10) {
            System.out.print("Cin Zodyagi Burcunuz : At");
        } else if (birthyear % 12 == 11) {
            System.out.print("Cin Zodyagi Burcunuz : Koyun");
        }
        }

    }
}




