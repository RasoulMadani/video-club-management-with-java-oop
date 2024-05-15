package solution2_with_enum;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
public class Rent {
    Video video;
    LocalDate date;

    public Rent(Video video, LocalDate date) {
        this.video = video;
        this.date = date;
    }
    public  int calcPenalty(){
       int day = (int) DAYS.between( this.date, LocalDate.now());
       if(day > video.delay){
         return   (day -  video.delay) * video.penaltyPerDay;
       }
       return 0;
    }
    public  long calcInvoice(){
       return video.basePrice + calcPenalty();
    }
    @Override
    public String toString() {
        return "enuvideo.Rent{" +
                "video=" + video +
                ", date=" + date +
                '}';
    }
}
