package singleton;

public class Main {
    public static void main(String[] args) {

        final int SIZE = 1000;

        Singleton arr[] = new Singleton[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = Singleton.getInstance();
        }

        System.out.println(Singleton.counter);

    }

    static class Singleton {
        public static int counter = 0;
        private static Singleton instance;

        private Singleton() {
            counter++;
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
