package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		Random rd = new Random();
		
		for (int i = 0; i <50; i++) {
			list.add(rd.nextInt(50));
			
		}
		System.out.println("随机生成的小于50的数，分别为：");
		System.out.println(list);
		
//		Map<Integer,Integer[]> map = new HashMap<Integer,Integer[]>();
//		
//		
//		List<Integer> list1 = new ArrayList<Integer>();
//		List<Integer> list2 = new ArrayList<Integer>();
//		List<Integer> list3 = new ArrayList<Integer>();
//		List<Integer> list4= new ArrayList<Integer>();
//		List<Integer> list5 = new ArrayList<Integer>();
//			for(Integer s: list){
//				if(s/10==1){
//					list1.add(s);
//				}else if(s/10==2){
//					list2.add(s);
//					
//				}else if(s/10==3){
//					list3.add(s);
//					
//				}else if(s/10==4){
//					list4.add(s);
//					
//				}else if(s/10==5){
//					list5.add(s);
//					
//				}
//				
//				
//			}
//			
//			for(Integer s: list){
//				if(s/10==1){
//					map.put(1, (Integer[]) list1.toArray());
//				}else if(s/10==2){
//					map.put(2, (Integer[]) list1.toArray());
//					
//				}else if(s/10==3){
//					map.put(3, (Integer[]) list1.toArray());
//					
//				}else if(s/10==4){
//					map.put(4, (Integer[]) list1.toArray());
//					
//				}else if(s/10==5){
//					map.put(5, (Integer[]) list1.toArray());
//					
//				}
//			}
//			
//			System.out.println(map);
//		
	}
}

