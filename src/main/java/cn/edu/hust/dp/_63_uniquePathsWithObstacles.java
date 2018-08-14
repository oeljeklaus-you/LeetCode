package cn.edu.hust.dp;

public class _63_uniquePathsWithObstacles {
    //动态规划问题：需要注意的是要这个
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(obstacleGrid[i][j]!=1)
                {
                    if(i==0&&j==0)
                    {
                        obstacleGrid[i][j]=-1;
                    }
                    else if(i>0&&j>0)
                    {
                        if(obstacleGrid[i][j-1]==1)
                            obstacleGrid[i][j]=obstacleGrid[i-1][j];
                        else if(obstacleGrid[i-1][j]==1)
                            obstacleGrid[i][j]=obstacleGrid[i][j-1];
                        else
                            obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
                    }else if(i>0)
                    {
                        if(obstacleGrid[i-1][j]!=1)
                            obstacleGrid[i][j]=-1;
                        else
                            obstacleGrid[i][j]=1;
                    }
                    else if(j>0)
                    {
                        if(obstacleGrid[i][j-1]!=1)
                            obstacleGrid[i][j]=-1;
                        else
                            obstacleGrid[i][j]=1;
                    }
                }

            }
        }
        if(obstacleGrid[n-1][m-1]==1) return 0;
        return Math.abs(obstacleGrid[n-1][m-1]);
    }
}
