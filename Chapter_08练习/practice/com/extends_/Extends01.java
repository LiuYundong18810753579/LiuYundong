package com.extends_;

// 继承解决代码的冗余过程
public class Extends01 {
    public static void main(String[] args) {
        pupil person1 = new pupil();
        person1.name = "银角大王";
        person1.age = 23;
        person1.setScore(80);
        person1.testing();
        person1.showinfo();

        System.out.println("=====================");
        Graduate person2 = new Graduate();
        person2.name = "金角大王";
        person2.age = 32;
        person2.setScore(95);
        person2.testing();
        person2.showinfo();
    }

}
// class students{
// public String name;
// public int age;
// private double score;
// // 输入set，可以会直接出来
// // public String getName() {
// // return name;
// // }
// // public void setName(String name) {
// // this.name = name;
// // }
// // public void setAge(int age) {
// // this.age = age;
// // }
// public void setScore(double score) {
// this.score = score;
// }

// }