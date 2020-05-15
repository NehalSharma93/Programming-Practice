class Trie {
    
    class Node{
        Node[] trie = new Node[26];
        boolean isLeaf ;
        
        public Node(){
            for(int i=0;i<26;i++){
                trie[i] = null;
            }
            isLeaf = false;
        }
    }
    Node root =null;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
        Node crawl = this.root;
        for(int i=0;i<word.length();i++){
            if(crawl.trie[word.charAt(i) - 'a'] == null)
                crawl.trie[word.charAt(i) - 'a'] = new Node();
            crawl = crawl.trie[word.charAt(i) - 'a'];
        }
        crawl.isLeaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node crawl = this.root;
        int index;
        for(int i=0;i<word.length();i++){
            index = word.charAt(i) - 'a';
            if(crawl.trie[index] == null)
                return false;
            crawl = crawl.trie[index];
        }
        if(crawl.isLeaf)
            return true;
        return false;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node crawl = this.root;
        int index;
        for(int i=0;i<prefix.length();i++){
            index = prefix.charAt(i) - 'a';
            if(crawl.trie[index] == null)
                return false;
            crawl = crawl.trie[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */