class CheckIfStriaghtLine {
    public boolean checkStraightLine(int[][] coordinates) {
        double m;
        double c = 0;
        
        if(coordinates.length == 2)
            return true;
        
        double a = coordinates[1][1] - coordinates[0][1];
        double b = coordinates[1][0] - coordinates[0][0];
        m =  a / b;
        c = coordinates[0][1] - m * (double)(coordinates[0][0]);
        
        for(int i=2;i<coordinates.length;i++){
            double y = (double)coordinates[i][1];
            double x = (double)coordinates[i][0];
            if(y == (m*x + c))
                continue;
            else
                return false;
        }
        return true;
    }
}