class 2DArrayMaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int norows = grid.length;
        int nocols = grid[0].length;
        int maxr=-1;
        int sum=0;
        int[] maxrows = new int[norows];
        int[] maxcols = new int[nocols];
        
        for (int i=0;i<norows;i++){
            maxr=-1;
            for(int j=0;j<nocols;j++){
                if(grid[i][j] > maxr)
                    maxr = grid[i][j];
            }
            maxrows[i] = maxr;
        }
        
        for (int i=0;i<norows;i++){
            maxr=-1;
            for(int j=0;j<nocols;j++){
                if(grid[j][i] > maxr)
                    maxr = grid[j][i];
            }
            maxcols[i] = maxr;
        }
        for (int i=0;i<norows;i++){
            for(int j=0;j<nocols;j++){
              sum+=(Math.min(maxrows[i],maxcols[j]) - grid[i][j]);  
            }
        }
      return sum; 
    }
}  
