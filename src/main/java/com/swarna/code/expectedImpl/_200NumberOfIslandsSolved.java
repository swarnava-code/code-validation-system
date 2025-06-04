package com.swarna.code.expectedImpl;

public class _200NumberOfIslandsSolved {
    final int[][] DIR = {{0,-1}, {0,1}, {-1,0}, {1,0}}; //l,r,u,d
    public int numIslands(char[][] grid) {
        final int N = grid.length;
        final int M = grid[0].length;
        int c = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if(grid[i][j]=='1'){
                    //System.out.println("=======");
                    //print(grid);
                    recu(grid, N, M, i, j);
                    c++;
                }
            }
        }

        //print(grid);

        return c;
    }

    private void recu(char[][] grid, int N, int M, int i, int j){
        grid[i][j] = 'x'; // x -> visited
        for (int[] xy: DIR) { // O(4)
            int x = (xy[0] + i) ;
            int y =  (xy[1] + j) ;
            if(isValidIndex(N, M, x, y) && grid[x][y]=='1'){
                recu(grid, N, M, x, y);
            }
        }
    }

    // ::: UTILITY METHODS :::
    private boolean isValidIndex(int N, int M, int i, int j){
        return (  (i>=0 && i<N)  &&  (j>=0 && j<M)  );
    }

    // return if more than 0, else 0
    private char contains1(char[][] grid, int N, int M, int i, int j){
        if (  (i>=0 && i<N)  &&  (j>=0 && j<M)  ){
            return grid[i][j];
        }
        return '0';
    }

    private void print(char[][] grid){
        final int N = grid.length;
        final int M = grid[0].length;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(" "+grid[i][j]);
            }
            System.out.println();
        }
    }

}
