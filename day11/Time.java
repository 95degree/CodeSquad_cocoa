public class Time {

    private int hour;
    private int minute;

    public Time(String time) {
        String[] hourAndMinute = new String[2];
        hourAndMinute = time.split(":");
        this.hour = Integer.parseInt(hourAndMinute[0]);
        this.minute = Integer.parseInt(hourAndMinute[1]);
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }
}


