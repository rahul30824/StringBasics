class Main{
    public static boolean Palindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="nivin";
        System.out.print(Palindrome(s));
        String r="rahul";
        System.out.print(Palindrome(r));
    }
}
