package com.vuviethung.bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhap so luong xe noi thanh");
        int a= new Scanner(System.in).nextInt();
        System.out.println("NhapSo luong xe Ngoai Thanh");
        int b= new Scanner(System.in).nextInt();
        Manager manager = new Manager(a,b);
        manager.nhapDanhSachXeNoiThanh();
        manager.nhapDanhSachXeNgoaiThanh();
        manager.xuatDanhSachXeNoiThanh();
        manager.xuatDanhSachXeNgoaiThanh();
        System.out.println(manager.tongDoanhThuXeNoiThanh());
        System.out.println(manager.tongDoanhThuXeNgoaiThanh());


    }
}
