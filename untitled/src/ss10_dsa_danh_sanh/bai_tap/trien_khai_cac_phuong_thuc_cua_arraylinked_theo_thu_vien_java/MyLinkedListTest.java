package ss10_dsa_danh_sanh.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylinked_theo_thu_vien_java;


import ss10_dsa_danh_sanh.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java.MyListTest;

public class MyLinkedListTest {
    public static class Person1 {
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
                    && this.age == ((Person1) obj).age;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Person1> myLinkedList = new MyLinkedList<>();
        myLinkedList.addfirst(new Person1("tài", 23));
        myLinkedList.addLast(new Person1("tài1", 4));
        myLinkedList.add(3,new Person1("tài2", 4));
        MyLinkedList<Person1> myNewLinkedList=myLinkedList.clone();
        myNewLinkedList.remove(new Person1("tài3",23));
        myNewLinkedList.remove(2);
        for (int i = 0; i <myNewLinkedList.size()&&myNewLinkedList.get(i) !=null; i++) {
            System.out.println(myNewLinkedList.get(i).toString());
        }
       int index=myNewLinkedList.indexOf(new Person1("tài3",23));
        boolean check=myNewLinkedList.contains(new Person1("tài2",4));
        System.out.println("index "+index);
        System.out.println("check "+check);
    }
}
