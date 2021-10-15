package com.company;

import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public int[] twosum(int[] nums, int target){
         int[] result = new int[2];
         // learn Maps and Hashmaps in java
       Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
//        for(int i = 0; i<nums.length; i++){
//            if(map.containsKey(target - nums[i])){
//                result[1] = i;
//                result[0] = map.get(target - nums[i]);
//                return  result;
//            }
//            map.put(nums[i],i );
//        }
//    Brute force
        // we cannot create object of an interface and Map is a interface so Hashmap is a class that implements interface

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[1] = j;
                    result[0] = i ;
                    return  result;
                }
            }
        }
      return  result;
    }
}
