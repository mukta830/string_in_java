class stringbu
       {
 	 public static void main(String[]args)
	{
	StringBuilder sb=new StringBuilder("Hello");
	sb.append(" World");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.reverse());
	StringBuilder s= new StringBuilder("hello");
	System.out.println(sb==s);
	System.out.println(sb.equals(s));
       }
    }
