class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1=nums1.length;
        int length2=nums2.length;
        int length=length1+length2;
        int[] arr=new int[length];
        for (int i=0;i<length1;i++){
            arr[i]=nums1[i];
        }
        for (int j=length1,i=0;j<length;j++,i++){
            arr[j]=nums2[i];
        }

        Arrays.sort(arr);
        
        double mid=0;
        if (length%2==0){
            mid=(double)(arr[length/2-1]+arr[length/2])/2;
            
        }else if (length%2==1){
            mid=arr[length/2];
        }

        return mid;
    }
}
