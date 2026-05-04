public class Game {
    int id;
    double temp;
    Team away;
    Team home;
    int away_score;
    int home_score;


    public Game(int id, double temp, Team away, Team home, int away_score, int home_score) {
        this.id = id;
        this.temp = temp;
        this.away = away;
        this.home = home;
        this.away_score = away_score;
        this.home_score = home_score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Team getHome() {return home;}

    public void setHome(Team home) {
        this.home = home;
    }

    public int getAway_score() {
        return away_score;
    }

    public void setAway_score(int away_score) {
        this.away_score = away_score;
    }

    public int getHome_score() {
        return home_score;
    }

    public void setHome_score(int home_score) {
        this.home_score = home_score;
    }

    public void print_game(){
        System.out.println("Game #" + id);
        System.out.printf("Temperature: %.2f F\n", temp );
        System.out.println("Away Team: " + away.getName() +", "+ away_score );
        System.out.println("Home Team: " + home.getName() +", "+ home_score);
        System.out.println();
    }

}
