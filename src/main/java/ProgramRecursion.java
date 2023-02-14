// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class ProgramRecursion {
    public static void main(String[] args) {
        String source = "GeekBrains\n";
        System.out.print(source);

        if(source.length() > 0) {
            reverseString(source, source.length() - 1);
        }
    }
    public static void reverseString(String source, int index) {
        if(index == 0) {
            System.out.println(source.charAt(index));

            return;
        }
        System.out.print(source.charAt(index));
        reverseString(source, index - 1);


    }
}