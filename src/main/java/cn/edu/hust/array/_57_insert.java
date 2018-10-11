package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _57_insert {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        /**
         * 按照上一题计算即可
         */
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
}
