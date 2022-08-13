import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int number = 0;
        while( number < 10 ) {
            System.out.print(++number + " ");
        }
        System.out.println();
        for (; number > 0; --number) {
            System.out.print(number + " ");
        }
        System.out.println();

        //Задача 2
        int Friday = 5;
        for ( int nextFriday = Friday; nextFriday <= 31; nextFriday += 7 ){
            System.out.println("Сегодня пятница, " + nextFriday + " число. Необходимо подготовить отчет.");
        }

        //Задача 3
        int nextYear = 2022;
        int start = nextYear - 200;
        int end = nextYear + 100;
        for (int year = start; year < end; year ++){
            if ( year % 79 == 0){
                System.out.println(year);
            }
        }





    }
}