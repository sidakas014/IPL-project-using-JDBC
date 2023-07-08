package postgresql.jdbc;

class Match {
    private String matchId, matchSeason, matchTossWinner, matchWinner, matchVenue;

    //-------------------------Getter-----------------------------------------
    public String getMatchId() {
        return matchId;
    }
    public String getMatchSeason() {
        return matchSeason;
    }
    public String getMatchWinner() {
        return matchWinner;
    }
    public String getMatchTossWinner() {
        return matchTossWinner;
    }

    public String getMatchVenue() {
        return matchVenue;
    }

    //----------------------------Setter------------------------------------------
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
    public void setMatchSeason(String matchSeason) {
        this.matchSeason = matchSeason;
    }
    public void setMatchTossWinner(String matchTossWinner) {
        this.matchTossWinner = matchTossWinner;
    }
    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    public void setMatchVenue(String matchVenue) {
        this.matchVenue = matchVenue;
    }
}
