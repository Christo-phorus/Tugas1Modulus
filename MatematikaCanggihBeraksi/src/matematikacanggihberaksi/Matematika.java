/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggihberaksi;

/**
 *
 * @author acer
 */
public class Matematika {
    void pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil pertambahan = " + hasil);
    }
    void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil perkalian = " + hasil);
    }
}

class MatematikaCanggih extends Matematika {
    void modulus (int a, int b){
        int hasil = a % b;
        System.out.println("Hasil = " + hasil);
    }
}
