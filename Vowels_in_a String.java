class Main
{
    public static void vowels(String str){
    char[] charArray=str.toCharArray();
    for(int i=0;i<str.length();i++)
    {
      if("AEIOUaeiou".indexOf(charArray[i])!=-1)  {
          System.out.println(charArray[i]+"is a vowel");
      }
    }
    }
public static void main(String[] args)
{
   String str="Rahul";
   vowels(str);
}
}
