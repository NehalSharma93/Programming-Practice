package week1;

class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] result= new int[cells.length];
        if(N%14 == 0)
            N = 14;
        else
            N = N% 14;
        while(N > 0)
        {
            for(int i=1; i<cells.length-1; i++)
            {
                if(cells[i-1]==cells[i+1])
                    result[i]=1;
                else
                    result[i]=0;
            }
            N--;
            cells=result.clone();
        }
        return result;
    }
}