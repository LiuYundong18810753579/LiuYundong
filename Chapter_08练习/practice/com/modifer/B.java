package com.modifer;

public class B {
    public void say() {
        A a = new A();
        // 在同一个包下可以访问什么
        System.out.println(a.n3);
        int b = a.n1;
        // int c = a.n4 是错误的，不可以访问私有的属性
        System.out.println(b);

    }

}

class tiger {
    int a = 100;
}

class dog {

}