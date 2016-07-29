package com.hand;

public class Print2 {
	public static void tell(int n,int m){
		int count = 0;
		
		for(int i=m;i<n;i++){
			if(isPrime(i)){
				count++;
				System.out.print(i+" ");
				if(count%10==0){
					System.out.println();
				}
			}
		}
		}
	public static int tell2(int n,int m){
		int count = 0;
		
		for(int i=m;i<n;i++){
			if(isPrime(i)){
				count++;
				if(count%10==0){
					System.out.println();
				}
			}
		}
		return count;
		}
	
	private static boolean isPrime(int n) {
		boolean flag = true;
		if (n == 1)
			flag = false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if ((n % i) == 0 || n == 1) {
					flag = false;
					break;
				} else
					flag = true;
			}
		}
		return flag;
	}
	public static void main(String[] args){
		
		int m = 101;
		int n = 200;
		
		int s=tell2(n, m);
		System.out.println("在"+m+"和"+n+"之间共有"+s+"个素数,分别为：");
		tell(n,m);
	}

}
