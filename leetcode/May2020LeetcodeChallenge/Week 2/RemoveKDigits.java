class RemoveKDigits {
     public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<Character>();
        
        stack.push(num.charAt(0));
        if(k >= num.length())
            return "0";
        int i = 1;
         StringBuffer result = new StringBuffer("");
        for( i = 1;i<num.length();i++){
            if(num.charAt(i) >= stack.peek())
                stack.push(num.charAt(i));
            else{
                while(k > 0 && !stack.empty() && num.charAt(i) < stack.peek() ){
                    stack.pop();
                    k--;
                }
                if(k == 0){
                    result.append(num.substring(i));
                    break;
                }
                stack.push(num.charAt(i));
            }
        }
        if(k == 0){
            while(!stack.empty()){
                char c = stack.pop();
                result.insert(0,c);
            }
        }
        else{
            while(!stack.empty()){
                char c = stack.pop();
                if(k == 0)
                    result.insert(0,c);
                else
                    k--;
            }
        }
        String r = result.toString();
        for(int j=0;j < r.length();j++){
            if(r.charAt(j) != '0')
                return r.substring(j);
        }
        return "0";
    }
}