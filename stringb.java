class stringb
	{
  	   public static void main(String[]args)
	   {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		StringBuffer s= new StringBuffer("hello");
		System.out.println(sb==s);
		System.out.println(sb.equals(s));
	
	   }
	}
