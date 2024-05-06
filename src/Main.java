import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] weights = new int[]{1, 2, 3};
        double[] weightsTwo = {1.57, 7.654, 9.986};
        int[] myArray = {52, 62, 32, 12, 42};

        System.out.println("Задача 2");
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        for (int i = 0; i < weightsTwo.length; i++) {
            if (i == weightsTwo.length - 1) {
                System.out.println(weightsTwo[i]);
                break;
            }
            System.out.print(weightsTwo[i] + ", ");
        }
        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ", ");
        }

        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(weights[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 2; i >= 0; i--) {
            System.out.print(weightsTwo[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i]++;
            }
        }
        System.out.println(Arrays.toString(weights));
    }
}
