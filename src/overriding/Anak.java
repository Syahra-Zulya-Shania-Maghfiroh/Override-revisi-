/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author MOKLET-01
 */
public class Anak {
    //mendefinisikan variable
    String nama = "Syahra", alamat = "Blitar";
    int hari = 3, harga_sewa = 125000, total, bayar = 400000, kembalian;
    
    //method sewa
    void sewa(){
        System.out.println("**--SELAMAT DATANG DI PENGINAPAN BARU--**");
        System.out.println("==========================================");
        System.out.println("---BERIKUT IDENTITAS ANDA---");
        System.out.println("Nama    : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("==========================================");
    }
    //method penginapan
    void penyewaan(){
        System.out.println("---RINCIAN SEWA---");
        System.out.println("==========================================");
        System.out.println("Jumlah Hari         : "+hari);
        System.out.println("Harga Sewa /Hari    : "+harga_sewa);
        System.out.println("==========================================");
}
}