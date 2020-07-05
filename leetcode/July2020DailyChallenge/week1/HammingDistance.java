package week1;

class HammingDistance {
    public int hammingDistance(int x, int y) {

        int result = 0;
        while( x != 0 || y != 0){
            if(x%2 != y%2)
                result++;
            x = x >> 1;
            y = y >> 1;
        }

        return result;

    }
}