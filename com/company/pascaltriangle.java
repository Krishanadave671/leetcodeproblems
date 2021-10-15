package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    static int factorial(int n){
        int f = 1;
        for(int i = 1 ; i<=n; i++){
            f*= i;
        }
        return  f;
    }
    public List<List<Integer>> generate(int numRows) {

     List<List<Integer>> list = new ArrayList<List<Integer>>();

     // wrong solution  getting on leetcode
        // time complexity = O(n raised to 3)
//
//        for(int i = 1; i <=numRows;i++){
//            List<Integer> l = new ArrayList<>();
//            for(int j = 0; j<= i ; j++){
//                if(i == 1  && j == 1) continue;
//                int ncr = factorial(i)/(factorial(i - j)*factorial(j));
//                l.add(ncr);
//            }
//            list.add(l);
//        }
//        System.out.println(list);
        //  striver 's code
        List<Integer> row ,pre = null;
        for(int i = 0; i< numRows; i++){
            row  = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }

            }
            pre = row;
            list.add(row);
        }

          return list;
    }
}
