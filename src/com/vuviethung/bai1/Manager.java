package com.vuviethung.bai1;

import java.util.Scanner;

public class Manager {
    private XeNgoaiThanh[] xeNgoaiThanhs;
    private XeNoiThanh[] xeNoiThanhs;
    private int soXeNgoaiThanh;
    private int soXeNoiThanh;

    public XeNgoaiThanh[] getXeNgoaiThanhs() {
        return xeNgoaiThanhs;
    }

    public XeNoiThanh[] getXeNoiThanhs() {
        return xeNoiThanhs;
    }

    public void setXeNgoaiThanhs(XeNgoaiThanh[] xeNgoaiThanhs) {
        this.xeNgoaiThanhs = xeNgoaiThanhs;
    }

    public void setXeNoiThanhs(XeNoiThanh[] xeNoiThanhs) {
        this.xeNoiThanhs = xeNoiThanhs;
    }
    public Manager(int soXeNoiThanh,int soXeNgoaiThanh){
        this.soXeNoiThanh =soXeNoiThanh;
        this.soXeNgoaiThanh = soXeNgoaiThanh;
        this.xeNoiThanhs = new XeNoiThanh[this.soXeNoiThanh];
        this.xeNgoaiThanhs = new XeNgoaiThanh[this.soXeNgoaiThanh];
    }
    public void nhapDanhSachXeNoiThanh(){
        for (int i = 0; i < xeNoiThanhs.length; i++) {
            System.out.printf("Nhap xe noi thanh thu %2d\n",i+1);
            this.xeNoiThanhs[i]= new XeNoiThanh();
            this.xeNoiThanhs[i].nhap();
        }
    }
    public  void xuatDanhSachXeNoiThanh(){
        for (int i = 0; i <xeNoiThanhs.length ; i++) {
            System.out.printf("Xe noi thanh thu %d\n",i+1);
            System.out.println(this.xeNoiThanhs[i].toString());
        }
    }
    public void nhapDanhSachXeNgoaiThanh(){
        for (int i = 0; i <xeNgoaiThanhs.length ; i++) {
            System.out.printf("Nhap xe ngoai thanh thu %d\n",i+1);
            this.xeNgoaiThanhs[i]= new XeNgoaiThanh();
            this.xeNgoaiThanhs[i].nhap();
        }
    }
    public void xuatDanhSachXeNgoaiThanh(){
        for (int i = 0; i < xeNgoaiThanhs.length; i++) {
            System.out.printf("Xe ngoai thanh thu %d\n",i+1);
            System.out.println(this.xeNgoaiThanhs[i].toString());
        }
    }
    public long tongDoanhThuXeNoiThanh(){
        long tong=0;
        for (int i = 0; i <xeNoiThanhs.length ; i++) {
            tong+=xeNoiThanhs[i].getDoanhThu();
        }
        return  tong;
    }
    public  long tongDoanhThuXeNgoaiThanh(){
        long tong =0;
        for (int i = 0; i <xeNgoaiThanhs.length ; i++) {
            tong+=xeNgoaiThanhs[i].getDoanhThu();
        }
        return tong;
    }
}
