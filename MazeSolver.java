package daily_practice;

import java.util.*;
import java.io.*;

public class MazeSolver {

    static int finalPointsForPlayer=0,finalPointsForPlayerTwo=0;
    public static void main(String[] args) {
    


        Scanner sc = new Scanner(System.in);
        int pointsOfPlayerOne,pointsOfPlayerTwo;
        
        String stringForPlayerOne,stringForPlayerTwo;

        System.out.println("Enter the points of the first player: ");
        pointsOfPlayerOne = sc.nextInt();
        System.out.println("Enter the String for first player ");
        stringForPlayerOne = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the points of the second player: ");
        pointsOfPlayerTwo = sc.nextInt();
        System.out.println("Enter the string for second player: ");
        stringForPlayerTwo = sc.nextLine();
        sc.nextLine();
     


        if((pointsOfPlayerOne <1000 || pointsOfPlayerOne >5000 || pointsOfPlayerTwo <1000 || pointsOfPlayerTwo >5000)){
            System.out.println("Invalid Input 1");
            System.exit(0);
        }
        boolean checkForInvalidCharacterInStringVal = checkForInvalidCharacterInString(stringForPlayerOne,stringForPlayerTwo);
        if((stringForPlayerOne.length()!=stringForPlayerTwo.length()) || !checkForInvalidCharacterInStringVal ){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(playGame(stringForPlayerOne, pointsOfPlayerOne) > playGame(stringForPlayerTwo, pointsOfPlayerTwo)){
            System.out.println("Player 1 Wins!");
        }
        else if(playGame(stringForPlayerOne, pointsOfPlayerOne) < playGame(stringForPlayerTwo, pointsOfPlayerTwo)){
            System.out.println("Player 2 Wins!");
        }
        else if(playGame(stringForPlayerOne, pointsOfPlayerOne) == playGame(stringForPlayerTwo, pointsOfPlayerTwo)){
            System.out.println("Draw Nobody Wins!");
        }
}

public static boolean checkForInvalidCharacterInString(String stringForPlayerOne,String stringForPlayerTwo ){

    Set<Character> charSet = new HashSet<Character>();
    String concatBoth = stringForPlayerOne.concat(stringForPlayerTwo);
    char [] arrOne = concatBoth.toCharArray();
    for(int i =0;i<arrOne.length;i++){
        charSet.add(arrOne[i]);
    }
    String res="";
    for(Character c:charSet){
        if(c.equals('L') || c.equals('R') || c.equals('B') || c.equals('F')){
        res=res+c;
        }
        else{
            return false;
        }
    }
    
    return true;
}

public static int playGame(String resString,int pointsOfPlayer){
    char [] arrStOne = resString.toCharArray();
    finalPointsForPlayer=pointsOfPlayer;
    for(int i=0;i<arrStOne.length;i++){
        if(arrStOne[i] == 'L'){
            finalPointsForPlayer+=50;
        }
        else 
            if(arrStOne[i] == 'R'){
                finalPointsForPlayer-=50;
        }
        else  
            if(arrStOne[i] == 'B'){
                finalPointsForPlayer*=50;
        }
        else  
            if(arrStOne[i] == 'F'){
                finalPointsForPlayer/=50;
        }
    }
    return finalPointsForPlayer;
   

}
}
