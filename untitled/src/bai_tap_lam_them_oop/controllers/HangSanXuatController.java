package bai_tap_lam_them_oop.controllers;

import bai_tap_lam_them_oop.services.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatController {
    public static void main(String[] args) {
        List<HangSanXuat> hangSanXuat=new ArrayList<>();
        hangSanXuat.add(new HangSanXuat("HSX-001,Yamaha,Nhật Bản"));
        hangSanXuat.add(new HangSanXuat("HSX-002,Honda,Nhật Bản"));
        hangSanXuat.add(new HangSanXuat("HSX-003, Dongfeng,Trung Quốc"));
        hangSanXuat.add(new HangSanXuat("HHSX-004, Huyndai,Hàn Quốc"));
        hangSanXuat.add(new HangSanXuat("HSX-005, Ford,Mỹ"));
        hangSanXuat.add(new HangSanXuat("HSX-006, Toyota,Nhật Bản"));
        hangSanXuat.add(new HangSanXuat("HSX-006, Hino,Nhật Bản"));
    }
}
