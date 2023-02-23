import java.util.HashMap;
import java.util.TreeMap;
//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
//Изменить значения дописав восклицательные знаки.
//*Создать TreeMap, заполнить аналогично.
//*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
//**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
public class HW_5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "yellow");
        map.put(3, "blue");
        System.out.println(map);

        map.put(1, "red!");
        map.put(2, "yellow!");
        map.put(3, "blue!");
        System.out.println(map);
        TreeMap<Integer,String> trm = new TreeMap();
        trm.put(1, "red!");
        trm.put(2, "yellow!");
        trm.put(3, "blue!");
        System.out.println(trm);

        for (int i = 0; i < 1000; i++){
            map.put(i, "");
        }
        for (int j = 0; j < 1000; j++){
            trm.put(j, "");
        }
        System.out.println(map);
        System.out.println(trm);

        long start1 = System.nanoTime();
        for (Integer key: map.keySet())
            map.get(key);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        for (Integer key: trm.keySet())
            trm.get(key);
        long end2 = System.nanoTime();
        System.out.println("Время перебора map в миллисекундах: " + (end1 - start1));
        System.out.println("Время перебора trm в миллисекундах: " + (end2 - start2));
//



    }

}