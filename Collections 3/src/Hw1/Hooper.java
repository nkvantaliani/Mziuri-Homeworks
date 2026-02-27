package Hw1;

public class Hooper {
    private String name;
    private String  LastName;
    private int points;
    private int rebounds;
    private int assists;
    private int blocks;
    private int lostBalls;

    public Hooper(String name, String lastName, int points, int rebounds, int assists,int blocks, int lostBalls) {
        this.name = name;
        LastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.blocks = blocks;
        this.lostBalls = lostBalls;
    }

    public double pointsScore() {
        return points * 1;
    }

    public double reboundsScore() {
        return rebounds * 1;
    }

    public double assistsScore() {
        return assists * 1.5;
    }

    public double blocksScore() {
        return blocks * 2;
    }

    public double lostScore() {
        return lostBalls * 2;
    }

    public double getRating() {
        return pointsScore()
                + reboundsScore()
                + assistsScore()
                + blocksScore()
                - lostScore();
    }

    @Override
    public String toString() {
        return "Hooper{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", points=" + points +
                ", rebounds=" + rebounds +
                ", assists=" + assists +
                ", blocks=" + blocks +
                ", lostBalls=" + lostBalls +
                '}';
    }
}
