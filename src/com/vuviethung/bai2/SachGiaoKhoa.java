package com.vuviethung.bai2;

import java.util.Date;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
    private int tinhTrang;

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(String maSach, Date ngay, int donGia, int soLuong, String nhaXuatBan,int tinhTrang) {
        super(maSach, ngay, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }
    public SachGiaoKhoa(){
        super();
        this.tinhTrang=0;
    }
    public void nhap(){
        super.nhapSach();
        System.out.println("Nhap tinh trang: \nmoi nhap 1---- cu nhap 0");
        this.tinhTrang=new Scanner(System.in).nextInt();
    }
    public int thanhTien(){
        if (tinhTrang ==1 ){
            return this.getSoLuong()*this.getDonGia();
        }
        return (int)(this.getSoLuong()*this.getDonGia()*0.5f);
    }

    @Override
    public String toString() {
        return super.toString()+
                "SachGiaoKhoa{" +
                "tinhTrang=" + tinhTrang +
                '}';
    }
}
