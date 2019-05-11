package com.company;

public class charS {



    public static void main(String[] args) {

	 //  charS char1 = new charS("YesYesYes");
	   System.out.println("helloworld");
        CharSequence chars= new MyCharSequence("YesYesYes");
       // System.out.println("chars= " + chars);
        System.out.println("chars.length() = " + chars.length());
        System.out.println("chars.charAt(7) = " + chars.charAt(7));
        System.out.println("chars.subSequence(0,5) = " + chars.subSequence(0,5));

    }
}
