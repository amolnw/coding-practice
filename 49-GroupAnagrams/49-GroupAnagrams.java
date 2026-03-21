// Last updated: 3/21/2026, 2:50:05 PM
1class Solution {
2
3    private String compress(String str) {
4        char[] chars = str.toCharArray();
5        Arrays.sort(chars);
6        StringBuffer sb = new StringBuffer();
7
8        int left = 0, right = 0;
9        while(right < chars.length) {
10            if(chars[left] == chars[right]) {
11                right++;
12            }
13            else {
14                sb.append(chars[left]).append(right - left);
15                left = right;
16            }
17        }
18
19        if (right - left > 0)
20            sb.append(chars[left]).append(right - left);
21
22        return sb.toString();
23    }
24
25    public List<List<String>> groupAnagrams(String[] strs) {
26        HashMap<String, List<String>> hashMap = new HashMap<>();
27        for(String str: strs) {
28            String compressed = compress(str);
29            List<String> currentList;
30            if (hashMap.get(compressed) != null) {
31                currentList = hashMap.get(compressed);    
32            }
33            else {
34                currentList = new ArrayList<>();  
35            }
36            currentList.add(str);
37            hashMap.put(compressed, currentList);
38        }
39
40        List<List<String>> result = new ArrayList<>();
41        for(List<String> l: hashMap.values()) {
42            result.add(l);
43        }
44        return result;
45    }
46}