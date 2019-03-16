import java.io.File;
import java.io.*;
class FileRW
{
	public static void main(String[] args)
	{
		File f=  new File("D:\\capg\\src\\week2\\file.doc");
		char[] ch =new char[20];
		try
		{
			FileWriter fw = new FileWriter(f,true);
			//fw.write("1001 asdasd\n");
			//fw.write("1002 asddsad\n");
			//fw.flush();
			
			FileReader fr = new FileReader(f);
			//fr.read(ch);
			//int i=0;
			//hile((i=fr.read())!=-1)
			//{
			//	System.out.print((char)i);
			//}
			fr.skip(20);
			BufferedReader bf =new BufferedReader(fr);
			String str="";
			while((str=bf.readLine())!=null)
			{
				System.out.println(str);
			}
		//		System.out.print(ch);
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
			