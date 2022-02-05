package one;

public class Sum_in_String {
    static int Sum(String str) // Функция для вычисления суммы всех имеющихся чисел в строке
    {
        String part_of_String;
        if(str==""){//пустая строка-> выводится ноль
            part_of_String="0";
        }
        else{//чтобы программа не выводила ошибок, при тесте нескольких примеров
            part_of_String="0";
        }
        int sum = 0;
        for(int i = 0; i < str.length(); i++) // читаем каждый символ во входной строке
        {
            char symbol = str.charAt(i);
            // если текущий символ является цифрой
            if (Character.isDigit(symbol))
                part_of_String += symbol;
            else
            {
                sum += Integer.parseInt(part_of_String);
                part_of_String = "0";
            }
        }
        return sum + Integer.parseInt(part_of_String);
    }
    public static void main (String[] args)
    {
        String ex1 = "45_part1_34*23";
        System.out.println(Sum(ex1));
        String ex2 = "one1two2three3";
        System.out.println(Sum(ex2));
        String ex3 = "=-321+?231/312";
        System.out.println(Sum(ex3));
        String ex4 = "e3422dasdasd4432gfdg3";
        System.out.println(Sum(ex4));
        String ex5 = "";//пустая строка-> выводится ноль
        System.out.println(Sum(ex5));
    }
}
