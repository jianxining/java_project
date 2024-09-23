import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solutioon {
    public int edgeScore(int[] edges) {
        HashMap<Integer,Long> map = new HashMap<>();
        int len = edges.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(edges[i])){
                map.put(edges[i],(map.get(edges[i]) + i));
            }
            else{
                map.put(edges[i],(long)i);
            }
        }

        int edge = 100001;
        long max = Long.MIN_VALUE;
        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            int key = entry.getKey();
            long value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
            if (max < value) {
                max = value;
            }
        }
        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            int key = entry.getKey();
            long value = entry.getValue();
            if (max == value) {
                edge = Math.min(edge,key);
            }
        }
        return edge;
    }
}

