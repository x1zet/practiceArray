import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        // В области 12 районов. Известны количество жителей (в тысячах человек) и площадь (в км2) каждого района.
        // Определить среднюю плотность населения по области в целом

//        int[] population = {500, 300, 400, 450, 600, 350, 200, 300, 550, 650, 480, 370};
//        double[] area = {100, 80, 90, 110, 120, 95, 85, 105, 110, 130, 95, 85};
//
//        int totalPopulation = 0;
//        double totalArea = 0;
//
//        for (int i = 0; i < population.length; i++) {
//            totalPopulation += population[i];
//            totalArea += area[i];
//        }
//
//        double averageDensity = totalPopulation/totalArea;
//        System.out.println("Средняя плотность населения по области в целом: " + averageDensity);

        //Известны оценки по физике каждого ученика двух классов.
        //Определить среднюю оценку в каждом классе, и в каком классе успеваемость лучше.
        //Количество учащихся в каждом классе – 15 учеников

//        int[] scoreClassOne ={5,5,5,4,5,3,4,5,5,5,3,4,5,3,4};
//        int[] scoreClassTwo ={5,4,3,2,5,5,5,5,3,3,4,2,2,4,5};
//
//        double totalScoreClassOne = 0;
//        double totalScoreClassTwo = 0;
//
//
//        double averageScoreClassOne = 0;
//        double averageScoreClassTwo = 0;
//
//        for (int i = 0; i < scoreClassOne.length; i++) {
//            totalScoreClassOne += scoreClassOne[i];
//            averageScoreClassOne = totalScoreClassOne / scoreClassOne.length;
//        }
//        System.out.println(averageScoreClassOne);

//        for (int i = 0; i < scoreClassTwo.length; i++) {
//            totalScoreClassTwo += scoreClassTwo[i];
//            averageScoreClassTwo = totalScoreClassTwo / scoreClassTwo.length;
//        }
//
//        if (averageScoreClassOne > averageScoreClassTwo){
//            System.out.println("Первый класс умнее второго");
//        } else if (averageScoreClassOne < averageScoreClassTwo) {
//            System.out.println("Второй класс умнее первого");
//        } else if (averageScoreClassOne == averageScoreClassTwo) {
//            System.out.println("Классы в одинаковой успеваемостью");
//        } else {
//            System.out.println("Error");
//        }
//
//        System.out.println("Средняя оценка в первом классе: " + averageScoreClassOne);
//        System.out.println("Средняя оценка во втором классе: " + averageScoreClassTwo);

        // Известен возраст (в годах в виде 14,5 лет и т. п.) каждого ученика двух классов.
        // Определить средний возраст учеников каждого класса.
        // В каждом классе учатся 20 человек

//        int[] ageStudentsInFirstClass = new int[20];
//        ageStudentsInFirstClass[0] = 14;
//        ageStudentsInFirstClass[1] = 14;
//        ageStudentsInFirstClass[2] = 14;
//        ageStudentsInFirstClass[3] = 14;
//        ageStudentsInFirstClass[4] = 15;
//        ageStudentsInFirstClass[5] = 15;
//        ageStudentsInFirstClass[6] = 15;
//        ageStudentsInFirstClass[7] = 15;
//        ageStudentsInFirstClass[8] = 16;
//        ageStudentsInFirstClass[9] = 16;
//        ageStudentsInFirstClass[10] = 17;
//        ageStudentsInFirstClass[11] = 13;
//        ageStudentsInFirstClass[12] = 17;
//        ageStudentsInFirstClass[13] = 17;
//        ageStudentsInFirstClass[14] = 18;
//        ageStudentsInFirstClass[15] = 20;
//        ageStudentsInFirstClass[16] = 12;
//        ageStudentsInFirstClass[17] = 14;
//        ageStudentsInFirstClass[18] = 15;
//        ageStudentsInFirstClass[19] = 19;
//
//
//        int[] ageStudentsInSecondClass = new int[20];
//        ageStudentsInSecondClass[0] = 20;
//        ageStudentsInSecondClass[1] = 20;
//        ageStudentsInSecondClass[2] = 20;
//        ageStudentsInSecondClass[3] = 21;
//        ageStudentsInSecondClass[4] = 21;
//        ageStudentsInSecondClass[5] = 21;
//        ageStudentsInSecondClass[6] = 21;
//        ageStudentsInSecondClass[7] = 22;
//        ageStudentsInSecondClass[8] = 22;
//        ageStudentsInSecondClass[9] = 22;
//        ageStudentsInSecondClass[10] = 22;
//        ageStudentsInSecondClass[11] = 23;
//        ageStudentsInSecondClass[12] = 23;
//        ageStudentsInSecondClass[13] = 25;
//        ageStudentsInSecondClass[14] = 25;
//        ageStudentsInSecondClass[15] = 24;
//        ageStudentsInSecondClass[16] = 25;
//        ageStudentsInSecondClass[17] = 24;
//        ageStudentsInSecondClass[18] = 26;
//        ageStudentsInSecondClass[19] = 19;
//
//
//        int total1 = 0;
//        int total2 = 0;
//
//        double averageAgeInFirstClass = 0;
//        double averageAgeInSecondClass = 0;
//
//        for (int i = 0; i < ageStudentsInFirstClass.length; i++) {
//            total1 += ageStudentsInFirstClass[i];
//            averageAgeInFirstClass = total1/ageStudentsInFirstClass.length;
//        }
//        System.out.println("Средний возраст в первом классе: " + averageAgeInFirstClass);
//
//        for (int i = 0; i < ageStudentsInSecondClass.length; i++) {
//            total2 += ageStudentsInSecondClass[i];
//            averageAgeInSecondClass = total2/ageStudentsInSecondClass.length;
//        }
//        System.out.println("Средний возраст в первом классе: " + averageAgeInSecondClass);

        // Дан массив целых чисел. Размер массива пользователь вводит с клавиатуры.
        // Выяснить верно ли, что сумма элементов массива есть четное число

