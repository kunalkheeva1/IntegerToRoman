public class IntegerToRoman {
    //creating a method to return a roman number when input is an integer
    public static String integerToRoman(int num){

        //here i have taken some of the values form 0-9 of romans in arrays

        String [] thousands = {"", "M", "MM", "MMM"};
        String [] hundreds = {"", "C", "CC", "CCC", "CD","D", "DC", "DCC","DCCC","CM"};
        String [] tens = {"", "X", "XX", "XXX", "XL","L","LX","LXX","LXXX","XC"};
        String [] ones = {"", "I", "II","III", "IV","V","VI","VII","VIII","IX"};

        return thousands[num/1000]+         //divide the number by 1000, eg 2103/1000 = 2, and at 2 index MM
                hundreds[(num%1000)/100]+   //then 2103%1000=103/100 = 1, at 1 index C
                tens[(num%100)/10]+         //2103%100=3 /10 = 0 at 0 index _
                ones[num%10];                   //2103%10 =3 at 3 index III
    }




    public static void main(String[] args) {
        System.out.println(integerToRoman(2103));

    }
}
