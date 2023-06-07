package Dz1;

import java.util.Random;

//2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//   и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//   необходимо как-то оповестить пользователя.
public class Dz1_2 {
    public static void main(String[] args) {
        for (int item: resultMassiv(createMassiv(), createMassiv())) {
            System.out.print(item + " ");
        }
    }
    public static int[] createMassiv(){
        int[] massiv = new int[new Random().nextInt(5,7)];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = new Random().nextInt(10);
        }
        return massiv;
    }

    public static int[] resultMassiv(int[] massiv1, int[] massiv2){
        if (massiv1.length != massiv2.length){
            System.out.println("У массивов разная длинна");
            int[] m = {-1};
            return m;
        }
        int[] result = new int[massiv1.length];
        for (int i = 0; i < massiv1.length; i++) {
            result[i] = massiv1[i] - massiv2[i];
        }
        return result;
    }
}
