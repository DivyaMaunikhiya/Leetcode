class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        int t = 7;
        System.out.println(searchInsert(arr, t));
    }
    public static int searchInsert(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        while(s<=e){

            int m = (e-s)/2 +s;
            if(target==nums[m]) return m;
            else if(target>nums[m]) s=m+1;
            else e=m-1;


        }
        return s;

    }

}