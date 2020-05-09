class FirstUniqueInString{
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        
        for(char c:s.toCharArray())
            freq[c - 97]++;
        for(int i=0;i<s.length();i++)
            if(freq[s.charAt(i) - 97] == 1)
                return i;
        return -1;
        
    }
}