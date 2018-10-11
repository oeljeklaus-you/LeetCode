package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.List;

public class _118_Traigle {
    /**
     * 这里根据杨辉三角形的特点进行计算就可以了
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        //按照特点计算即可
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(numRows==0) return result;
        List<Integer> tmp1=new ArrayList<Integer>();
        tmp1.add(1);
        result.add(tmp1);
        for(int i=2;i<=numRows;i++)
        {
            List<Integer> tmp2=new ArrayList<Integer>();
            List<Integer> tmp=result.get(i-2);
            tmp2.add(1);
            for(int j=1;j<i-1;j++)
            {
                int t=tmp.get(j)+tmp.get(j-1);
                tmp2.add(t);
            }
            tmp2.add(1);
            result.add(tmp2);
        }
        return result;
    }

}
