/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119011.reihanwiyanda.no2;

/**
 *
 * @author Reihan Wiyanda
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan (int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang (int jumlah) {
        return saldo-jumlah;
    }
}
