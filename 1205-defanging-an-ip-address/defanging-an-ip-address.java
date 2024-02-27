class Solution {
    public String defangIPaddr(String address) {
        StringBuilder strb = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i) == '.')
                strb.append("[.]");
            else
                strb.append(address.charAt(i));
        }
        return String.valueOf(strb);
    }
}