package domain;

/**
 * Клас Exercise реалізує методи для обчислення кількості "щасливих" трамвайних квитків.
 * "Щасливим" вважається квиток, у якого сума перших трьох цифр дорівнює сумі останніх трьох.
 * Діапазон квитків: від 000000 до 999999.
 */
public class Exercise {
    /**
     * Обчислює кількість "щасливих" трамвайних квитків у діапазоні від 000000 до 999999.
     *
     * @return Кількість квитків, у яких сума перших трьох цифр дорівнює сумі останніх трьох.
     */
    public static int Calculate() {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            int left = (i / 1000);
            int right = (i % 1000);
            if (digitSum(left) == digitSum(right)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Обчислює суму цифр тризначного числа.
     *
     * @param number Тризначне число, для якого потрібно обчислити суму цифр.
     * @return Сума цифр числа.
     */
    private static int digitSum(int number) {
        return number / 100 + (number / 10) % 10 + number % 10;
    }
}

