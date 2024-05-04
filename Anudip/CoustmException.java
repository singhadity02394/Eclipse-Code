package Anudip;
import java.util.*;
import java.io.*;
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}

public class CoustmException {
    public static void main(String[] args){

        int age =16;
        try{

            if(age<18){
                throw new UnderAgeException("Invalid");
            }
        }catch(UnderAgeException e){
            e.printStackTrace();
        }
    }
}
