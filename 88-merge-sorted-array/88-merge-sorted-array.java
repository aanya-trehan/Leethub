class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1=0;
        int pt2=0;
        int index=0;
        int[] newnums=new int[m+n];
        while (pt1<m && pt2<n){
           if(nums1[pt1]>nums2[pt2]){
               newnums[index]=nums2[pt2];
                   pt2++;
           }
            else{
                 newnums[index]=nums1[pt1];
                   pt1++;
            }
            index++;
        }
        
        while(pt1<m){
            newnums[index]=nums1[pt1];
            pt1++;
            index++;
        }
        while(pt2<n){
            newnums[index]=nums2[pt2];
            pt2++;
            index++;
        }
        for(int i=0;i<n+m;i++){
            nums1[i]=newnums[i];
        }
    
    }
}