package org.example.App;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args){

       startDraw();

    }

    public static void startDraw (){
        int squareLength = getLength();
        int squareHeight = getHeight();
        String word = getWord();
        int letterIncrement = 0;
        drawFigureAndWord( squareLength , squareHeight , letterIncrement ,  word);

    }

    public static String getWord(){
        return new Scanner((System.in)).nextLine();
    }

    public static int getLength(){
        return new Scanner(System.in).nextInt();
    }

    public  static int getHeight(){
        return new Scanner(System.in).nextInt();
    }

    public static void drawFigureAndWord(int squareLength , int squareHeight , int letterIncrement , String word){

        for (int i = 0 ; i <= squareLength ; i++){
            for (int j = 0 ; j <= squareHeight ; j++)
                if (i == 0 || j == 0 || i == squareLength || j == squareHeight) {
                    System.out.print("*");
                } else if ((j >= (squareHeight - word.length()) / 2) && (i == (squareLength / 2))) {
                    if (j <= ((squareHeight - word.length()) / 2) + word.length() - 1) {
                        System.out.print(word.charAt(letterIncrement));
                        letterIncrement++;
                    } else System.out.print(" ");
                } else System.out.print(" ");
            System.out.println(" ");
        }

    }
}
