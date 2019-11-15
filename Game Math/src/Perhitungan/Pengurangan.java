/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perhitungan;

import Penilaian.Penilaian;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ahnaffaiz
 */
public class Pengurangan extends Penilaian {

    //attribute
    //encapsulation
    private int bilPertama, bilKedua;

    public Pengurangan(int level, int lives, int score, String nama) {
        super(level, lives, score);
        this.nama = nama;
    }
    
    //methods level1
    public void level(){
        
        //instansiasi
        Random rand = new Random();
        Scanner myJawab = new Scanner(System.in);
        
        //level1
        while(score <= 100  && lives >= 1){
            this.bilPertama = ThreadLocalRandom.current().nextInt(0, 10);
            this.bilKedua = ThreadLocalRandom.current().nextInt(0, 10);
            while (this.bilPertama <= this.bilKedua){
                this.bilPertama = ThreadLocalRandom.current().nextInt(0, 10);
                this.bilKedua = ThreadLocalRandom.current().nextInt(0, 10);
            }   
            System.out.println("berapa hasil dari " + bilPertama + " - " + bilKedua + " ?" );
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
            getResult(jawab);    
                        
        }
        
        //level2
        while(score >= 101  && score<=200 && lives >= 1){
            level = 2;
            this.bilPertama = ThreadLocalRandom.current().nextInt(-10, 0);
            this.bilKedua = ThreadLocalRandom.current().nextInt(-10, 0);
            getCondition();
            
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
            getResult(jawab);
                
        }
        
        //level3
        while(score >= 201  && score<300 && lives >= 1){
            level = 3;
            this.bilPertama = ThreadLocalRandom.current().nextInt(-10, 11);
            this.bilKedua = ThreadLocalRandom.current().nextInt(-10, 11);
            getCondition();
            
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
            getResult(jawab);      
        }
        getMainResult();
           
    }
    
    //overidding
    //menampilkan result setiap selesai menjawab
    public void getResult(int jawab){
        if (bilPertama - bilKedua == jawab) {
            score += 4;
            System.out.print("Selamat, " + nama + ", Anda Benar, ");
            System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: " + level + "]");
        } else {
            score -=1;
            lives -= 1;
            System.out.print("Wah salah, ");
            System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: " + level + "]");
        }
        
    }
    
    //overidding
    //menampilkan result setelah permainan selesai
    public void getMainResult(){
        if (score > 300) {
            System.out.println("Selamat " + this.nama + ", Anda telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahan ya");

        }
        else {
            System.out.println("Hai, " + this.nama +  ", jangan menyerah ya untuk mencoba lagi");
        }
    }
    
    //memberi kurung jika angka negatif
    public void getCondition(){
        if (this.bilPertama <0 && this.bilKedua <0) {
                System.out.println("berapa hasil dari (" + bilPertama + ") - (" + bilKedua + ") ?" );
            } else if (this.bilPertama <0 ) {
                System.out.println("berapa hasil dari (" + bilPertama + ") - " + bilKedua + " ?" );
            } else if (this.bilKedua<0){
                System.out.println("berapa hasil dari " + bilPertama + " - (" + bilKedua + ") ?" );
            }
    }
    
}
