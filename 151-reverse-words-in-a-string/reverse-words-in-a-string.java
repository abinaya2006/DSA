class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        for(int i=0,j=words.length-1;i<j;i++,j--){
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<words.length;i++){
            if(i>0){
                sb.append(" ");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }
}