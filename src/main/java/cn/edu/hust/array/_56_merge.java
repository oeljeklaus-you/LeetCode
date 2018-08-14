package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _56_merge {
    class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    //按照自定义排序即可
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start>o2.start) return 1;
                else if (o1.start<o2.start) return -1;
                else if(o1.end>o2.end) return 1;
                else if(o1.end<o2.end) return -1;
                return 0;
            }
        });
        List<Interval> result=new ArrayList<Interval>();
        if(result.size()==0) return result;
        Interval t=intervals.get(0);
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals.get(i).start>=t.start&&intervals.get(i).start<=t.end)
            {
                t.end=intervals.get(i).end>t.end?intervals.get(i).end:t.end;

            }else
            {
                result.add(t);
                t=intervals.get(i);
            }
        }
        result.add(t);
        return result;
    }

    public static void main(String[] args)
    {
        _56_merge merge=new _56_merge();
        List<Interval> list=new ArrayList<Interval>();
        list.add(merge.new Interval(2,3));
        list.add(merge.new Interval(4,5));
        list.add(merge.new Interval(6,7));
        list.add(merge.new Interval(8,9));
        list.add(merge.new Interval(1,10));
        merge.merge(list);
    }
}
