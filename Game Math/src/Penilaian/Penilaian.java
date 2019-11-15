/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;
import Perhitungan.Pengurangan;
import Perhitungan.Penjumlahan;
import java.util.Scanner;

/**
 *
 * @author ahnaffaiz
 */
public class Penilaian {
    
    //attribute
    public String nama;
    public int score; 
    public int level;
    public int lives;
    
    //constructor untuk memberi nilai default pada attribute
    //overloading
    public Penilaian(int level){
        this.level = level;
        this.lives = 3;
        this.score = 0;
    }
    
    //overloading
    public Penilaian(int level, int lives){
        this.level = level;
        this.lives = lives;
        this.score = 0;
    }
    
    //overloading
    public Penilaian(int level, int lives, int score){
        this.level = level;
        this.lives = lives;
        this.score = score;
    }
    
    
    //methods untuk memasukkan nama dan memilih menu
    public void getMenu() {
        
        Scanner myNama = new Scanner(System.in);
        
        
        //untuk memasukkan nama
        System.out.println("*******************************");
        System.out.println("Game Math");
        System.out.println("*******************************");
        System.out.print("Masukkan nama Anda: ");
        String nama = myNama.nextLine();
        this.nama = nama;
        
        
        //untuk memilih menu
        String menu = "0";
        OUTER:
        while ("1" !=menu || "2"!=menu || "3" !=menu) {
            System.out.println("*******************************");
            System.out.println("Game Math");
            System.out.println("*******************************");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = myNama.nextLine();
            
            //instansiasi untuk kelas penjumlahan dan pengurangan
            Penjumlahan jumlah = new Penjumlahan(level, lives, score, nama);
            Pengurangan kurang = new Pengurangan(level, lives, score, nama);
            
            switch (menu) {
                case "1":
                    //untuk menampilkan soal penjumlahan
                    jumlah.level();
                    break;
                case "2":
                    //untuk menampilkan soal pengurangan
                    kurang.level();
                    break;
                case "3":
                    //untuk keluar permainan
                    break OUTER;
                default:
                    menu = "0";
                    break;
            }
        }
        
        
    }
    
    
    //di overide
    public void getResult(int jawab){
        System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: " + level + "]");
    }
    
    public void getMainResult(){
        if (score > 300) {
            //untuk di override di kelas penjumlahan atau pengurangan 
        }
        else {
            System.out.println("Hai, " + this.nama +  ", jangan menyerah ya untuk mencoba lagi");
        }
    }
    
    
    
}
