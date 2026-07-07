class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();

        int m = part.length();

       for(char ch : s.toCharArray()){
        str.append(ch);

        if(str.length() >= m){
            boolean match = true;

            for(int i=0; i<m;i++){
                if(str.charAt(str.length() - m +i) != part.charAt(i)){
                    match = false;
                    break;
                }
            }
                if(match){
                    str.delete(str.length() - m , str.length());
                }

        }
       }


       return str.toString();

        
    }
}