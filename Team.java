public class Team {
    public int ranking;
    public String name;
    public Team(int r, String n){
        ranking = r;
        name = n;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
