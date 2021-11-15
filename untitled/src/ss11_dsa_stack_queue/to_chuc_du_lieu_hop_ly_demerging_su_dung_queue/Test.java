package ss11_dsa_stack_queue.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        List<NhanSu> nhanSus = new ArrayList<>();
        nhanSus.add(new NhanSu("tài1", "nam", 3, 4, 2009));
        nhanSus.add(new NhanSu("tài2", "nữ", 3, 6, 2003));
        nhanSus.add(new NhanSu("tài3", "nam", 3, 4, 2009));
        nhanSus.add(new NhanSu("tài4", "nữ", 5, 7, 2007));
        Queue<NhanSu> NU = new LinkedList<>();
        Queue<NhanSu> NAM = new LinkedList<>();
        Collections.sort(nhanSus);
        for (NhanSu person : nhanSus) {
            if (person.gioiTinh.equals("nữ")) {
                NU.add(person);
            } else {
                NAM.add(person);
            }
        }
        for (NhanSu nu:NU) {
            System.out.println(nu);
        }
        for (NhanSu nam:NAM) {
            System.out.println(nam);
        }
    }
}
