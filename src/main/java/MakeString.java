//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().


public class MakeString {
    public static void main(String[] args) {

        int a = 56;
        int b = 3;
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, b - a));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));

//        *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(builder.toString().replaceAll("=", "равно"));

        int index = builder.indexOf("=");
        System.out.println(builder.deleteCharAt(index).insert(index, "равно").toString());
    }
}
