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
public class Anakanak extends Anak{
    //method penyewaan 
    void penyewaan(){
        System.out.println("---NOTA---");
        System.out.println("Total yang Harus dibayar    : "+(total=hari*harga_sewa)); //pemanggilan dan rumus total
        System.out.println("Jumlah Uang yang dibayar    : "+bayar);
        System.out.println("Kembalian Anda              : "+(kembalian=bayar-total)); //pemanggilan dan rumus kembalian
        System.out.println("=========================================");
        System.out.println("**--SILAHKAN DATANG KEMBALI--**");
}
}