public class Matchup {
    private Team team1;
    private Team team2;

    public Matchup(Team one, Team two){
        team1 = one;
        team2 = two;
    }

    public Team gameResult(){
        double score1 = 1.0/team1.ranking * Math.random();
        double score2 = 1.0/ team2.ranking * Math.random();
        if(score1 > score2){
            return team1;
        }
        else {
            return team2;
        }
    }

    @Override
    public String toString() {
        return team1.name + " VS " + team2.name;
    }
}
