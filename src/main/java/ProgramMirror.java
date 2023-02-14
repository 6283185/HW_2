class ProgramMirror {
    public static boolean isMirror(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }
    public static void main (String[] args)
    {
        String str1 = "GEEK";
        String str2 = "KEEG";

        if (isMirror(str1, str2))
            System.out.println("Строки зеркальные друг другу");
        else
            System.out.printf("Строки не зеркальные друг другу");
    }

}
