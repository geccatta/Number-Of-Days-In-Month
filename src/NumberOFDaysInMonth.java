public class NumberOFDaysInMonth {

    public static void main(String[] args) {

        int result;
        result = getDaysInMonth(1,2020);
        System.out.println(result);

        result = getDaysInMonth(2,2020);
        System.out.println(result);

        result = getDaysInMonth(2,2018);
        System.out.println(result);

        result = getDaysInMonth(-1,2020);
        System.out.println(result);

        result = getDaysInMonth(12,10000);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {

        if(year >= 1 && year <= 9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else return false;
                }else return true;
            }else return false;
        }else
            return false;
    }

    public static int getDaysInMonth(int month, int year){
        if((year <1 || year > 9999) || (month <1 || month > 12)) {
            return -1;
        }else{
            if (isLeapYear(year)){
                return switch (month){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 29;
                    default -> 30;
                };
            }else{
                return  switch (month){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 28;
                    default -> 30;
                };
            }
        }
    }
}
