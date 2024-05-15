package solution2_with_enum;

public class Video {
    String name;
    String genre;
    public int basePrice;
    public int penaltyPerDay;
    public int delay;
    public String category1;
    Category category;
    public Video(String name, String genre,Category category) {
        this.name = name;
        this.genre = genre;
        switch (category){
            case CHILDREN-> {
                this.basePrice = 1500;
                this.penaltyPerDay = 1500;
                this.delay = 3;
            }
            case NORMAL-> {
                this.basePrice = 2000;
                this.penaltyPerDay = 1500;
                this.delay = 2;
            }
            case NEW -> {
                this.basePrice = 3000;
                this.penaltyPerDay = 1500;
                this.delay = 1;
            }
        }

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
