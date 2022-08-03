package day4;

import java.lang.reflect.Array;

public class ex1 {

    public static void main(String[]args){

        String names[]={"sara","majd","reema"};

        try {
            System.out.println(names[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.printf("error massage");
        }




    }



}

