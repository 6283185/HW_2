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
        int[] m1 = new int[Short.MAX_VALUE];
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0)
                m1[j] = j;
        }
        System.out.println(Arrays.toString(m1));

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = new int[Short.MAX_VALUE];
        for (int k = Short.MIN_VALUE; k <= i; k++) {
            if (k % n != 0){
                m2[k] = k;
            }

        }
        System.out.println(Arrays.toString(m2));
    }

}
