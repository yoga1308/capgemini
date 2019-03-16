class Except{
	public static void main(String[] args)
	{
		int arr[]={1,2,3};
		try
		{
			System.out.println(10/0);
			System.out.println(arr[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			return;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		finally
		{
			System.out.println("end");
		}
	}
}
		