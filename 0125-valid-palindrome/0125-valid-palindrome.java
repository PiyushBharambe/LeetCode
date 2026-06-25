class Solution {
    public boolean isPalindrome(String s) {

        if(s.equals("")){
            return true;
        }
        StringBuilder str = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                str.append(c);
            }
            if(Character.isLetter(c)){
                str.append(c);
            }


        }

        for(int i = str.length()-1; i>=0 ; i--){
            reverse.append(str.charAt(i));
        }

        if(str.toString().toLowerCase().equals(reverse.toString().toLowerCase())){
        return true;
        }
        return false;
    }
}