
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk mengeja nama
 *  
 */

package pbo1.pkg10118033.latihan25;

import java.util.Scanner;

public class PBO110118033Latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println("\nEjaan untuk "+nama+" adalah : ");
        int jumlah = nama.length();
        for(int i=1;i<=jumlah;i++){
            String sub_nama = nama.substring(i-1, i);
            System.out.println("Huruf ke-"+i+" : "+sub_nama);
        }
        System.out.println("(Developed By : Ikrar AB)");
    }
}