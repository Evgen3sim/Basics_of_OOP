package by.epam.task3;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.*/

import java.util.Arrays;

public class Calendar {

    private Days[] days;

    {
        days = new Days[3];
    }

    public void addDay(Days day){
        if (day != null){
            for (int i = 0; i < days.length; i++){
                if (days[i] == null){
                    days[i] = day;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "days=" + Arrays.toString(days) +
                '}';
    }

    public class Days {

        private int number;
        private int month;
        private int year;
        private String day;
        private String info;

        public Days(int number, int month, int year, String day, String info) {
            this.number = number;
            this.month = month;
            this.year = year;
            this.day = day;
            this.info = info;
        }

        public int getNumber() {
            return number;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public String getDay() {
            return day;
        }

        public String getInfo() {
            return info;
        }

        public Days[] days(){
            return days;
        }

        @Override
        public String toString() {
            return "\n Days{" +
                    "number=" + number +
                    ", month=" + month +
                    ", year=" + year +
                    ", day='" + day + '\'' +
                    ", info='" + info + '\'' +
                    '}';
        }
    }

    public void calendar(){

        Calendar calendar = new Calendar();

        calendar.addDay(new Days( 3, 8, 2019,"Saturday", "Day off"));
        calendar.addDay(new Days(12, 8,2019,"Monday", "International Youth Day"));
        calendar.addDay(new Days(15, 8,2019,"Thursday", "Archaeologist's Day"));


        System.out.println(calendar.toString());

    }
}
