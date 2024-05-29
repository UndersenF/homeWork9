public class Main {
    public static void main(String[] args) {
//        task1
        System.out.println("task1");

        int sum = 0;
        int[] expenditures = {4, 8, 15, 16, 23};
        for (int money : expenditures) {
            sum += money;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", sum);


//        task2
        System.out.println("task2");

        int maxExpenditures = Integer.MIN_VALUE;
        int minExpenditures = Integer.MAX_VALUE;

        for (int number : expenditures) {
            if (maxExpenditures < number) {
                maxExpenditures = number;
            }
        }
        for (int number2 : expenditures) {
            if (minExpenditures > number2) {
                minExpenditures = number2;
            }
        }
        System.out.printf("Минимальная трата за неделю составила %s рублей%n", minExpenditures);
        System.out.printf("Максимальная трата за неделю составила %s рублей%n", maxExpenditures);


//        task3
        System.out.println("task3");

        double sumT = 0;
        int[] expendituresT = {4, 8, 15, 16, 23};
        for (int money : expendituresT) {
            sumT += money;
        }
        double averageExpenditure = sumT / expendituresT.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей%n", averageExpenditure);

//        task4
        System.out.println("task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int j = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length / 2; i++, j--) {
            int last = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = (char) last;
        }

        System.out.println(reverseFullName);
    }
}