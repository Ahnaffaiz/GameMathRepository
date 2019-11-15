package game.math;


import Penilaian.Penilaian;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahnaffaiz
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        //instansiasi Penilaian
        Penilaian nilai = new Penilaian(1, 3, 0);
        
        //memasukkan nama dan memilih menu
        nilai.getMenu();
    }
}
