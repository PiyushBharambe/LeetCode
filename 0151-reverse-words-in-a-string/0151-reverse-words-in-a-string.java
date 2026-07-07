class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        s.trim();

        String[] words  = s.split(" ");
        String m ="";


        // for(int i=words.length-1 ; i>=0 ; i--){
        //     if(!(words[i].equals(""))){
        //     str.append(words[i]);
        //     str.append(" ");

        //     }
        // }  

        for(int i=words.length-1 ; i>=0 ; i--){
            if(!(words[i].equals(""))){
                m=m+words[i];
                m=m+" ";
            // str.append(words[i]);
            // str.append(" ");

            }
        }       

        // return str.toString().trim();
        return m.trim();
    }
}