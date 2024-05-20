class KBeauty {
    public int divisorSubstrings(int num, int k) {
        String s = "" + num;
        String temp = "";
        int out = 0;
        for(int i=0; i<k; i++){
            temp += s.charAt(i);
        }

        int a = Integer.parseInt(temp);
        if(a!=0 && num%a == 0){
            out++;
        }

        for(int i=1; i<=s.length()-k; i++){
            temp = temp.substring(1);
            temp += s.charAt(i+k-1);
            int b = Integer.parseInt(temp);
            if(b!=0 && num%b==0){
                out++;
            }
        }
        return out;
    }
}
