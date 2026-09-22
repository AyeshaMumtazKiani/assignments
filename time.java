class Time {

    int hour;
    int minute;
    int second;

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hour = 10;
        t1.minute = 30;
        t1.second = 45;
        t1.displayTime();
    }
}