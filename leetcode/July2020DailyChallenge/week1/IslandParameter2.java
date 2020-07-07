package week1;

class IslandParameter2 {
    class Pair{
        int i;
        int j;

        public Pair(int x, int y){
            i = x;
            j = y;
        }
    }
    public int islandPerimeter(int[][] grid) {

        if(grid.length == 0)
            return 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int result = 0;

        Queue<Pair> queue = new LinkedList<Pair>();

        for(int i=0;i< grid.length; i++){
            int j = 0;
            for( j = 0; j < grid[i].length ; j++){
                if(grid[i][j] == 1){
                    queue.add(new Pair(i,j));
                    break;
                }
            }
            if(j != grid[i].length)
                break;
        }

        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int i = p.i;
            int j = p.j;
            visited[p.i][p.j] = true;

            int count = 4;
            if( i > 0 && grid[i-1][j] == 1){
                count--;
                if(!visited[i-1][j])
                    queue.add(new Pair(i-1,j));
                visited[i-1][j] = true;
            }
            if( j > 0 && grid[i][j-1] == 1){
                count--;
                if(!visited[i][j-1])
                    queue.add(new Pair(i, j - 1));
                visited[i][j-1] = true;
            }
            if( i < grid.length - 1 && grid[i+1][j] == 1){
                count--;
                if(!visited[i+1][j])
                    queue.add(new Pair(i+1,j));
                visited[i+1][j] = true;
            }
            if( j < grid[0].length - 1 && grid[i][j + 1] == 1){
                count--;
                if(!visited[i][j + 1])
                    queue.add(new Pair(i,j + 1));
                visited[i][j+1] = true;
            }
            result += count;
        }
        return result;
    }
}