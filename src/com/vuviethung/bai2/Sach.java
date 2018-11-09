package com.vuviethung.bai2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private Date ngay;
    private int donGia;
    private int soLuong;
    private String nhaXuatBan;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach(String maSach, Date ngay, int donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngay = ngay;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach() {
        this.maSach = "";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngay = df.parse("19/10/2018");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.donGia = 0;
        this.nhaXuatBan = "";
        this.soLuong = 0;
    }

    public void nhapSach() {
        System.out.println("Nhap thong tin sach");
        this.maSach = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay xuat ban");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngay = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap don gia");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhap nha xuat ban");
        this.nhaXuatBan= new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong");
        this.soLuong = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", ngay=" + ngay +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
}
