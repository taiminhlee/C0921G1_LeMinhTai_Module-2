package ss5_access_modifier_static_method_static_propery.bai_tap.xay_dung_lop_chi_ghi_java;

public class Test {
    public static void main(String[] args) {
        Student testClass=new Student();
        testClass.setName("sdfsf");
        System.out.println("tên: "+testClass.getName());
        testClass.setClasses("234234");
        System.out.print("lớp: "+testClass.getClasses());
    }
}
