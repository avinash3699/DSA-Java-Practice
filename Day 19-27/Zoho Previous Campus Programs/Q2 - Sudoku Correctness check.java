import java.util.*;

public class Main
{

    static boolean notInBox(char[][] sudukoBoard, int currRow, int currCol){
        Set<Character> set = new HashSet<>();
        
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(set.contains(sudukoBoard[row+currRow][col+currCol]))
                    return false;
                    
                if(sudukoBoard[row+currRow][col+currCol] != '.')
                    set.add(sudukoBoard[row+currRow][col+currCol]);
            }
        }
        
        return true;
    }

    static boolean notInRow (char[][]sudukoBoard, int row){
        Set<Character> set = new HashSet<>();
        
        for(int col = 0; col < 9; col++){
            
            if(set.contains(sudukoBoard[row][col]))
                return false;
            
            if(sudukoBoard[row][col] != '.')
                set.add(sudukoBoard[row][col]);
        }
        
        return true;
    }

    static boolean notInCol (char[][]sudukoBoard, int col){
        Set<Character> set = new HashSet<>();
        
        for(int row = 0; row < 9; row++){
            
            if(set.contains(sudukoBoard[row][col]))
                return false;
            
            if(sudukoBoard[row][col] != '.')
                set.add(sudukoBoard[row][col]);
        }
        
        return true;
    }

    static boolean checkCorrectness (char[][]sudukoBoard)
    {
    
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){
                if (!(notInBox (sudukoBoard, row - row % 3, col - col % 3) && notInCol (sudukoBoard, col) && notInRow (sudukoBoard, row)))
                    return false;
            }
        }
        
        return true;
    
    }
    
    public static void main (String[]args){
        
        char[][] board = new char[][]{
          {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        boolean correct = checkCorrectness (board);
        
        System.out.print ((correct) ? "YES": "NO");
    }
}