package com.company;

public class Education {

    private final int year;

    public Education(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    private int vov;
    private int vs;
    private int zak;
    private int so;
    private int uso;

    public void setVov(int vov) {
        this.vov = vov;
    }

    public void setVs(int vs) {
        this.vs = vs;
    }

    public void setZak(int zak) {
        this.zak = zak;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }

    public int getVov() {
        return vov;
    }

    public int getVs() {
        return vs;
    }

    public int getZak() {
        return zak;
    }

    public int getSo() {
        return so;
    }

    public int getUso() {
        return uso;
    }

    public double getRatio(String education) {
        double total = this.vov + this.vs + this.zak + this.so + this.uso;
        if (education.equals("VOV")) return this.vov / total * 100;
        if (education.equals("VS")) return this.vs / total * 100;
        if (education.equals("ZAK")) return this.zak / total * 100;
        if (education.equals("SO")) return this.so / total * 100;
        if (education.equals("USO")) return this.uso / total * 100;
        else return 0;
    }
}
