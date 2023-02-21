// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HW_4
{
    public static void main(String[] args) throws IOException {


        FileWriter writer = new FileWriter("C:/Users/Home/Desktop/GeekBrains/Java/data.sql");
        String txt = "\rИванов И. И. 39 М\n" +
                "Петрова В. С. 20 Ж\n" +
                "Сидоров С. В. 45 М\n" +
                "Пупкин О. С. 50 М\n" +
                "Чернышов Д. И. 37 М";
        writer.write(txt);
        writer.close();


        LinkedList<Integer> age = null;
        try {
            FileReader fr = new FileReader("C:/Users/Home/Desktop/GeekBrains/Java/data.sql");
            String text = "";
            while (fr.ready()) {
                text += (char) fr.read();
            }
            String[] parts = text.split("\n");
            System.out.println(Arrays.toString(parts));

            LinkedList<String> surname = new LinkedList<>();
            LinkedList<String> name = new LinkedList<>();
            LinkedList<String> lastname = new LinkedList<>();
            age = new LinkedList<>();
            LinkedList<Boolean> gender = new LinkedList<>();


            for (int i = 0; i < parts.length; i++) {
                String[] tmp = parts[i].split(" ");
                surname.add(tmp[0]);
                name.add(tmp[1]);
                lastname.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                gender.add(tmp[4].contains("М") ? false : true);

            }
            System.out.println(surname);
            System.out.println(name);
            System.out.println(lastname);
            System.out.println(age);
            System.out.println(gender);
        } catch (IOException e) {
            System.out.println(e.getMessage());

            List index = new ArrayList();

            int count = 0;
            for (int q = 0; q < age.size(); q++) {
                int minAge = 100;
                for (int i = 0; i < age.size(); i++) {
                    if (minAge > age.get(i)) {
                        minAge = age.get(i);
                        count = i;
                    }
                }
                index.add(count);
                int r = minAge + 100;
                age.set(count, r);
            }
            System.out.println(index);
        }

//    for (int i = 1; i < parts.length; i++){
//        String [] sb = parts[i].split(" ");
//        family.add(sb[0] + " ");
//        name.add(sb[1].substring(0, 1) + ".");
//        surname.add(sb[2].substring(0, 1) + "." + " ");
//        age.add(Integer.valueOf(sb[3]));
//        gender.add(sb[4] == "M" ? true : false);
//        index.add(i);
//    }
//
//    for (int j = 0; j < index.size(); j++){
//        System.out.printf(family.get(j));
//        System.out.printf(name.get(j));
//        System.out.printf(surname.get(j));
//        System.out.printf(age.get(j).toString());
//        System.out.printf((gender.get(j) ? "M" : "Ж"));
//        System.out.println();
//
//        }
//
//        String text = "";
//        FileReader reader = new FileReader("C:/Users/Home/Desktop/GeekBrains/Java/data.sql");
//        while (reader.ready ()) {
//            text += (char) reader.read();
//        }
//        reader.close();
//        String [] str = text.split("\r\n");

//        try {
//            FileReader fr = new FileReader("bd.sql");
//            String text = "";
//            while (fr.ready()){
//                text += (char)fr.read();
//            }
//            String[] parts = text.split(",");
//            System.out.println(Arrays.toString(parts));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        ArrayList<String> family = new ArrayList<>();
//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<String> surname = new ArrayList<>();
//        ArrayList<Integer> age = new ArrayList<>();
//        ArrayList<Boolean> gender = new ArrayList<>();
//        LinkedList<Integer> index = new LinkedList<>();
//
//        for (int i = 1; i < str.length; i++){
//            String [] sb = str[i].split(" ");
//
//            family.add(sb[0] + " ");
//            name.add(sb[1].substring(0, 1) + ".");
//            surname.add(sb[2].substring(0, 1) + "." + " ");
//            age.add(Integer.valueOf(sb[3]));
//            gender.add(sb[4] == "M" ? true : false);
//            index.add(i);
//        }
//
//        for (int j = 0; j < index.size(); j++){
//            System.out.printf(family.get(j));
//            System.out.printf(name.get(j));
//            System.out.printf(surname.get(j));
//            System.out.printf(age.get(j).toString());
//            System.out.printf((gender.get(j) ? "M" : "Ж"));
//            System.out.println();
//
//        }


    }

}



