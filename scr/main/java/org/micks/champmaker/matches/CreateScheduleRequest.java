package org.micks.champmaker.matches;

public class CreateScheduleRequest {

    private Long team1;
    private Long team2;
    private String dateOfGame;
    private String timeOfGame;

    public CreateScheduleRequest(Long team1, Long team2, String dateOfGame, String timeOfGame) {
        this.team1 = team1;
        this.team2 = team2;
        this.dateOfGame = dateOfGame;
        this.timeOfGame = timeOfGame;
    }

    public CreateScheduleRequest() {

    }

    public Long getTeam1() {
        return team1;
    }

    public Long getTeam2() {
        return team2;
    }

    public String getDateOfGame() {
        return dateOfGame;
    }

    public String getTimeOfGame() {
        return timeOfGame;
    }
}
