package cn.edu.hust.hw;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String orgin=scanner.nextLine();
        String[] splits=input.split(";");
        HashMap<String,String> map=new HashMap<String, String>();
        for(int i=0;i<splits.length;i++)
        {
            String[] tmp=splits[i].split(" ");
            if(tmp.length<3)
            {
                System.out.println("none");
                return;
            }else if(!tmp[0].equals("typedef")){
                System.out.println("none");
                return;
            }
             else
            {
                map.put(tmp[2],tmp[1]);
            }
        }
        String result=map.get(orgin);
        if(result==null)
        {
            System.out.println("none");
            return;
        }
        for(int i=0;i<result.length();i++)
        {
            if(result.charAt(i)=='*')
            {
                System.out.print(" *");
            }
            else
            {
                System.out.print(result.charAt(i));
            }
        }
    }
}
