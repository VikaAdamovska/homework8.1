package com.company;

public class Main {

    public static void main(String[] args) {
       /* 1. Написать метод с переменным числом параметров (...)который считает сумму введенных чисел типа int.
                Отправить результат не Github.
                Формат ответа: ссылка на github репозиторий.*/


        int i = sum(5, 5, 1);

    }

    public static int sum(int... params) {
        int sum = 0;
        for (int i = 0; i < params.length; i++) {
            sum = sum + params[i];
        }
        System.out.println("Сумма: " + sum);

        return sum;
    }
}
