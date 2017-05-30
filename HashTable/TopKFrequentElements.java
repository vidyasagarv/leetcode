public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	//Hash table
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        //Heap sort
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        //Get top K
        List<Integer> result = new ArrayList<>();
        while(result.size() < k){
            Map.Entry<Integer, Integer> resMap = maxHeap.poll();
            result.add(resMap.getKey());
        }
        return result;
    }
}