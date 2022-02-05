package one;

public class Sum_in_String {
    // Функция для вычисления суммы всех имеющихся чисел
    // в строке, содержащей буквенно-цифровые символы
    static int Sum(String str)// Функция для вычисления суммы всех имеющихся чисел в строке
    {
        String time_number = "0";
        int sum = 0;
        for(int i = 0; i < str.length(); i++)// цикл, читающий каждый символ во входной строке
        {
            char ch = str.charAt(i);//текущий символ
            if (Character.isDigit(ch)) {// проверка на то, чтобы символ был числом
                time_number += ch;
            }
            else
            {
                sum += Integer.parseInt(time_number);//увеличиваем сумму на найденное ранее число, если нашли его
                time_number = "0";//бнуляем, чтобы найти новое число и записать его в переменную
            }
        }
        return sum + Integer.parseInt(time_number);
    }
    // Код драйвера
    public static void main (String[] args)
    {
        // вводим буквенно-цифровую строку
        String ex1 = "Exam-12_56!3+4";//12+56+3+4=75
        String ex2 = "one1two2hree3";//1+2+3=6
        String ex3 = "*123/76";//123+76=199
        String ex4 = "asds23dsa3fd45fvd5";//23+3+45+5=76
        System.out.println(Sum(ex1));
        System.out.println(Sum(ex2));
        System.out.println(Sum(ex3));
        System.out.println(Sum(ex4));
    }
}
