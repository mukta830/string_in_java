  class string1
  {
    public static void main(String[] args)
    {
      String s="HELLO";
      String s1="hello";
      String s2="hello";

      System.out.println(s);
      System.out.println(s1);
      System.out.println(s==s1);
      System.out.println(s1==s2);
      System.out.println(s.hashCode());
      System.out.println(s1.hashCode());
      System.out.println(s.equals(s2));
      System.out.println(s1.equals(s2));
    }
  }
