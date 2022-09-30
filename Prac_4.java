public class Prac_4 extends Thread {
    public void run() {
    }
    public static void main(String[] args) {
        Prac_4 FIRST = new Prac_4();
        Prac_4 SECOND = new Prac_4();
        Prac_4 THIRD = new Prac_4();

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("Priority of FIRST Thread:" + FIRST.getPriority());
        System.out.println("Priority of SECOND Thread:" + SECOND.getPriority());
        System.out.println("Priority of THIRD Thread:" + THIRD.getPriority());

//Prepared by Prasan_21CE121
    }
}

