package ss10_dsa_danh_sanh.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylinked_theo_thu_vien_java;



public class MyLinkedListTest {
    public static class Person1{
     String name;
     int age;

        public Person1() {
        }

        public Person1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person1) obj).name)
            && this.age==((Person1) obj).age;
        }
    }

    public static void main(String[] args)  {
        MyLinkedList<Person1> myLinkedList = new MyLinkedList<>();
      myLinkedList.add
    }
}
