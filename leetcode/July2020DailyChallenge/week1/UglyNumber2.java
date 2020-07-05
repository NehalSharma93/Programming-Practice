package week1;

class UglyNumber2 {
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<Long>();
        //Use Min Heap. In each iteration heap will give you ith Ugly Number
        PriorityQueue<Long> pQueue = new PriorityQueue<Long>();
        pQueue.add(Long.valueOf(1));
        if(n == 1)
            return 1;
        long x = 0;
        for(int i = 1; i <= n; i++){
            x = pQueue.poll();
            if(!set.contains(x*2)){
                set.add(2*x);
                pQueue.add(2*x);
            }
            if(!set.contains(x*3)){
                set.add(3*x);
                pQueue.add(3*x);
            }
            if(!set.contains(x*5)){
                set.add(5*x);
                pQueue.add(5*x);
            }
        }
        return (int)x;
    }
}