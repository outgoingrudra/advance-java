package DSA.Neetcode150;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        return set.size()!=nums.length ;
    }
}
