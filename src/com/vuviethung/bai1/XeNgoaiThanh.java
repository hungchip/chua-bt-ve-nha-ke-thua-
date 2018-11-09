package com.vuviethung.bai1;

import java.util.Scanner;

public class XeNgoaiThanh extends Xe{
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XeNgoaiThanh(){
        super();
        this.noiDen="";
        this.soNgayDiDuoc=0;
    }

    public XeNgoaiThanh(int soXe, int maSoChuyen, long doanhThu, String hoTenTaiXe, String noiDen, int soNgayDiDuoc) {
        super(soXe, maSoChuyen, doanhThu, hoTenTaiXe);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhap noi den");
        this.noiDen= new Scanner(System.in).nextLine();
        System.out.println("Nhap so ngay di duoc");
        this.soNgayDiDuoc = new Scanner(System.in).nextInt();
    }
    @Override
    public String toString() {
        return super.toString()+"XeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }
}
