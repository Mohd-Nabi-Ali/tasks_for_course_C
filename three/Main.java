package threee;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public void task_method() {
        Scanner strInput = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String string = strInput.nextLine();

        string = string.trim();
        string = string.toLowerCase();
        String words[] = string.split(" ");

        for (int j = 0; j < words.length - 1; j++) {
            for (int i = j + 1; i < words.length; i++) {
                if (words[i].compareToIgnoreCase(words[j]) < 0) {
                    String temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }

        for (int i=0; i< words.length; i++){
            System.out.print(words[i]+ "  ");
        }
        System.out.println();
        System.out.println();


        //    "индексы каждой буквы по словам:"
        String vowels = "аеёиоуыэюя";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowels.indexOf(words[i].charAt(j));
            }
        }

        int[] count = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowels.indexOf(words[i].charAt(j));
                if (index >= 0) {
                    count[i] = count[i] + 1;
                }
            }
        }

        System.out.println("количество гласных в словах:");
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();

        //Сортировка выбором (Selection sort)
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if (count[i] < count[j]) {

                    int copy_index = count[i];
                    count[i] = count[j];
                    count[j] = copy_index;

                    String copy = words[i];
                    words[i] = words[j];
                    words[j] = copy;
                }
            }
        }

        System.out.println();
        System.out.println("отсортированые слова по кол-ву гласных в порядке убывания гласных:");

        System.out.println(Arrays.toString(words));

        System.out.println();
        System.out.println("смена первой гласной на заглавную: ");

        int index;
        int[] index_of_first_vowel = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if ("АаЕеЁёИиОоУуЫыЭэЮюЯя".indexOf(words[i].charAt(j)) > -1) {
                    index = j;
                    index_of_first_vowel[i] = index;
                    break;
                }
            }
        }

        int[] indexOfFirstVowel = index_of_first_vowel;
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].substring(0, indexOfFirstVowel[i]) +
                    words[i].substring(indexOfFirstVowel[i], indexOfFirstVowel[i] + 1).toUpperCase() +
                    words[i].substring(indexOfFirstVowel[i] + 1, words[i].length()) + " ");
        }
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.task_method();

    }
}
