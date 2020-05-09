class NumberComplement{
    public int findComplement(int num) {
        
        if(num == Integer.MAX_VALUE)
            return 0;
        
        int i = (int)(Math.log(num)/Math.log(2));
        i++;
        if(i == 31)
            return num ^ Integer.MAX_VALUE;
        int j = (int)Math.pow(2,i) - 1;
        
        return num ^ j;
        
        
    }
}