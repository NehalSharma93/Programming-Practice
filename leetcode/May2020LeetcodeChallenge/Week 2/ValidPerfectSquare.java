class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long i=1;
        while(i*i < num)
            i++;
        if(i*i == (long)num)
            return true;
        return false;
    }
}