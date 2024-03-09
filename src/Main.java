import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
    }

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task1(){
            System.out.println("Задание 1");
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        }
        public static void task2() {
        System.out.println("Задание 2");
            int[] arr = generateRandomArray();
            int maxAmountExpenses = Integer.MIN_VALUE;
            int minAmountExpenses = Integer.MAX_VALUE;
            int minIndex = 0;
            int maxIndex =0;
                for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxAmountExpenses){
                    maxAmountExpenses =arr[i];
                    maxIndex =i;
                }
                if (arr[i] < minAmountExpenses){
                    minAmountExpenses = arr[i];
                    minIndex=i;
                }
            }
            System.out.println("Минимальная сумма трат за "+(minIndex+1)+" дней составила "+minAmountExpenses+" рублей.");
            System.out.println("Максимальная сумма трат за "+(maxIndex+1)+" дней составила " +maxAmountExpenses+" рублей.");
    }
    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
            for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            }
            double middleSum =(sum*1.)/arr.length;
        System.out.println("Сумма трат за месяц составила "+middleSum+" рублей");
    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}