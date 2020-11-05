package pboif2.pkg10119052.latihan33.userlogin;
import java.util.Scanner;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * User Login dengan menggunakan dua class dan menggunakan akses modifier 
 * Private
 * 
 */
public class PBOIF210119052Latihan33UserLogin {
    
    private static String usName, passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        user.pengecekkanLogin(usName, passWord);
    }
    
}
