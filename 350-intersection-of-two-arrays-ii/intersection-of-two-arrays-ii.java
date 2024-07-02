class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int[] bigArray = nums1.length>nums2.length ? nums1 : nums2;
        int[] shortArray = nums1.length>nums2.length ? nums2 : nums1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int n: bigArray){
            map[n]++;
        }
        for(int n: shortArray){
            if(map[n] > 0){
                map[n]--;
                ans.add(n);
            }
        }

        int[] ansarray =  new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            ansarray[i] = ans.get(i);
        }

        return ansarray;

    }
}