package ss11_dsa_stack_queue.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import org.jetbrains.annotations.NotNull;

public class NhanSu implements Comparable<NhanSu> {
    String hoTen, gioiTinh;
    int ngaySinh, thangSinh, namSinh;

    public NhanSu() {
    }

    public NhanSu(String hoTen, String gioiTinh, int ngaySinh, int thangSinh, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh:'" + gioiTinh + '\'' +
                ", ngaySinh:" + ngaySinh +
                "thangSinh:" + thangSinh +
                "namSinh" + namSinh +
                '}';
    }

    @Override
    public int compareTo(NhanSu nhanSu) {
        if (this.namSinh == nhanSu.namSinh) {
            if (this.thangSinh == nhanSu.thangSinh) {
                if (this.ngaySinh == nhanSu.ngaySinh) {
                    return this.hoTen.compareTo(nhanSu.hoTen);
                } else {
                    return this.ngaySinh - nhanSu.ngaySinh;
                }
            } else {
                return this.thangSinh - nhanSu.thangSinh;
            }
        } else {
            return this.namSinh - nhanSu.namSinh;
        }
    }
}
