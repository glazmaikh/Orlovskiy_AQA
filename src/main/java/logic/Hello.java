package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hello {

    public static void main(String[] args) throws IOException {

        // if enter 8 result "Привет"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("Введите число");
        while ((s = reader.readLine()) != null){
            try {
                if (Integer.parseInt(s) > 7){
                    System.out.println("Привет");
                    break;
                } else {
                    System.out.println("try again");
                }
            } catch (NumberFormatException e){
                System.out.println("NumberFormatException!!! use int values");
                e.printStackTrace();
            }
        }

        // if enter Вячеслав result "Привет, Вячеслав"
        String s1;
        System.out.println("Введите имя");
        while ((s1 = reader.readLine()) != null){
            if (s1.equals("Вячеслав")){
                System.out.println("Привет, " + s1);
                break;
            } else if (s1.equals("quit")){
                System.exit(0);
            } else {
                System.out.println("Нет такого имени");
            }
        }
        reader.close();

        //return reminder of division by 3
        int[] mass = {1, 3, 5, 7, 9, 0};
        System.out.println("числа которые деляться без остатка на 3 из массива " + Arrays.toString(mass));
        Mass.modulo(mass);
    }
}
