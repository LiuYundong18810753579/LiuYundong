package com.encopsulation;

public class encop_02 {
    public static void main(String[] args) {
        Account A = new Account("jick", 780, "695653");
        System.out.println(A.info());

    }
}

class Account {
    private String name;
    private double money;
    private String passord;

    // public Account(){};
    public Account(String name, double money, String passord) {
        setname(name);
        setmoney(money);
        setpassord(passord);
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("输入的姓名应该为2位、3位或者四位");
            System.out.println("请重新输入");
        }
    }

    public double getmoney() {
        return money;
    }

    public void setmoney(double money) {
        if (money >= 20) {
            this.money = money;
        } else {
            System.out.println("您的余额不足20，请充值");
        }
    }

    public String getpassord() {
        return passord;
    }

    public void setpassord(String passord) {
        if (passord.length() == 6) {
            this.passord = passord;
        } else {
            System.out.println("密码必须满足六位");
        }
    }

    public String info() {
        return "姓名为=" + name + "\t" + "余额为=" + money + "\t" + "密码为=" + passord;
    }

}