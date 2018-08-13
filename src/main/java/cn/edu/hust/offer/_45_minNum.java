package cn.edu.hust.offer;


import java.util.Arrays;
import java.util.Comparator;

public class _45_minNum {

    //这里进行排序即可
    public static String getMinNum(int num[])
    {
        if(num==null||num.length==0) return"";
        String[] strs=new String[num.length];
        for(int i=0;i<num.length;i++)
        {
            strs[i]=String.valueOf(num[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (a+b).compareTo(b+a);
            }
        });

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.length;i++)
        {
            sb.append(strs[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        int num[]={988,1,2,3,45,6};
        System.out.println(getMinNum(num));
    }
}
