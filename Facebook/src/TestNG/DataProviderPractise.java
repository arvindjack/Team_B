package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
  
	public class DataProviderPractise {
		@DataProvider
		public Object[][] testdata(){
			Object[][] data=new Object[2][2];
			data[0][0]="test1";
			data[0][1]="test2";
			
			data[1][0]="test1";
			data[1][1]="test2";
			return data;
			
		}
		@DataProvider
		public Object[][] testdata1(){
			Object[][] data=new Object[3][3];
			data[0][0]="test1";
			data[0][1]="test2";
			data[0][2]="test3";
			
			data[1][0]="test4";
			data[1][1]="test5";
			data[1][2]="test6";
			
			data[2][0]="test7";
			data[2][1]="test8";
			data[2][2]="test9";
			
			return data;
		}
		
	@Test(dataProvider="testdata")
	public void test(String S1,String S2) {
		System.out.println("s1"+""+S1+"s2"+S2);
	}
	
	@Test(dataProvider="testdata1")
	public void test(String S1,String S2,String S3) {
		System.out.println("s1"+""+S1+"s2"+""+S2+"s3"+""+S3);
	} 
	
	
}
