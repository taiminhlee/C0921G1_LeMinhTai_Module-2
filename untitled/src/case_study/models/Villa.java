package case_study.models;

public class Villa extends Facility{
    String dichVuMienPhi;

    public Villa() {
    }

    public Villa(String tenDichVu, String kieuThue, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String dichVuMienPhi) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
}
