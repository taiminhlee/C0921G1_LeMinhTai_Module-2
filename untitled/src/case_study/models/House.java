package case_study.models;

public class House extends Facility{
   private int tieuChuanPhong,soTang;
   private double dienTichHoBoi;

    public House() {
    }

    public House(String tenDichVu, String kieuThue, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int tieuChuanPhong, int soTang, double dienTichHoBoi) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(int tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong=" + tieuChuanPhong +
                ", soTang=" + soTang +
                ", dienTichHoBoi=" + dienTichHoBoi +
                '}';
    }
}
