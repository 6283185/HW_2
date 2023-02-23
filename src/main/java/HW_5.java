import java.util.HashMap;
import java.util.TreeMap;

public class HW_5 {
    public static void main(String[] args) {
        //Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        System.out.println(map);
        //Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        map.put(2, "yellow");
        map.put(3, "blue");
        System.out.println(map);

        //Изменить значения дописав восклицательные знаки.
        map.put(1, "red!");
        map.put(2, "yellow!");
        map.put(3, "blue!");
        System.out.println(map);
        //*Создать TreeMap, заполнить аналогично.
        TreeMap<Integer,String> trm = new TreeMap();
        trm.put(1, "red!");
        trm.put(2, "yellow!");
        trm.put(3, "blue!");
        System.out.println(trm);
        //*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
        for (int i = 0; i < 1000; i++){
            map.put(i, "");
        }
        for (int z = 0; z < 1000; z++){
            trm.put(z, "");
        }
        System.out.println(map);
        System.out.println(trm);
        //**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
        long start1 = System.currentTimeMillis();
        for (Integer key: map.keySet())
            map.get(key);
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for (Integer key: trm.keySet())
            trm.get(key);
        long end2 = System.currentTimeMillis();
        System.out.println("Время перебора map: " + (end1 - start1));
        System.out.println("Время перебора trm: " + (end2 - start2));
//



    }

}