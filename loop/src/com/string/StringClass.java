package com.string;

public class StringClass {

	public static void main(String[] args) {
		StringClass sc=new StringClass();
		  //sc.stringMethods();
		  //sc.countOfChar("sehwag");
		  //sc.printNoOnly("sehwag00");
		  //sc.printCharOnly("SEHWAG");
		  //sc.countOfVowels("sehwag");
		  //sc.printSpecialChar("sehwag&*$@gmail.com");
		  //sc.presentChar("sehwag");
		  //sc.printReverse("SAKTHI");
		  //sc.palindrome("DAD");
		  //sc.repeatedElement("kavinkumar");
		  //sc.repeatedElement_A("kavinkumar");
		  //sc.stringToChar("sakthi");
		  //sc.stringToInteger("123");
		  //sc.charToString();
		  //sc.firstRepeatedElement("kavinkumar");
		  //sc.firstNonRepeatedElement("vel");
		  //sc.lastRepeatedElement("kavinkumar");
		  //sc.countOfWords("hi i am sakthi from trichy");
		  //sc.comapareString("sehwag","sachin");
		  //sc.lowerToUpper("sakthi");
		  //sc.upperToLower("SAKTHI");
		  //sc.firstUpper("sehwag");
		  //sc.findWord("i am sehwag");
	}
	private void findWord(String str) {
			String[] name=new String[3];
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					name[i]=name[i]+str.charAt(i);
				}
			}
	}
	private void firstUpper(String str) {
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(i==0) {
					ch=(char)(str.charAt(i)-32);
				}
				System.out.print(ch);
			}
	}
	private void upperToLower(String str) {
			for(int i=0;i<str.length();i++) {
				 char ch=str.charAt(i);
				 if(ch>'A' && ch<'Z') {
					 System.out.print((char)(ch+32));
				 }
			}
	}
	private void lowerToUpper(String str) {
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
					if(ch>'a' && ch<'z') {
						System.out.print((char)(ch-32));
					}
				}
			}
	
	private void comapareString(String string, String string2) {
		
			System.out.println(string2.compareTo(string));
	}
	private void countOfWords(String str) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					count++;
				}
			}
			System.out.println(count+1);
	}
	private void lastRepeatedElement(String str) {
			char[] ch=str.toCharArray();
			boolean repeate=false;
			for(int i=ch.length-1;i>=0;i--) {
				char key=ch[i];
				for(int j=ch.length-2;j>0;j--) {
					if(key==ch[j]) {
						System.out.println("Last Repeated Element is "+ch[j]);
						repeate=true;
						break;
					}
				}
					if(repeate==true) {
					break;
				}
			}
		}
	private void firstNonRepeatedElement(String str) {
			char[] name=str.toCharArray();
			int[] freq=new int[name.length];
			for(int i=0;i<name.length;i++) {
				char key=name[i];
				int count=1;
				for(int j=i+1;j<name.length;j++) {
					if(key==name[j]) {
						freq[j]=-1;
						count++;
					}
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
		}
			for(int i=0;i<freq.length;i++) {
					if(freq[i]==1) {
						System.out.println(name[i]+" is first non repeated element");
						break;
					}
			}
		}
	private void firstRepeatedElement(String str) {
			char ch[]=str.toCharArray();
			boolean repeate=false;
			for(int i=0;i<ch.length-1;i++) {
				char key=ch[i];
				for(int j=i+1;j<ch.length;j++) {
					if(key==ch[j]) {
						System.out.println("First Repeated Element is "+ch[j]);
						repeate=true;
						break;
					}
				}
				if(repeate==true) {
					break;
				
				}
			}
		}
	private void charToString() {
			char[] ch= {'s','e','h','w','a','g'};
			String str=new String(ch);
			System.out.println(str);
	}
	private void stringToInteger(String str) {
			int no=Integer.parseInt(str);
			System.out.println(no);
	}
	private void stringToChar(String name) {
			char[] ch=name.toCharArray();
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]);
			}
	}
	private void repeatedElement_A(String name) {
			int freq[]=new int[name.length()];
				for(int i=0;i<name.length();i++) {
					char key=name.charAt(i);
					int count=1;
					for(int j=i+1;j<name.length();j++) {
						if(key==name.charAt(j)) {
							freq[j]=-1;
							count++;
						}
					}
					if(freq[i]!=-1) {
						freq[i]=count;
					}
				}
				for(int i=0;i<freq.length;i++) {
					if(freq[i]>1)
						System.out.println(name.charAt(i)+" is "+freq[i]+" time repeated ");
				}
		}
	
	private void repeatedElement(String name) {
			char[] ch=name.toCharArray();
			int[] freq=new int[ch.length];
			for(int i=0;i<ch.length;i++) {
				char key=ch[i];
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(key==ch[j]) {
						freq[j]=-1;
						count++;
					}
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>1)
					System.out.println(ch[i]+" is "+freq[i]+" time repeated");
			}
			
	}

	private void palindrome(String name) {
			String rev="";
			for(int i=name.length()-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			if(name.equals(rev)) {
				System.out.println(name +" is palindrome");
			}
			else {
				System.out.println(name +" is not palindrome");
			}
			
	}

	private void printReverse(String name) {
			for(int i=name.length()-1;i>=0;i--) {
				System.out.print(name.charAt(i));
			}
	}

	private void presentChar(String name) {
			char key='a';
			for(int i=0;i<name.length();i++) {
				if(key==name.charAt(i)) {
					System.out.print("yes");
				}
			}
	}

	private void printSpecialChar(String name) {
			for(int i=0;i<name.length();i++) {
			if(!(name.charAt(i)>='0' && name.charAt(i)<='9') && 
			! (name.charAt(i)>=65 && name.charAt(i)<=122)){
				System.out.print(name.charAt(i));
			}
				
			}
	}

	private void countOfVowels(String name) {
			int count=0;
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)=='a'||
				   name.charAt(i)=='e'||
				   name.charAt(i)=='i'||
				   name.charAt(i)=='o'||
				   name.charAt(i)=='u') {
					count++;
				}
			}
			System.out.println("countOfVowels:"+count);
	}

	private void printCharOnly(String name) {
			for(int i=0;i<name.length();i++) {                     //ASII value
				if(name.charAt(i)>=65 && name.charAt(i)<=122) {    //A to Z - 65 to 90
					System.out.print(name.charAt(i));              //a to z - 97 to 122
				}                                                  //0 to 9 - 48 t0 57
			}
	}

	private void printNoOnly(String name) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)>='0' && name.charAt(i)<='9') {
					System.out.print(name.charAt(i));
				}
			}
	}

	private void countOfChar(String name) {
		
			System.out.println(name.length());
	}

	private void stringMethods() {
			String name="sehwag";
			System.out.println(name.charAt(0));
			System.out.println(name.length());
			for(int i=0;i<name.length();i++) {
				System.out.print(name.charAt(i));
			}
	}

}
