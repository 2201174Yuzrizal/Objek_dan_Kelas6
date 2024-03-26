/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.per6;

class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    // Konstruktor default
    public PersegiPanjang() {
        this.panjang = 1;
        this.lebar = 1;
    }
    
    // Konstruktor dengan parameter panjang dan lebar
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }
    
    // Getter untuk luas persegi panjang
    public int getLuas() {
        return this.panjang * this.lebar;
    }
    
    // Getter untuk keliling persegi panjang
    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
    
    // Setter untuk panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }
    
    // Setter untuk lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}

public class Per6 {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        
        // Menghitung dan mencetak luas dan keliling persegi panjang
        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());
        System.out.println();
        
        System.out.println("Persegi Panjang 2:");
        System.out.println("Luas: " + persegiPanjang2.getLuas());
        System.out.println("Keliling: " + persegiPanjang2.getKeliling());
        System.out.println();
        
        System.out.println("Persegi Panjang 3:");
        System.out.println("Luas: " + persegiPanjang3.getLuas());
        System.out.println("Keliling: " + persegiPanjang3.getKeliling());
    }
}
