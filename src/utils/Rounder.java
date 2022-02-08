package utils;


public class Rounder {


    public static float rounder(double price){
        return ((long) (price < 0 ? price * 100 - 0.5 : price * 100 + 0.5)) / 100;
    }


}
