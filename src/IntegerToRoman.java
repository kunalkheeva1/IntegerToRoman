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

    //creating another method to improve the efficiency without using any extra space
    public static String integerToRoman2(int num){
        //I will take two arrays of both the numbers
        int [] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code= {"M","CM", "D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};

    //will store the result in the string builder so that i can use append
        StringBuilder sb = new StringBuilder();
        //loop thru intCode
        for(int i=0; i<intCode.length; i++){
            //runs until the num becomes less than any number in intCode
            while(num>=intCode[i]){
                sb.append(code[i]);
                //after appending subtract the number from provided number and then back to the loop
                //until the number becomes less than num
                num = num- intCode[i];
            }
        }return sb.toString();   // then return my sb, which has my desired value of int to roman
    }




    public static void main(String[] args) {
        System.out.println(integerToRoman(2103));
        System.out.println(integerToRoman2(2103));

    }
}
