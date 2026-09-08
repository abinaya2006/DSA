class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }

        List<Integer> list=new ArrayList<>();

        for(int x:nums){
            list.add(x);
        }

        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(h.get(nums[j])<h.get(nums[i]) || h.get(nums[j]).equals(h.get(nums[i])) && nums[j]>nums[i]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
                
        //     }
        // }

        Collections.sort(list,(a,b)->{
            if(!h.get(a).equals(h.get(b))){
                return h.get(a)-h.get(b);
            }
            return b-a;
        });

        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
        return nums;
    }
}