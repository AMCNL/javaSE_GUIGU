package day05;

/**
输出100以内的所有质数：
*/
class PrimeNumber{
	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	// 方法1,传统未优化
	public static void test1(){
		int count=0;
		long start = System.currentTimeMillis();
		boolean flag = true;
		for (int i=2;i<=100000 ;i++ ) {
			for (int j=2;j<i ;j++) {
				if(i % j == 0 ){
					flag = false;
				}
			}
			if(flag==true){
				//System.out.println(i);
				count++;
			}
			//置回
			flag = true;
		}
		long end = System.currentTimeMillis();
		System.out.println("一共有"+count+"个质数，未优化版本耗时:" + (end-start)+"毫秒");
	}

	//方法2：优化版本
	public static void test2(){
		int count=0;
		long start = System.currentTimeMillis();
		boolean flag = true;
		for (int i=2;i<=100000 ;i++ ) {
			for (int j=2;j<=Math.sqrt(i) ;j++ ) {
				if(i % j == 0 ){
					flag = false;
					break;
				}
			}
			if(flag==true){
				//System.out.println(i);
				count++;
			}
			//置回
			flag = true;
		}
		long end = System.currentTimeMillis();
		System.out.println("一共有"+count+"个质数，优化版本耗时:" + (end-start)+"毫秒");
	}


	//方法2：优化版本
	public static void test3(){
		int count=0;
		long start = System.currentTimeMillis();

		la:for (int i=2;i<=20 ;i++ ) {
			for (int j=2;j<=Math.sqrt(i) ;j++ ) {
				if(i % j == 0 ){
					continue la;
				}
			}
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("一共有"+count+"个质数，优化版本耗时:" + (end-start)+"毫秒");
	}

}