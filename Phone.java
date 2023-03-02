package Lesson1;

public class Phone {
    public static void main(String[] args) {
        Phone apple = new Phone(587, "IPhone 14", 187.5);
        Phone samsung = new Phone(933, "Galaxy S23", 212.4);
        Phone oppo = new Phone(215, "Find N2", 222.36);
        System.out.println("Num: " + apple.number + ", " + "Model: " + apple.model + ", " + "Weight: " + apple.weight);
        System.out.println("Num: " + samsung.number + ", " + "Model: " + samsung.model + ", " + "Weight: " + samsung.weight);
        System.out.println("Num: " + oppo.number + ", " + "Model: " + oppo.model + ", " + "Weight: " + oppo.weight);

        apple.recieveCall("Ted");
        samsung.recieveCall("Bill");
        oppo.recieveCall("Anna");

        System.out.println(apple.getNumber());
        System.out.println(samsung.getNumber());
        System.out.println(oppo.getNumber());
    }
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void recieveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }
}
