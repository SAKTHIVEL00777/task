package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDemo md=new MapDemo();
		//md.hashMap();
		//md.entrySetMethod();
		//md.eachValueAdd5();
		//md.frequency();
		//md.highestRepeatedChar();
		md.gentricsDemo();

	}

	private void gentricsDemo() {
		// TODO Auto-generated method stub
		HashMap <Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "sehwag");
		hm.put(2, "sachin");
		Set s=hm.entrySet();
		for(Object ob:s) {
			Entry e=(Entry) ob;
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
		}
		
		
	}

	private void highestRepeatedChar() {
		// TODO Auto-generated method stub
		String name="kavinkumar";
		HashMap hm=new HashMap();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			boolean key=hm.containsKey(ch);
			if(key==false) {
				hm.put(ch, 1);
			}
			else {
				Integer fre=(Integer) hm.get(ch);
				hm.put(ch, fre+1);
			}
		}
		System.out.println(hm);
		Set s=hm.entrySet();
		int big=Integer.MIN_VALUE;
		char high=0;
		for(Object ob:s) {
			Entry e=(Entry) ob;
			int val=(int) e.getValue();
			
			   if(big<val) {
				   big=val;
				   high=(char) e.getKey();
			   }
		}
		//System.out.println(high);
		System.out.println(high+" is most repeated "+big+" times");
		
	}

	private void frequency() {
		// TODO Auto-generated method stub
		String name="kavinkumar";
		HashMap hm=new HashMap();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			boolean key=hm.containsKey(ch);
			if(key==false) {
				hm.put(ch, 1);
			}
			else {
				Integer fre=(Integer) hm.get(ch);
				hm.put(ch, fre+1);
			}
		}
		System.out.println(hm);
		Set s=hm.entrySet();
		for(Object ob:s) {
			Entry e=(Entry) ob;
			int val=(int) e.getValue();
			if(val>1) {
				System.out.println(e);
			}
		}
		}

	

	private void eachValueAdd5() {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("idli", 5);
		hm.put("dosai", 25);
		hm.put("vadai", 5);
		hm.put("pongal", 45);
		hm.put("poori", 10);
		Set s=hm.entrySet();
		for(Object ob:s) {
			Entry e=(Entry) ob;
			//System.out.println(e.getKey()+"==="+e.getValue());
			Integer value=(Integer) e.getValue();
			e.setValue(value+5);
			System.out.println(e);
		}
		
	}

	private void entrySetMethod() {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("idli", 5);
		hm.put("dosai", 25);
		hm.put("vadai", 5);
		hm.put("pongal", 45);
		hm.put("poori", 10);
		Set s=hm.entrySet();
			for(Object ob:s) {
				System.out.println(ob);
			}
		}
	

	private void hashMap() {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("idli", 5);
		hm.put("dosai", 25);
		hm.put("vadai", 5);
		hm.put("pongal", 45);
		hm.put("poori", 10);
		System.out.println(hm);
		System.out.println(hm.entrySet());
		System.out.println("========="+hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.get("idli"));
		hm.remove("pongal", 45);
		hm.replace("dosai", 15);
		System.out.println(hm);
		
		//System.out.println(hm.containsKey("poori"));
		//System.out.println(hm.containsValue(10));
		//hm.remove("pongal");
	    //hm.put("Masal dosai", 50); 
		//hm.put("Dosai", 20); 
	    //System.out.println(hm);
		//hm.clear();
		//System.out.println(hm);

		
		 
		
		
	}

}
