package DSA.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Data {
    int start ;
    int end ;
    int pos ;
    Data(int x, int y, int z) {
        start = x;
        end = y ;
        pos = z;
    }
}
public class N_Meetings {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        Data[] arr = new Data[s.length];
        for (int i = 0 ; i < s.length ; i++) {
            arr[i] = new Data(s[i], f[i], i + 1);
        }

        Arrays.sort(arr, (a, b)-> {if (a.end != b.end)
            return Integer.compare(a.end, b.end);
            return Integer.compare(a.pos, b.pos); });
        int cnt = 1 ;
        int freeTime = arr[0].end ;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr[0].pos);
        for (int i = 1 ; i<s.length ; i++) {
            if (arr[i].start> freeTime) {
                cnt++;
                ans.add(arr[i].pos);
                freeTime = arr[i].end ;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
