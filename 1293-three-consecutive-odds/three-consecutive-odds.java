class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ptr1 = 0, ptr2 = 1, ptr3 = 2;
        if(arr.length < 3) return false;
        while(ptr3<arr.length){
            if(arr[ptr1] % 2 == 1 && arr[ptr2] % 2 == 1 && arr[ptr3] % 2 == 1)
                return true;
            ptr1++;
            ptr2++;
            ptr3++;
        }

        return false;
    }
}