import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int m=0;m<nums.length-3;++m)
        {
            if (m-1>=0 && nums[m]==nums[m-1])
                continue;
            if (nums[m]+nums[m+1]+nums[m+2]+nums[m+3]>target)
                break;
            if (nums[m]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)
                continue;
            for (int i=m+1;i<nums.length-2;++i)
            {
                if (i-1>=(m+1) && nums[i]==nums[i-1])
                    continue;
                int n = nums.length-1;
                int j = i+1;
                while (n>j)
                {
                    if ((nums[m]+nums[i]+nums[j]+nums[n])<target)
                        ++j;
                    else if ((nums[m]+nums[i]+nums[j]+nums[n])>target)
                        --n;
                    else if ((nums[m]+nums[i]+nums[j]+nums[n])==target)
                    {
                        lists.add(new ArrayList<Integer>());
                        lists.get(lists.size()-1).add(nums[m]);
                        lists.get(lists.size()-1).add(nums[i]);
                        lists.get(lists.size()-1).add(nums[j]);
                        lists.get(lists.size()-1).add(nums[n]);
                        while(j<n && nums[j] == nums[++j]);
                        while(j<n && nums[n] == nums[--n]);
                    }
                }
            }
        }
        return lists;
    }
}
