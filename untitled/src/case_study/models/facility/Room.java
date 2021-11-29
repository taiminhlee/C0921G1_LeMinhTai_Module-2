package case_study.models.facility;

import case_study.models.facility.Facility;

import java.util.Objects;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String tenDichVu, String kieuThue, double dienTichSuDung, String chiPhiThue, int soNguoiToiDa, String dichVuMienPhiDiKem) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", dichVuMienPhiDiKem=" + dichVuMienPhiDiKem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return Double.compare(room.getDienTichSuDung(), getDienTichSuDung()) == 0 &&
                Objects.equals(room.getChiPhiThue(), getChiPhiThue()) &&
                getSoNguoiToiDa() == room.getSoNguoiToiDa() &&
                Objects.equals(getTenDichVu(), room.getTenDichVu()) &&
                Objects.equals(getKieuThue(), room.getKieuThue()) &&
                Objects.equals(dichVuMienPhiDiKem, room.dichVuMienPhiDiKem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),dichVuMienPhiDiKem);
    }
}
