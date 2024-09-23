import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {

        HashMap<Integer,List<Integer>> StopToBuses = new HashMap<>();
        for(int i=0;i< routes.length;i++){
            for(int r:routes[i]){
                StopToBuses.computeIfAbsent(r,k->new ArrayList<>()).add(r);
            }
        }

        if(!StopToBuses.containsKey(source) || !StopToBuses.containsKey(target)){
            return source == target ? 0:-1;
        }

        HashMap<Integer,Integer> dis = new HashMap<>();
        Deque<Integer> q = new ArrayDeque<>();

        dis.put(source,0);
        q.add(source);
        while(!q.isEmpty()){
            int x = q.poll();
            int dis_X = dis.get(x); //坐的车
            for(int s:StopToBuses.get(x)){ //遍历这个站点所有的车辆
               if(routes[s] != null){ //没有遍历过
                   for(int y:routes[s]){ //y是站台
                       if(!StopToBuses.containsKey(y)){ //该站台未被访问过
                           dis.put(y,dis_X+1);
                           q.add(y);
                       }
                   }
               }

            }

        }
        return dis.getOrDefault(target,-1);
    }
}
