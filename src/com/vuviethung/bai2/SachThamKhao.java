package com.vuviethung.bai2;

import java.util.Date;
import java.util.Scanner;

public class SachThamKhao extends Sach{

    private int thue;

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    public SachThamKhao(String maSach, Date ngay, int donGia, int soLuong, String nhaXuatBan, int thue) {
        super(maSach, ngay, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public SachThamKhao(int thue) {
        this.thue = thue;
    }
    public SachThamKhao(){
        this.thue=0;
    }
    public void nhap(){
        super.nhapSach();
        System.out.println("nhap thue");
        this.thue= new Scanner(System.in).nextInt();
    }
    public int thanhTien(){
        return this.getSoLuong()*this.getDonGia()+this.thue;
    }
}
