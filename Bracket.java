public class Bracket {
    private Matchup[] southMatches = new Matchup[8];
    private Matchup[] eastMatches = new Matchup[8];
    private Matchup[] midwestMatches = new Matchup[8];
    private Matchup[] westMatches = new Matchup[8];
    private Team[] southTeams = new Team[16];
    private Team[] eastTeams = new Team[16];
    private Team[] midwestTeams = new Team[16];
    private Team[] westTeams = new Team[16];
    private int[] order = {1,8,5,4,6,3,7,2};
    public Bracket(){
        southTeams[0] = new Team(1, "Alabama");
        eastTeams[0] = new Team(1, "Purdue");
        midwestTeams[0] = new Team(1, "Houston");
        westTeams[0] = new Team(1, "Kansas");

        southTeams[1] = new Team(2, "Arizona");
        eastTeams[1] = new Team(2, "Marquette");
        midwestTeams[1] = new Team(2, "Texas");
        westTeams[1] = new Team(2, "UCLA");

        southTeams[2] = new Team(3, "Baylor");
        eastTeams[2] = new Team(3, "Kansas St");
        midwestTeams[2] = new Team(3, "Xavier");
        westTeams[2] = new Team(3, "Gonzaga");

        southTeams[3] = new Team(4, "Virginia");
        eastTeams[3] = new Team(4, "Tennessee");
        midwestTeams[3] = new Team(4, "Indiana");
        westTeams[3] = new Team(4, "UConn");

        southTeams[4] = new Team(5, "San Diego St");
        eastTeams[4] = new Team(5, "Duke");
        midwestTeams[4] = new Team(5, "Miami");
        westTeams[4] = new Team(5, "Saint Mary's");

        southTeams[5] = new Team(6, "Creighton");
        eastTeams[5] = new Team(6, "Kentucky");
        midwestTeams[5] = new Team(6, "Iowa State");
        westTeams[5] = new Team(6, "TCU");

        southTeams[6] = new Team(7, "Missouri");
        eastTeams[6] = new Team(7, "Michigan St");
        midwestTeams[6] = new Team(7, "Texas A&M");
        westTeams[6] = new Team(7, "Northwestern");

        southTeams[7] = new Team(8, "Maryland");
        eastTeams[7] = new Team(8, "Memphis");
        midwestTeams[7] = new Team(8, "Iowa");
        westTeams[7] = new Team(8, "Arkansas");

        southTeams[8] = new Team(9, "West Virginia");
        eastTeams[8] = new Team(9, "FAU");
        midwestTeams[8] = new Team(9, "Auburn");
        westTeams[8] = new Team(9, "Illinois");

        southTeams[9] = new Team(10, "Utah State");
        eastTeams[9] = new Team(10, "USC");
        midwestTeams[9] = new Team(10, "Penn State");
        westTeams[9] = new Team(10, "Boise St");

        southTeams[10] = new Team(11, "NC State");
        eastTeams[10] = new Team(11, "Providence");
        midwestTeams[10] = new Team(11, "MSST/PITT");
        westTeams[10] = new Team(11, "ASU/NEV");

        southTeams[11] = new Team(12, "Charleston");
        eastTeams[11] = new Team(12, "Oral Roberts");
        midwestTeams[11] = new Team(12, "Drake");
        westTeams[11] = new Team(12, "VCU");

        southTeams[12] = new Team(13, "Furman");
        eastTeams[12] = new Team(13, "Louisiana");
        midwestTeams[12] = new Team(13, "Kent State");
        westTeams[12] = new Team(13, "Iona");

        southTeams[13] = new Team(14, "UCSB");
        eastTeams[13] = new Team(14, "Montana St");
        midwestTeams[13] = new Team(14, "Kennesaw St");
        westTeams[13] = new Team(14, "Grand Canyon");

        southTeams[14] = new Team(15, "Princeton");
        eastTeams[14] = new Team(15, "Vermont");
        midwestTeams[14] = new Team(15, "Colgate");
        westTeams[14] = new Team(15, "UNC Asheville");

        southTeams[15] = new Team(16, "AMCC/SMO");
        eastTeams[15] = new Team(16, "TXSO/FDU");
        midwestTeams[15] = new Team(16, "N Kentucky");
        westTeams[15] = new Team(16, "Howard");

        //for loop 1 - 0
        for(int i = 0; i < order.length; i ++){
            int num = order[i] - 1;
            int num2 = 16-(1+num);
            Matchup match1 = new Matchup(southTeams[num], southTeams[num2]);
            Matchup match2 = new Matchup(eastTeams[num], eastTeams[num2]);
            Matchup match3 = new Matchup(midwestTeams[num], midwestTeams[num2]);
            Matchup match4 = new Matchup(westTeams[num], westTeams[num2]);

            southMatches[i] = match1;
            eastMatches[i] = match2;
            midwestMatches[i] = match3;
            westMatches[i] = match4;
        }

    }
//another for loop to go through and update matches and shit,
    //check if num of matches is 1 or below or some shit
    public void generate(){
        Matchup[] southMatches32 = new Matchup[4];
        Matchup[] eastMatches32 = new Matchup[4];
        Matchup[] midwestMatches32 = new Matchup[4];
        Matchup[] westMatches32 = new Matchup[4];

        System.out.println("");
        System.out.println("Round 32 Results!!!");
        System.out.println("");
        for(int i = 0; i < southMatches.length/2; i++){
            int index = i * 2;
            Team southTeam1 = southMatches[index].gameResult();
            Team eastTeam1 = eastMatches[index].gameResult();
            Team midwestTeam1 = midwestMatches[index].gameResult();
            Team westTeam1 = westMatches[index].gameResult();

            Team southTeam2 = southMatches[index+1].gameResult();
            Team eastTeam2 = eastMatches[index+1].gameResult();
            Team midwestTeam2 = midwestMatches[index+1].gameResult();
            Team westTeam2 = westMatches[index+1].gameResult();

            southMatches32[i] = new Matchup(southTeam1, southTeam2);
            eastMatches32[i] = new Matchup(eastTeam1, eastTeam2);
            midwestMatches32[i] = new Matchup(midwestTeam1, midwestTeam2);
            westMatches32[i] = new Matchup(westTeam1, westTeam2);

            System.out.println("south");
            System.out.println(southMatches32[i]);
            System.out.println("east");
            System.out.println(eastMatches32[i]);
            System.out.println("midwest");
            System.out.println(midwestMatches32[i]);
            System.out.println("west");
            System.out.println(westMatches32[i]);
        }
        Matchup[] southMatches16 = new Matchup[2];
        Matchup[] eastMatches16 = new Matchup[2];
        Matchup[] midwestMatches16 = new Matchup[2];
        Matchup[] westMatches16 = new Matchup[2];
        System.out.println("");
        System.out.println("Round 16 Results!!!");
        System.out.println("");
        for(int i = 0; i < southMatches32.length/2; i++) {
            int index = i * 2;
            Team southTeam1 = southMatches32[index].gameResult();
            Team eastTeam1 = eastMatches32[index].gameResult();
            Team midwestTeam1 = midwestMatches32[index].gameResult();
            Team westTeam1 = westMatches32[index].gameResult();

            Team southTeam2 = southMatches32[index + 1].gameResult();
            Team eastTeam2 = eastMatches32[index + 1].gameResult();
            Team midwestTeam2 = midwestMatches32[index + 1].gameResult();
            Team westTeam2 = westMatches32[index + 1].gameResult();

            southMatches16[i] = new Matchup(southTeam1, southTeam2);
            eastMatches16[i] = new Matchup(eastTeam1, eastTeam2);
            midwestMatches16[i] = new Matchup(midwestTeam1, midwestTeam2);
            westMatches16[i] = new Matchup(westTeam1, westTeam2);

            System.out.println("south");
            System.out.println(southMatches16[i]);
            System.out.println("east");
            System.out.println(eastMatches16[i]);
            System.out.println("midwest");
            System.out.println(midwestMatches16[i]);
            System.out.println("west");
            System.out.println(westMatches16[i]);
        }
        System.out.println("");
        System.out.println("Sweet 8 Results!!!");
        System.out.println("");
        int index = 0;
        Team southTeam1 = southMatches16[index].gameResult();
        Team eastTeam1 = eastMatches16[index].gameResult();
        Team midwestTeam1 = midwestMatches16[index].gameResult();
        Team westTeam1 = westMatches16[index].gameResult();

        Team southTeam2 = southMatches16[index+1].gameResult();
        Team eastTeam2 = eastMatches16[index+1].gameResult();
        Team midwestTeam2 = midwestMatches16[index+1].gameResult();
        Team westTeam2 = westMatches16[index+1].gameResult();

        Matchup southFinal = new Matchup(southTeam1, southTeam2);
        Matchup eastFinal = new Matchup(eastTeam1, eastTeam2);
        Matchup midwestFinal = new Matchup(midwestTeam1, midwestTeam2);
        Matchup westFinal = new Matchup(westTeam1, westTeam2);

        System.out.println("south");
        System.out.println(southFinal);
        System.out.println("east");
        System.out.println(eastFinal);
        System.out.println("midwest");
        System.out.println(midwestFinal);
        System.out.println("west");
        System.out.println(westFinal);

        System.out.println("Final 4 Results!!!");
        System.out.println("");

        Team southWinner = southFinal.gameResult();
        Team eastWinner = eastFinal.gameResult();
        Team midwestWinner = midwestFinal.gameResult();
        Team westWinner = westFinal.gameResult();

        Matchup southVwest = new Matchup(southWinner, westWinner);
        Matchup eastVmidwest = new Matchup(eastWinner, midwestWinner);

        System.out.println(southVwest);
        System.out.println(eastVmidwest);

        System.out.println("");
        System.out.println("Final 2 Results!!!");
        System.out.println("");

        Team southVMidwestWinner = southVwest.gameResult();
        Team eastVwestWinner = eastVmidwest.gameResult();

        Matchup finalGame = new Matchup(southVMidwestWinner, eastVwestWinner);

        System.out.println(finalGame);

        System.out.println("Winner!!!");
        System.out.println("");

        Team winner = finalGame.gameResult();

        System.out.println(winner);
    }
}
