class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        
        char[] mag = magazine.toCharArray();
        
        for(char ch : mag){
            freq[ch - 97]++;
        }
        
        for(char ch:ransomNote.toCharArray()){
            if(freq[ch - 97] == 0)
                return false;
            freq[ch - 97]--;
        }
        return true;
        
    }
}