import java.util.Scanner;
public class JTICafe10 {
    public static void main(String[] args) {
        double pilihan_menu;
        String member;
        double harga =0;
        double diskon = 0.10;
        double total_bayar = 0;
        String payment_method;
        double qris = 1000;

        Scanner sc = new Scanner (System.in);
        System.out.println("-----------------------");
        System.out.println("==== MENU CAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukan angka dari menu yang dipilih = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("---------------------------------------");
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; 
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =" + harga);

            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        
        System.out.print("Pilih metode pembayaran (QRIS/Cash) = ");
        payment_method = sc.nextLine();

        if (payment_method.equalsIgnoreCase("QRIS")) {
            total_bayar = harga - 1000;
            System.out.println("Anda memilih pembayaran via QRIS, diskon tambahan Rp.1000");
        }else {
            total_bayar = harga;
        }

        System.out.println("Total bayar = " + total_bayar);
        System.out.println("--------------------------");
    }
}
