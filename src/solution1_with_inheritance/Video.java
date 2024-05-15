package solution1_with_inheritance;

public class Video {
    String name;
    String genre;
    public int basePrice;
    public int penaltyPerDay;
    public int delay;

    public Video(String name, String genre, int basePrice, int penaltyPerDay, int delay) {
        this.name = name;
        this.genre = genre;
        this.basePrice = basePrice;
        this.penaltyPerDay = penaltyPerDay;
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "enuvideo.Video{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", basePrice=" + basePrice +
                ", penaltyPerDay=" + penaltyPerDay +
                ", delay=" + delay +
                '}';
    }
}
