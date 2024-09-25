package com.atguigu;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        //找字串中字母次数为奇数的个数，若len为偶，奇数个数<= k,len为奇数，奇数个数<=k+1;
        //用数组记录字母的次数
        int len = queries.length;
        List<Boolean> ans = new ArrayList<>();
        int index = 0;
        for(int[] q : queries){
            int k = q[2];
            int t = 0; //记录奇数的个数
            StringBuilder sb = new StringBuilder();
            sb.append(s,q[0],q[1]);
            int[] count = new int[26];
            int lenq = sb.toString().length();
            for(char c:sb.toString().toCharArray()){
                count[c-'a']++;
            }
            for(int i=0;i<26;i++){
                if(count[i] % 2 == 1)
                    t++;
            }
            if(lenq % 2 == 0){
                if(t <= k)
                    ans.add(true);
                else
                    ans.add(false);
            }
            else{
                if(t<=k+1)
                    ans.add(true);
                else
                    ans.add(false);
            }
        }
        return ans;
    }
}
