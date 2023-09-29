package qu.guru;

public class Human {

    public static String commonName = "Человек";

    int age = 0;
    int weight;
    String name;
    Head head;
    static class Head {
        static String name = "";
        String nonStaticName;

        public void  sayName() {
            System.out.println(name);
        }
    }


    public Human(int weight) {
        this.weight = weight;
    }
    public Human(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void sayName() {System.out.println("имя: " + name);}

    public void sayAge() {System.out.println("Возраст :" + age);}

    public void sayWeight() {
        System.out.println("Вес :" + weight);
    }

    public void incrementAge() {
        this.getClass().getName();
        age = age + 19;
    }

    public static void  sayClassName() {

        System.out.println(Human.class.getName());
    }
}
