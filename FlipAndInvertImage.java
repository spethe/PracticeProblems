class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int numOfRows = A.length;
        int numOfCols = A[0].length;
        for(int i=0;i<numOfRows; i++){
            int[] singleRow = new int[numOfCols];
            int colno = numOfCols-1;
            for(int j=0; j < numOfCols; j++){
                singleRow[colno--] = (A[i][j]^1);
            }
            A[i] = singleRow;
        }
        return A;
    }
}
