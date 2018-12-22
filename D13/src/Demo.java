import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\bb\\美女图片.jpg");
		FileOutputStream fos = new FileOutputStream("美女图片.jpg");
		
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys))!=-1) {
			fos.write(bys,0,len);
			
		}
		fis.close();
		fos.close();
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("aa.txt");
//		byte[] bys = new byte[5];
//		
//		while ((l = fis.read(bys))!=-1) {
//			System.out.println(new String(bys,0,len));
//			
//		}
		
		
//		FileInputStream fis = new FileInputStream("a.txt");
//		int by;
//		while ((by=fis.read())!=-1) {
//			System.out.print((char)by);
//			
//		}
//		fis.close();
		
		
		
		
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("aaa.txt");
//			fos.write("jsfljsljljl".getBytes());
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}finally {
//			if(fos!=null) {
//				try {
//					fos.close();
//				} catch (Exception e) {
//					
//					e.printStackTrace();
//				}
//			
//				}
//			}
		
		
		
		
		
		
//		FileOutputStream fos = new FileOutputStream("aa.txt",true);
//		
//		
//		fos.write("\r\n".getBytes());
//		fos.write("missmisscang".getBytes());
//		fos.write("missmisscangmmmmmmm".getBytes(), 0, 5);
//		fos.close();
		
		
		
		
		
		
		
		
		
//		FileOutputStream fol = new FileOutputStream("aa.txt");
//		
//		fol.write(1546548);
		
		
		
		
//		File dir = new File("d:\\bb");
//		File[] files  = dir.listFiles();
//		for(File f : files) {
//			System.out.println(f.getAbsolutePath());
//		}
		
		
//		File fi = new File("d:\\bb");
//		System.out.println(fi.isDirectory());
//		System.out.println(fi.isFile());
//		System.out.println(fi.exists());
//		System.out.println(fi.getAbsolutePath());
//		System.out.println(fi.getPath());
//		System.out.println(fi.getName());
		
		
		
		
		
		
		
//		File f1 = new File("d:/a.txt");
//		boolean createNewFile = f1.createNewFile();
//		System.out.println(createNewFile);
//		
//		File f2 = new File("d:/b.txt");
//		boolean mkdirs = f2.mkdirs();
//		System.out.println(mkdirs);
//		
//		File f3 = new File("d:\\aa\\bb.txt");
//		boolean mkdir = f3.mkdir();
//		System.out.println(mkdir);
		
//		File f1 = new File("d:\\a.txt");
//		System.out.println(f1.createNewFile());
//		
//		File f2 = new File("d:\\bb");
//		System.out.println(f2.mkdir());
//		
//		File f3 = new File("d:\\cc\\dd");
//		System.out.println(f3.mkdirs());
//		
//		
//		File f1 = new File("bb");
		
		
		
//		File f1 = new File("d:/a.txt");
//		boolean delete = f1.delete();
//		System.out.println(delete);
		
		
//		File f1 = new File("d:\\aa\\a.txt");
//		File f2 = new File("d:/aa","a.txt");
//		File dir = new File("d:/aa");
//		File f = new File(dir,"a.txt");
		
		
		
		
//		int[] arr = new int[3];
//		
//		try {
//			System.out.println(arr[3]);
//		} catch (ArithmeticException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		
		
		
//		try {
//			int a = 10/0;
//		} catch (ArithmeticException e) {
//			
//			e.printStackTrace();
//		}
		
		
	}
	
//	public static void method() {
//		SimpleDateFormat sdf = new SimpleDateFormat("")
//	}
	
//	public void method() {
//		int a = 10;
//		int b = 0;
//		
//		System.out.println(a/b);
//	}

}
