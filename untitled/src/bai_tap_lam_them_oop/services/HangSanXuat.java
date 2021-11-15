package bai_tap_lam_them_oop.services;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuat {
    String hangSanXuat;

    public HangSanXuat() {
    }

    public HangSanXuat(String hangSanXuat) {
       this.hangSanXuat=hangSanXuat;
    }


    @Override
    public String toString() {
        return hangSanXuat;
    }
}
