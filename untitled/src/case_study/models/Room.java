package case_study.models;

public class Room extends Facility{
   private int tieuChuanPhong,soTang;

    public Room() {
    }

    public Room(String tenDichVu, String kieuThue, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int tieuChuanPhong, int soTang) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
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

    @Override
    public String toString() {
        return "Room{" +
                "tieuChuanPhong=" + tieuChuanPhong +
                ", soTang=" + soTang +
                '}';
    }
}
