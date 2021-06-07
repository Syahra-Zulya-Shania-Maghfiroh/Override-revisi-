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
public class Induk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // override
        //inisialisasi objek pemanggilan
        Anak objek = new Anak();
        objek.sewa();   //pemanggilan method sewa
        objek.penyewaan();  //pemanggilan method penyewaan
        
        Anak object = new Anakanak();
        object.penyewaan(); //pemanggilan method penyewaan pada class Anakanak
        
        //Anakanak obj = new Anakanak();
        //obj.penyewaan();  (bisa juga memakai pemanggilan method penyewaan pada class Anakanak dengan cara seperti ini)
        
    }
    
}
