package bai_tap_lam_them_oop.services;

import bai_tap_lam_them_oop.controllers.HangSanXuatController;
import bai_tap_lam_them_oop.models.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oToImpl implements Services {
    Scanner input=new Scanner(System.in);
    String bienSo,chuSoHuu,kieuXe;
    HangSanXuatController hangSanXuatController;
    int namSanXuat,soChoNgoi;
    List<Oto> oto=new ArrayList<>();


    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }

    @Override
    public void add() {
    oto.add(new Oto(bienSo,hangSanXuatController ,namSanXuat,chuSoHuu,soChoNgoi,kieuXe));
    }
}
