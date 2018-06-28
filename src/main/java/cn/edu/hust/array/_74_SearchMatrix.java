package cn.edu.hust.array;

public class _74_SearchMatrix {
    //从右上角开始搜索
    public boolean searchMatrix(int[][] matrix, int target) {
        //需要判断二维矩阵是否为空
        if(matrix.length==0||matrix[0].length==0) return false;
        int size=matrix[0].length;
        for(int i=size-1;i>=0;i--)
        {
            if(matrix[0][i]==target)
            {
                return true;
            }
            else if(matrix[0][i]<target)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    if(matrix[j][i]==target)
                    {
                        return true;

                    }
                    else if(matrix[j][i]>target)
                    {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
