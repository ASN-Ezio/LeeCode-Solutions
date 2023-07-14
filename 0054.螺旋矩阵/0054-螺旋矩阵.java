class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int a = col;
        int b = row - 1;
        int c = col - 1;
        int d = row - 2;
        int rCount = 0;
        while (true) {
            if(a <= 0)  break;
            int first = (col - a) / 2;
            for (int i = 1; i <= a; i++)    res.add(matrix[rCount][first++]);
            a -= 2;
            if(b <= 0)  break;
            int second = rCount + 1; 
            for (int i = 1; i <= b; i++)    res.add(matrix[second++][first - 1]);
            b -= 2;
            if(c <= 0)  break;
            int third = first - 2; 
            for (int i = 1; i <= c; i++)    res.add(matrix[second-1][third--]);
            c -= 2;
            if(d <= 0)  break;
            int forth = second - 2; 
            for (int i = 1; i <= d ; i++)   res.add(matrix[forth--][third+1]);
            d -= 2;
            rCount++;
        }
        return res;
    }
}