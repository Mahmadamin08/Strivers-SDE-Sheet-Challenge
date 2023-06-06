package day2;
import java.util.*;

class Interval {
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class MergeInternvals {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->{return (a.start - b.start);});

        for(int i=0; i<intervals.length; i++)
        {
            int s = intervals[i].start;
            int e = intervals[i].finish;

            if (!ans.isEmpty() && e <= ans.get(ans.size() - 1).finish) {
                continue;
            }

            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j].start <= e) {
                    e = Math.max(e, intervals[j].finish);
                } else {
                    break;
                }
            }
            ans.add(new Interval(s,e));
        }
        return ans;
        
    }
}
