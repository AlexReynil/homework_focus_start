package com.company;

public class MyCharSequence implements CharSequence {
    public String line;
    MyCharSequence(String s)
    {
       // s="";
        line=s;
    }
    @Override
    public int length() {
        return line.length();
    }

    @Override
    public char charAt(int index) {
       return line.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return line.subSequence(start, end);
    }
}
