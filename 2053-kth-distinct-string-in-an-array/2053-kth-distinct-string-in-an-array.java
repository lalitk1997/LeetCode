class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean flag = true;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j]) & i != j){
                    System.out.println(arr[i]+" "+arr[j]);
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        if(list.size() < k){
            return "";
        }else{
            return list.get(k-1);
        }
    }
}