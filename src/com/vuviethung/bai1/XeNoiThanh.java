package com.vuviethung.bai1;

import java.util.Scanner;

public class XeNoiThanh extends Xe{
    private int soTuyen;
    private int soKMDiDuoc;

    public int getSoTuyen() {
        return soTuyen;
    }

    public int getSoKMDiDuoc() {
        return soKMDiDuoc;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKMDiDuoc(int soKMDiDuoc) {
        this.soKMDiDuoc = soKMDiDuoc;
    }

    public XeNoiThanh(int soTuyen, int soKMDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKMDiDuoc = soKMDiDuoc;
    }

    public XeNoiThanh(int soXe, int maSoChuyen, long doanhThu, String hoTenTaiXe, int soTuyen, int soKMDiDuoc) {
        super(soXe, maSoChuyen, doanhThu, hoTenTaiXe);
        this.soTuyen = soTuyen;
        this.soKMDiDuoc = soKMDiDuoc;
    }

    public XeNoiThanh(){
        super();
        this.soTuyen = 0;

        this.soKMDiDuoc = 0;
    }


    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap so Tuyen");
        this.soTuyen = new Scanner(System.in).nextInt();
        System.out.println("Nhap so Km di duoc");
        this.soKMDiDuoc = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+
                "So tuyen"+soTuyen+
                "So kmdi duoc"+soKMDiDuoc;
    }
}
