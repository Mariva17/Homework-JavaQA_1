package Lesson1;

public class Person {
    public static void main(String[] args) {
        Person boss = new Person();
        Person secretary = new Person("Иван Иванов", 38);
        boss.talk();
        secretary.move();

    }
    String fullName;
    int age;

    public Person () {
        System.out.println("Boss");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит.");
    }
    public void talk() {
        System.out.println(fullName + " говорит речь.");
    }

}

