class Sudoku {
    static int[][] grid  = 
                     {{0,2,0,1,7,8,0,3,0},
                      {0,4,0,3,0,2,0,9,0},
                      {1,0,0,0,0,0,0,0,6},
                      {0,0,8,6,0,3,5,0,0},
                      {3,0,0,0,8,0,0,0,4},
                      {0,0,6,7,0,9,2,0,0},
                      {9,0,0,0,0,0,0,0,2},
                      {0,8,0,9,0,1,0,6,0},
                      {0,1,0,4,3,6,0,5,0}}; // 0 is used to indicate an empty square

    public static void main (String args[]) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if (grid[row][col]==0){
                    int didSolve=solve(row,col);
                    if(didSolve!=0){
                        grid[row][col]=didSolve;
                        row=0;
                        col=0;
                    }
                }
            }
        }
        grid[0][0]=solve(0,0);
        for(int row=0;row<9;row++){
            if((row)%3==0){
                System.out.println("-------------");
                }
            for(int col=0;col<9;col++){
                if((col)%3==0){
                System.out.print("|");
                }
                System.out.print(grid[row][col]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static int solve(int a, int b){
        int[] allNumbers = {1,2,3,4,5,6,7,8,9};
        for(int k=0;k<9;k++){
        //checking row
        int i=a;
        for(int j=0;j<9;j++){
            if(grid[i][j]!=0){
                for(int n=0;n<9;n++){
                    if(allNumbers[n]==grid[i][j]){
                        allNumbers[n]=0;
                    }
                }
            }
        }
    }
    for(int k=0;k<9;k++){
        //checking col
        int j=b;
        for(int i=0;i<9;i++){
            if(grid[i][j]!=0){
                for(int n=0;n<9;n++){
                    if(allNumbers[n]==grid[i][j]){
                        allNumbers[n]=0;
                    }
                }
            }
        }
    }
    int x=(a/3)*3;
    int y=(b/3)*3;

    for (int p=x;p<x+3;p++){
        for(int q=y;q<y+3;q++){
            for(int n=0;n<9;n++){
                if(allNumbers[n]==grid[p][q]){
                    allNumbers[n]=0;
                }
            }
        }
        }
    int numberOfZeroes=0;
    for(int n=0;n<9;n++){
        if(allNumbers[n]==0){
            numberOfZeroes++;
        }
    }
    if(numberOfZeroes==8){
        for(int n=0;n<9;n++){
            if(allNumbers[n]!=0){
                return allNumbers[n];
            }
        }
    }
    return 0;
    }
}
