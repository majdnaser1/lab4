package day4;

public class ex2 {

    public static void main (String[]args){

       int t=check1(8);

    }
    public static int check1(int number) {

        try {
            if (!(number % 5 == 0)) {
                throw new Exception("NOT divided 5");
            }
            return number / 5;
        } catch (Exception e) {
            return 0;
        }

    }
}
