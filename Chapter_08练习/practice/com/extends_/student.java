package com.extends_;

// 父类，是pupil和Graduate的父类
public class student {
    // 共有属性
    public String name;
    public int age;
    private double score;

    // 共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showinfo() {
        System.out.println("学生名" + name + "年龄" + age);
        System.out.println("分数" + score);
    }

}
