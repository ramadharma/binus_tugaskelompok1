/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoranbungar;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class RestoranBungar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      buat object scanner
        Scanner in = new Scanner(System.in);
        
//      inisiasi variabel utama (jumlah orang dan nama pemesan)
        int jumlahorang;
        String pemesan;
        
//      input orang dan nama pemesan
        System.out.println("Selamat Datang di Restoran Bungar...");       
        System.out.print("Pesan untuk berapa orang : ");
        jumlahorang = in.nextInt();
        System.out.print("Pesan atas nama          : ");
        pemesan = in.next();
        
//      inisiasi variabel harga makanan
        double p_nasi = 9999.99,
               p_ayam = 12345.67,
               p_steak = 21108.40,
               p_kwetiaw = 13579.13,
               p_kambing = 98765.43;
        
//      print daftar menu makanan
        System.out.println("");
        System.out.println("Menu Hari Ini");
        System.out.println("=============");
        System.out.println("    1. Nasi Goreng Spesial      @ Rp. " + p_nasi);
        System.out.println("    2. Ayam Bakar Spesial       @ Rp. " + p_ayam);
        System.out.println("    3. Steak Sirloin Spesial    @ Rp. " + p_steak);
        System.out.println("    4. Kwetiaw Siram Spesial    @ Rp. " + p_kwetiaw);
        System.out.println("    5. Kambing Guling Spesial   @ Rp. " + p_kambing);
        
//      inisiasi variabel jumlah pemesanan per menu
        int m1, m2, m3, m4, m5;
        
//      input jumlah pemesanan
        System.out.println("");
        System.out.println("Pesanan Anda [batas pesanan 0-10 p0]");
        System.out.print("1. Nasi Goreng Spesial      = ");
        m1 = in.nextInt();
        System.out.print("2. Ayam Bakar Spesial       = ");
        m2 = in.nextInt();
        System.out.print("3. Steak Sirloin Spesial    = ");
        m3 = in.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial    = ");
        m4 = in.nextInt();
        System.out.print("5. Kambing Guling Spesial   = ");
        m5 = in.nextInt();
        
        
//      Algoritma perhitungan
        double t1 = m1 * p_nasi,
               t2 = m2 * p_ayam,
               t3 = m3 * p_steak,
               t4 = m4 * p_kwetiaw,
               t5 = m5 * p_kambing;
        double total = t1 + t2 + t3 + t4 + t5;
        double diskon = total * 0.1;
        double total_pembelian = total - diskon;
        double perorang = total_pembelian / jumlahorang;
        
        System.out.println("");
        System.out.println("Selamat menikmati makanan Anda...");
        System.out.println("");
        
//      Print struk pembayaran
        System.out.println("Pembelian   :");
        System.out.println("1. Nasi Goreng Spesial      " + m1 + " porsi * Rp. 9999.99  =  Rp.  " + t1);
        System.out.println("2. Ayam Bakar Spesial       " + m2 + " porsi * Rp. 12345.67 =  Rp.  " + t2);
        System.out.println("3. Steak Sirloin Spesial    " + m3 + " porsi * Rp. 21108.40 =  Rp.  " + t3);
        System.out.println("4. Kwetiaw Siram Spesial    " + m4 + " porsi * Rp. 13579.13 =  Rp.  " + t4);
        System.out.println("5. Kambing Guling Spesial   " + m5 + " porsi * Rp. 98765.43 =  Rp.  " + t5 + "\t+");
        System.out.println("===========================================================================");
        System.out.println("Total Pembelian                                    =  Rp.  " + total);
        System.out.println("Disc. 10% (Masa Promosi)                           =  Rp.  " + diskon + "\t-");
        System.out.println("===========================================================================");
        System.out.println("Total Pembelian setelah disc 10%                   =  Rp.  " + total_pembelian);
        System.out.println("Pembelian per orang (untuk " + jumlahorang + " orang)               =  Rp.  " + perorang);
        
        System.out.println("");
        System.out.println("Terimakasih atas kunjungan Anda...");
        System.out.print("tekan ENTER untuk keluar");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
    
}
