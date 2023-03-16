/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Lingkaran implements MenghitungBidang{
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double keliling() {
        return 2*Math.PI*jari;
    }

    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }
}
