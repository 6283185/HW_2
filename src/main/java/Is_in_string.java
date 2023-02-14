//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

public class Is_in_string {
    public static void main(String[] args)
    {
        String source_string = "GeekBrains";

        CharSequence seq = "Brain";
        boolean is_in_string = source_string.contains(seq);
        System.out.println("Было ли вхождение: " + is_in_string);


    }


}