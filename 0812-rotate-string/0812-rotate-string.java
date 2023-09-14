class Solution {
    public boolean rotateString(String s, String goal) {

        String str = s+s; //doubling the s so that it string goal can be found in the middle

        if(s.length() != goal.length()) //if s and goal length itself is not equal then return false
        return false;

        if(str.contains(goal)) //If str contains goal then return true
        return true;

        return false; //Else return false
        
    }
}