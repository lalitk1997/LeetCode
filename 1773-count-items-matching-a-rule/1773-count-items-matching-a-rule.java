class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0; i<items.size(); i++){
            System.out.println(items.get(i));
            // System.out.println(ruleKey+" "+ruleValue);
            if(ruleKey.equals("type")){
                if(ruleValue.equals(items.get(i).get(0))){
                    count += 1;
                }
            }else if(ruleKey.equals("color")){
                // System.out.println(ruleValue+" "+items.get(i).get(1));
                if(ruleValue.equals(items.get(i).get(1))){
                    count += 1;
                }
            }else if(ruleKey.equals("name")){
                if(ruleValue.equals(items.get(i).get(2))){
                    count += 1;
                }
            }
        }
        return count;
    }
}