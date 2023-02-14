import java.util.Arrays;
import java.util.Random;

public class S1 {

    public static void main(String[] args) { //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random rnd = new Random();
        int i = rnd.nextInt(2000);
        System.out.println(i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int count = 0;

        for (int j = Short.MIN_VALUE; j < i ; j++) {
            if (j % n == 0)
                count++;
        }
        int[] m1 = new int[count];

        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0){
                m1[count++] = j;
            }

        }
        System.out.println(Arrays.toString(m1));
    }

}
