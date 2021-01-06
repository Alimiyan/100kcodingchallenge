package Classandobject;

import Classandobject.Sample;

public class ClassSample {
    public static void main(String[] args) {
        Sample s1=new Sample();
        Sample s2=new Sample();
        s1.a=20;
        s2.a=10;
        s1.b=30;
        s2.b=40;
        System.out.println("s1.a= "+s1.a+" s1.b= "+s1.b+" s2.a= "+s2.a+" s2.b= "+s2.b);
    }
     
}
