package pboif2.pkg10119052.latihan33.userlogin;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * User Login dengan menggunakan dua class
 * 
 */
public class User {
    private final String username = "RizkiDwi";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        System.out.println("");
        
        if(status) {
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun ,parUserName);
    }
}
