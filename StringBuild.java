class StringBuild
{
	public static void main(String[] args)
	{
			StringBuilder sb = new StringBuilder(4);
			sb.append("aaaa");
			System.out.println(sb.capacity());
			sb.append("a");
			System.out.println(sb.capacity());
			sb.append("aaaaaa");
			System.out.println(sb.capacity());
	}
}