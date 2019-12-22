class Girls {

    static int findGirls(int s [] ){
        int cnt = 0;

        if(s[s.length-1] == 6)

            return -1;

        for (int i = 0; i < s.length; i++) {

            if (s[i] !=6) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[])
    {
        int[]s= {4,5,6,6,7,6,6,1};

        System.out.println("The nr of girls is: " + findGirls(s));
    }
}