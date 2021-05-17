package com.xiaohuang;

import com.modifer.A;

public class test {
    public static void main(String[] args) {
        A a = new A();
        int b = a.n1;
        // int c = a.n3; 是错误的，因为不同包之间只能引用
        // public 的属性和方法
        a.m1();
    }

}
