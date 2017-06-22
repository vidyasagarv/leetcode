public class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i: nums1){
            hashTable.put(i, hashTable.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i: nums2){
            if(hashTable.containsKey(i) && hashTable.get(i) > 0){
                hashTable.put(i, hashTable.get(i) - 1);
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}