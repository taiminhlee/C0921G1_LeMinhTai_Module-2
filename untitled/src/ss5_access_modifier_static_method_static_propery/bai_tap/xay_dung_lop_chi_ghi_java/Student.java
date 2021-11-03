package ss5_access_modifier_static_method_static_propery.bai_tap.xay_dung_lop_chi_ghi_java;

public class Student {
    private String name="John";
    private String classes="CO2";
    Student(){}

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