//        System.out.println("Введите размер массива: ");
//        int sizeArr = new Scanner(System.in).nextInt();
//
//        int[] numbers = new int[sizeArr];
//        Random random = new Random();
//        int summ = 0;
//        for (int i = 0; i < sizeArr; i++) {
//            numbers[i] = random.nextInt(100);
//            summ += numbers[i];
//        }
//        if (summ % 2 == 0){
//            System.out.println("Сумма элементов массива четное");
//        } else {
//            System.out.println("Сумма элементов массива нечетное");
//        }
//
//        System.out.println(Arrays.toString(numbers));

        // Известна масса каждого предмета, загружаемого в автомобиль.
        // Определить общую массу груза. Проверить хватит ли грузоподъёмности автомобиля для перевозки груза.
        // Грузоподъемность вводится с клавиатуры. Известно, что количество загружаемых предметов – 5шт

//        System.out.println("Введите грузоподъёмность автомобиля для перевозки груза:  ");
//        int weightCar = new Scanner(System.in).nextInt();
//
//        int[] subjectWeight = new int[5];
//        subjectWeight[0] = 5;
//        subjectWeight[1] = 2;
//        subjectWeight[2] = 10;
//        subjectWeight[3] = 15;
//        subjectWeight[4] = 30;
//
//        int summSubjectWeight = 0;
//
//        for (int i = 0; i < subjectWeight.length; i++) {
//            summSubjectWeight += subjectWeight[i];
//        }
//
//        if (weightCar >= summSubjectWeight){
//            System.out.println("Хватит");
//        } else{
//            System.out.println("Не хватит");
//        }

        // Известны оценки ученика по 10 предметам.
        // Определить минимальную и максимальную оценку.
        // Оценки хранятся в десятичном формате (3.5 - 4.8 и тд)

//        double[] score = new double[10];
//
//        score[0] = 3.6;
//        score[1] = 4.6;
//        score[2] = 5;
//        score[3] = 2.45;
//        score[4] = 3.3;
//        score[5] = 3;
//        score[6] = 4;
//        score[7] = 4.5;
//        score[8] = 4.3;
//        score[9] = 3.9;
//
//        double minScore = score[0];
//        double maxScore = score[0];
//
//        for (int i = 1; i < score.length; i++) {
//            if (maxScore < score[i]){
//                maxScore = score[i];
//            }
//        }
//
//        for (int i = 1; i < score.length; i++) {
//            if (minScore > score[i]){
//                minScore = score[i];
//            }
//        }
//
//        System.out.println("Максимальная оценка: " + maxScore);
//        System.out.println("Минимальная оценка: " + minScore);

        //Дан массив целых чисел.
        //Выяснить верно ли, что сумма элементов массива есть нечетное число

//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//
//        int summNumbers = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            summNumbers += numbers[i];
//        }
//
//        if (summNumbers % 2 != 0){
//            System.out.println("Сумма чисел массива нечетное: " + summNumbers);
//        } else {
//            System.out.println("Сумма чисел массива четное: " + summNumbers);
//        }

        // Заполнить массив, состоящий из 30 элементов случайными числами в пределах от 1 до 9.

//        double[] numbers = new double[30];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = new Random().nextDouble(10);
//        }
//
//        System.out.println(Arrays.toString(numbers));

        // В ведомости указана зарплата, выплаченная каждому из сотрудников фирмы за месяц.
        // Определить общую сумму выплаченных по ведомости денег.
        // Определить максимальную и минимальную зарплату в фирме. Известно, что в фирме работает 30 человек.

//        int[] salary = new int[30];
//
//        int totalSalary = 0;
//
//
//
//        for (int i = 0; i < salary.length; i++) {
//            salary[i] = new Random().nextInt(30000) + 60000;
//        }
//
//        int minSalary = salary[0];
//        int maxSalary = salary[0];
//
//        for (int i : salary) {
//            totalSalary += i;
//        }
//
//        for (int i = 1 ; i < salary.length; i++) {
//            if (maxSalary < salary[i]){
//                maxSalary = salary[i];
//            }
//        }
//
//        for (int i = 0; i < salary.length; i++) {
//            if (minSalary > salary[i]){
//                minSalary = salary[i];
//            }
//        }
//
//        System.out.println("Общая сумма: " + totalSalary);
//        System.out.println("Максимальная зп: " + maxSalary);
//        System.out.println("Минимальная зп: " +  minSalary);


        // В массиве хранятся сведения об оценках 25 учеников по Информатике.
        // Определить количество неуспевающих учеников, троечников, ударников и отличников.
        // А также выяснить каких учеников больше.

        int[] grades = new int[25];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Random().nextInt(4) + 2;
        }

        int failing = 0;   // Количество неуспевающих (оценка < 3)
        int threes = 0;    // Количество троечников (оценка == 3)
        int fours = 0;     // Количество ударников (оценка == 4)
        int excellent = 0;

        for (int grade : grades) {
            if (grade < 3) {
                failing++;  // Неуспевающий ученик
            } else if (grade == 3) {
                threes++;   // Троечник
            } else if (grade == 4) {
                fours++;    // Ударник
            } else if (grade == 5) {
                excellent++; // Отличник
            }
        }
        System.out.println("Оценки учеников: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\n");

        System.out.println("Неуспевающие: " + failing);
        System.out.println("Троечники: " + threes);
        System.out.println("Ударники: " + fours);
        System.out.println("Отличники: " + excellent);

    }
}
