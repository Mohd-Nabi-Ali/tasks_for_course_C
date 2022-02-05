package one;

public class Sum_in_Int {
    public static void main(String[] args) {
        //Если нам надо найти сумму цифр в числе
        ////////////////////////////////////////
        int number = 321;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
        ////////////////////////////////////////
    }
}
