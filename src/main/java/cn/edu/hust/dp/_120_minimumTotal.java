package cn.edu.hust.dp;

import java.util.ArrayList;
import java.util.List;

public class _120_minimumTotal {
    //解题思路:倒着计算
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null) return 0;
        List<Integer> result=new ArrayList<Integer>(triangle.get(triangle.size()-1).size());
        for(int i=triangle.size()-1;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                if(i==triangle.size()-1)
                {
                    result.add(j,triangle.get(i).get(j));
                }
                else
                {
                    int tmp=(result.get(j)+triangle.get(i).get(j))>(triangle.get(i).get(j)+result.get(j+1))?(triangle.get(i).get(j)+result.get(j+1)):(triangle.get(i).get(j)+result.get(j));
                    result.set(j,tmp);

                }
            }
        }
        return result.get(0);
    }
}
