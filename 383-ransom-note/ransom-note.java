class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else map.put(c, 1);
        }
        int n = ransomNote.length();
        for(char c: ransomNote.toCharArray()){
            if(map.containsKey(c)){
                n--;
                map.put(c, map.get(c) -1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }
            
        }

        if(n==0) return true;
        return false;
    }
}