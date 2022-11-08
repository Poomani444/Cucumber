package com.poly;

public class Facebook2 extends Facebook {

	@Override
	public void fb() {
		// TODO Auto-generated method stub
		super.fb();
	}
	@Override
	public void fb(String a, String b) {
		// TODO Auto-generated method stub
		super.fb(a, b);
	}
	@Override
	public void fb(long c) {
		// TODO Auto-generated method stub
		super.fb(c);
	}
	public static void main(String[] args) {
		Facebook2 f2 = new Facebook2();
		f2.fb();
		f2.fb("Monisha2203", "monu22@");
		f2.fb(8220384198l);
	}
}
