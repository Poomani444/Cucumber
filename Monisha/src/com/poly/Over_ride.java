package com.poly;

public class Over_ride extends Over_loading{

 @Override
public void mobile() {
	super.mobile();
}

 @Override
	public void mobile(String a, int b, char c) {
		super.mobile(a, b, c);
	}
 public static void main(String[] args) {
	 Over_ride or = new Over_ride();
	 or.mobile();
	 or.mobile("Iphone", 15, '+');
}
}

