package Chapter_07;

public class Homework_9 {
    public static void main(String[] args) {
        Music hhh = new Music("灯火里的中国", 300);
        hhh.info();

    }

}

class Music {
    String name;
    int time;

    public Music(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void info() {
        System.out.println("音乐的名字为" + name);
        System.out.println("音乐时长为" + time + "s");
    }

}
