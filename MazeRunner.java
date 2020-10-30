import java.util.*;

class Appilcation {
    public static void main(String[] args){
        //declaring variables to calculate total points
        int totalPointsForPlayerOne = 0;
        int totalPointsForPlayerTwo = 0;

        //inputs for both players
        int pointsForPlayerOne = 1200;
        String movementForPlayerOne = "LLRRF";
        int pointsForPlayerTwo = 1000;
        String movementForPlayerTwo = "RRLFB";
        
        //validations for both players
        boolean isPlayerOnePointsValid = pointsForPlayerOne>=1000 && pointsForPlayerOne<=5000;
        boolean isPlayerTwoPointsValid = pointsForPlayerTwo>=1000 && pointsForPlayerTwo<=5000;
        boolean isPlayerOneMovementsValid = movementValidation(movementForPlayerOne);
        boolean isPlayerTwoMovementsValid = movementValidation(movementForPlayerTwo);
        boolean isBothPlayersNumberOfMovementsEqual = movementForPlayerOne.length()==movementForPlayerTwo.length();

        if(isPlayerOnePointsValid && isPlayerTwoPointsValid && isPlayerOneMovementsValid 
        && isPlayerTwoMovementsValid && isBothPlayersNumberOfMovementsEqual){
            
            //calculating points for valid input
            totalPointsForPlayerOne = pointCalculationForAPlayer(movementForPlayerOne);
            totalPointsForPlayerTwo = pointCalculationForAPlayer(movementForPlayerOne);

            if(totalPointsForPlayerOne > totalPointsForPlayerTwo){
                System.out.print("Player 1 Wins");
            } else{
                System.out.print("Player 2 Wins");
            }
        
        } else {
            System.out.print("Some Invalid Input");
        }
    }

    //function for movement validation
    static boolean movementValidation(String allMovesOfAPlayer){
        Set<Character> allValidMoves = new HashSet<Character>();
        boolean isMovementValid = true;
        allValidMoves.add('L');
        allValidMoves.add('R');
        allValidMoves.add('B');
        allValidMoves.add('F');
        for(char ch : allMovesOfAPlayer.toCharArray()){
            if(allValidMoves.contains(ch)){
                continue;
            } else {
                isMovementValid = false;
                break;
            }
        }
        return isMovementValid;
    }

    //function to calculate points
    static int pointCalculationForAPlayer(String movementForAPlayer){
        int pointsForAPlayer = 0;
        for(char ch : movementForAPlayer.toCharArray()){
            switch(ch){
                case 'L': 
                pointsForAPlayer = pointsForAPlayer + 50;
                case 'R': 
                pointsForAPlayer = pointsForAPlayer - 50;
                case 'B': 
                pointsForAPlayer = pointsForAPlayer * 2;
                case 'F': 
                pointsForAPlayer = pointsForAPlayer / 2;
            }
        }
        return pointsForAPlayer;
    }
}
