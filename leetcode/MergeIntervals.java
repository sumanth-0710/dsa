package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MergeIntervals {

    void merge(int[][] intervals) {

       /* if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point
        Arrays.sort(intervals,Comparator.comparingInt(e->e[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1])
                // Overlapping intervals,
                // update the end if needed
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            else {
                // Disjoint intervals,
                // add the new interval to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);*/
        if(intervals.length<=1){
            System.out.println(Arrays.toString(intervals));
        }
        Arrays.sort(intervals,Comparator.comparingInt(e->e[0]));
        List<int[]>merged=new ArrayList<>();
        int[] newInterval=intervals[0];
        System.out.println(Arrays.toString(newInterval));
        merged.add(newInterval);
        for(int[] interval:intervals){
            if(newInterval[1]>=interval[0]){
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                merged.add(newInterval);
            }
        }
        for(int[]a:merged){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        mergeIntervals.merge(intervals);
        System.out.println("Merged intervals:");

    }
}
