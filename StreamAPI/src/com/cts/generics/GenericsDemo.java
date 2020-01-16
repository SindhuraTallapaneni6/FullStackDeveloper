package com.cts.generics;

public class GenericsDemo<T> {

//	private Object t;
//
//	public Object get() {
//		return t;
//	}
//
//	public void set(Object t) {
//		this.t = t;
//	}
//	public static void main(String[] args) {
//		GenericsDemo gen=new GenericsDemo();
//		gen.set("sindhu");
//		String str=(String) gen.get();
//		System.out.println(str);
//		
//		
//	}
	
	
private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	public static void main(String[] args) {
		GenericsDemo<String> gen=new GenericsDemo<String>();
		gen.set("sindhu"); 
		String n = gen.get();
		GenericsDemo<String> gen1=new GenericsDemo<String>();
		gen1.set("divya");
		
		
		System.out.println(n);
	}

}
