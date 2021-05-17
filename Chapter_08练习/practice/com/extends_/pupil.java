package com.extends_;

//让子类pupil继承父类student的属性和方法
public class pupil extends student {
    // 特有的属性
    public void testing() {
        System.out.println("小学生" + name + "正在考数学");
    }

}
