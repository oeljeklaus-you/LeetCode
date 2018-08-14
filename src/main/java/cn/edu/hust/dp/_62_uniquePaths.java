package cn.edu.hust.dp;

public class _62_uniquePaths {
    //解题思路:动态对话问题，一个格子的路径等于其左边格子和上边格子之和
    public int uniquePaths(int m, int n) {
        int[][] result=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0&&j==0)
                {
                    result[i][j]=1;
                }
                else if(i>0&&j>0)
                {
                    result[i][j]=result[i][j-1]+result[i-1][j];
                }else if(i>0)
                {
                    result[i][j]=1;
                }
                else
                {
                    result[i][j]=1;
                }
            }
        }
        return result[n-1][m-1];
    }
}
