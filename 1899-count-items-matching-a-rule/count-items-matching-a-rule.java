class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        
        for(int i=0; i<items.size(); i++){
            if( ( ruleKey.equals("type") ) && ( ruleValue.equals((items.get(i).get(0))) ) )
                ans += 1;
            if( ( ruleKey.equals("color") ) && ( ruleValue.equals((items.get(i).get(1))) ) )
                ans += 1;
            if( ( ruleKey.equals("name") ) && ( ruleValue.equals((items.get(i).get(2))) ) )
                ans += 1;
        }
        return ans;
    }
}