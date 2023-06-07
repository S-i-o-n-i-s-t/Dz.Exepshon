package Dz1;
import java.util.Random;
// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Dz1_1 {
    public static void main(String[] args) {
        for (int item: resultMassiv()) {
            System.out.print(item);
        }
    }
    public static int[] resultMassiv(){
        return division(createMassiv(), createMassiv());
    }
    //Деление массивов. Исключение - деление на ноль
    public static int[] division(int[] massiv1, int[] massiv2){
        int[] massiv3 = new int[massiv1.length];
        sisesMassivs(massiv1, massiv2);
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv2[i] != 0) {
                massiv3[i] = massiv1[i] / massiv2[i];
            }
            else {throw new RuntimeException("Присутствует деление на ноль");}
        }
        return massiv3;
    }
    //Создаем массив с числами не больше 8
    public static int[] createMassiv(){
        int size = new Random().nextInt(5,6);
        int[] massiv = new int[size];
        for (int i = 0; i < size; i++) {
            massiv[i] = new Random().nextInt(9);
            if (massiv[i] <= 8){
                System.out.print(massiv[i]);
            }
            else {
                throw new RuntimeException("Число не соответствует условию");
            }

        }
        System.out.println("\n");
        return massiv;
    }
    // Проверка равенство длинны
    public static void sisesMassivs(int[] massiv1, int[] massiv2){
        if (massiv1.length != massiv2.length){
            throw new RuntimeException("Разная длинна массивов");
        }
    }
}





