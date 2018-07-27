package cn.edu.hust.dp;

public class _64_minPathSum {
    public int minPathSum(int[][] grid) {
        if(grid==null) return 0;
        int m=grid.length;
        int n=grid[0].length;
        int sum[][]=new int[m][n];
        //横着遍历
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0&&j==0)
                {
                    sum[i][j]=grid[i][j];
                }else if(i>0&&j>0)
                {
                    sum[i][j]=(grid[i][j]+sum[i-1][j])>(grid[i][j]+sum[i][j-1])?(grid[i][j]+sum[i][j-1]):(grid[i][j]+sum[i-1][j]);
                }else if(i>0)
                {
                    sum[i][j]=(grid[i][j]+sum[i-1][j]);
                }else
                {
                    sum[i][j]=(grid[i][j]+sum[i][j-1]);
                }
            }
        }
        return sum[m-1][n-1];
    }
}
