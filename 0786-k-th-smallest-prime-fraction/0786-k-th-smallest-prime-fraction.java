class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> lst = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                lst.add(new int[]{arr[i],arr[j]});
            }
        }
        Collections.sort(lst,(a,b)->Double.compare((double)a[0]/a[1],(double)b[0]/b[1]));
        return lst.get(k-1);
    }
}
// class Solution {
//     public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//         Map<Double,List<Integer>> mp = new HashMap<>();
//         for(int i = 0;i<arr.length;i++){
//             for(int j = i+1;j<arr.length;j++){
//                 double d = (double)arr[i]/arr[j];
//                 if(!mp.containsKey(d)){
//                     mp.put(d,new ArrayList<>());
//                 }
//                 mp.get(d).add(arr[i]);
//                 mp.get(d).add(arr[j]);
//             }
//         }
//        List<Map.Entry<Double,List<Integer>>>lst = new ArrayList<>(mp.entrySet());
//         Collections.sort(lst,(a,b)->Double.compare(a.getKey(),b.getKey()));
//         int[] res = new int[2];
//         res[0] = lst.get(k-1).getValue().get(0);
//         res[1] = lst.get(k-1).getValue().get(1);
//             return res;
//     }
// }
// my approch 1 case tle