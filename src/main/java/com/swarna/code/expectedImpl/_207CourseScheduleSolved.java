package com.swarna.code.expectedImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _207CourseScheduleSolved {

    // Kahn's Algo
    public boolean canFinish(int n, int[][] preReq) {

        // fill adj using preReq: (list of prerequisite for each node)
        List<Integer>[] adj = new ArrayList[n];
        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<preReq.length; i++){
            int course = preReq[i][0];
            int pre = preReq[i][1];
            adj[course].add(pre);
        }

        // fill indegree using adj: (count indegree of each node)
        int[] indegree = new int[n];
        for(int i=0; i<adj.length; i++){
            for(int pre: adj[i]){
                indegree[pre]++;
            }
        }

        // fill queue using indegree: (if any node don't have indegree, i.e: top node, good for start)
        Queue<Integer> queue = new LinkedList<>();
        for(int node=0; node<n; node++){
            if(indegree[node]==0){
                queue.offer(node);
            }
        }

        // fill the result list in Topological order
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int pre: adj[node]){
                if(--indegree[pre]==0){
                    queue.offer(pre);
                }
            }
        }

        // (if the graph having loop or no 0 indegree to start, then list size will be != n)
        return (result.size()==n);

    }
}
