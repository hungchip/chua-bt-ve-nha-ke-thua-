package com.vuviethung.bai1;

import java.util.Scanner;

public class Xe {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private long doanhThu;

    public int getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public Xe() {
        this.soXe = 0;
        this.maSoChuyen = 0;
        this.hoTenTaiXe = "";
        this.doanhThu = 0;
    }

    public Xe(int soXe, int maSoChuyen, long doanhThu, String hoTenTaiXe) {
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.maSoChuyen = maSoChuyen;
        this.doanhThu = doanhThu;
    }

    public void nhap() {
        System.out.println("Nhap Thong tin xe"+"\n");
        System.out.println("So xe");
        this.soXe = new Scanner(System.in).nextInt();
        System.out.println("Nhap ma so chuyen xe");
        this.maSoChuyen = new Scanner(System.in).nextInt();
        System.out.println("Nhap ho ten lai xe");
        this.hoTenTaiXe = new Scanner(System.in).nextLine();
        System.out.println("Doanh thu ");
        this.doanhThu = new Scanner(System.in).nextLong();
    }

    @Override
    public String toString() {
        return "Thong tin xe"+
                "So xe "+ soXe+
                "ma so chuyen xe" + maSoChuyen+
                "Ho ten lai xe"+ hoTenTaiXe+
                "Doanh thu "+ doanhThu;
    }
}
