package ss10_dsa_danh_sanh.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java;

public class MyListTest {
    static class Person {
        int age;
        String name;

        public Person() {
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return " name=" + name + ", age=" + age;

        }

        @Override
        public boolean equals(Object obj) {
            return name.equals(((Person) obj).name)&& age==((Person) obj).age;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyList<Person> myList = new MyList<>(1);
        myList.ensureCapacity(4);
        myList.add(new Person(3, "tài"));
        myList.add(new Person(2, "tài1"));
        myList.add(new Person(23, "tài2"));
        myList.add(new Person(16, "tài3"));
        myList.add(3, new Person(18, "tài4"));
         MyList<Person> myNewList=myList.clone();
         myNewList.remove(2);
        for (int i = 0; i < myNewList.size; i++) {
            System.out.println(myNewList.get(i).toString());
        }
        int index =myNewList.indexOf(new Person(3,"tài"));
        boolean check =myNewList.contains(new Person(3,"tài"));
        System.out.println("index "+index);
        System.out.println("check "+check);
    }
}
