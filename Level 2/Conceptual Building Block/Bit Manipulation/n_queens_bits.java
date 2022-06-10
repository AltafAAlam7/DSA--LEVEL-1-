import java.io.*;
import java.util.*;

public class Main {

  public static void solution(boolean[][] board, int row, int cols, int ndiag, int rdiag, String asf) {
    // write your code here
    if(row == board.length){
        
        System.out.println(asf+".");
        return ;
    }
    
    for(int col =0;col<board.length;col++){
        
        if(IsSafer(board.length,row,col,cols,ndiag,rdiag)==true){
            board[row][col]=true;
            cols +=  (1<<col);
            ndiag += (1<<(row+col));
            rdiag +=(1<<(row-col+board.length-1));
            solution(board,row+1,cols,ndiag,rdiag,asf+row+"-"+col+", ");
            cols -=  (1<<col);
            ndiag -= (1<<(row+col));
            rdiag -=(1<<(row-col+board.length-1));
        }
    }
  }
    public static boolean IsSafer(int n,int row,int col,int cols,int ndiag,int rdiag){ 
        
        int mcols = (1<<col);
        int mndiag = (1<<(row+col));
        int mrdiag =(1<<(row-col+n-1));
        
        if((mcols & cols) != 0)
            return false;
        else if((mndiag & ndiag) !=0)
            return false;
        else if((mrdiag & rdiag )!=0)
            return false;
        else
            return true;
    }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols = 0;
    int ndiag = 0;
    int rdiag = 0;
    solution(board, 0, cols, ndiag, rdiag, "");
  }

}