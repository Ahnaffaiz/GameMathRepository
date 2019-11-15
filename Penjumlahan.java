/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perhitungan;
import Penilaian.Penilaian;
import game.math.MainClass;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 *
 * @author fiah
 */
public class Penjumlahan extends Penilaian {
    
    //attribute
    //encapsulation
    private int bilPertama, bilKedua;
    
    //methods level1
    public void level(){
        
        //instansiasi
        Scanner myJawab = new Scanner(System.in);
        MainClass myclass = new MainClass();
        //
        int score = this.score;
        int lives = this.lives;
        int level = this.level;
        String nama = this.nama;
        
        score = 0;
        lives = 3;
        level = 1;
            
        //level1
        while(score <= 100  && lives >= 1 ){
            this.bilPertama = ThreadLocalRandom.current().nextInt(0, 10);
            this.bilKedua = ThreadLocalRandom.current().nextInt(0, 10);
               
            System.out.println("berapa hasil dari " + bilPertama + " + " + bilKedua + " ?" );
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
                
            if (bilPertama + bilKedua == jawab){
                score += 4;
                System.out.print("Selamat, " + nama + "Anda Benar, ");
                System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: 1 ]" );
            } else {
                score -=1;
                lives -= 1;
            }
                
        }
        
        //level2
        while(score >= 101  && score<=200 && lives >= 1){
            level += 1;
            this.bilPertama = ThreadLocalRandom.current().nextInt(-10, 0);
            this.bilKedua = ThreadLocalRandom.current().nextInt(-10, 0);
               
            System.out.println("berapa hasil dari (" + bilPertama + ") + (" + bilKedua + ") ?" );
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
                
            if (bilPertama + bilKedua == jawab){
                score += 4;
                System.out.print("Selamat, " + nama + "Anda Benar, ");
                System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: 2 ] " );
            } else {
                score -=1;
                lives -= 1;
            }
                
        }
        
        //level3
        while(score >= 201  && score<=300 && lives >= 1){
            level = 3;
            this.bilPertama = ThreadLocalRandom.current().nextInt(-10, -10);
            this.bilKedua = ThreadLocalRandom.current().nextInt(-10, -10);
               
            System.out.println("berapa hasil dari " + bilPertama + " + " + bilKedua + " ?" );
            System.out.print("jawab: ");
            int jawab = myJawab.nextInt();
                
            if (bilPertama + bilKedua == jawab) {
                score += 4;
                System.out.print("Selamat, " + nama + "Anda Benar, ");
                System.out.println("[Skor: " + score + "]" + "[Live: " + lives + " ]" + "[level: 3 ]");
            } else {
                score -=1;
                lives -= 1;
            }
                
        }
           
    }
    
    
}
