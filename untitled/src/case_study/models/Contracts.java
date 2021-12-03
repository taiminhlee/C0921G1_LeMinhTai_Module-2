package case_study.models;

public class Contracts {
    int soHopDong;
    String maBooking,soTienCoc,tongSoTien,maKhanhHang;

    public Contracts() {
    }

    public Contracts(int soHopDong, String maBooking, String soTienCoc, String tongSoTien, String maKhanhHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.tongSoTien = tongSoTien;
        this.maKhanhHang = maKhanhHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(String soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public String getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(String tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public String getMaKhanhHang() {
        return maKhanhHang;
    }

    public void setMaKhanhHang(String maKhanhHang) {
        this.maKhanhHang = maKhanhHang;
    }

    @Override
    public String toString() {
        return  soHopDong + "," + maBooking + "," + soTienCoc + "," + tongSoTien + "," + maKhanhHang ;
    }
}
