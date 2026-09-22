class Time {
    int hr;
    int min;
    int seconds;

    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {

        if (h >= 0 && h <= 23)
            hr = h;
        else
            hr = 0;

        if (m >= 0 && m <= 59)
            min = m;
        else
            min = 0;

        if (s >= 0 && s <= 59)
            seconds = s;
        else
            seconds = 0;
    }

    void display() {
        System.out.println("Hours: " + hr);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + seconds);
    }
}

class timeRun {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(12, 30, 45);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();
    }
}