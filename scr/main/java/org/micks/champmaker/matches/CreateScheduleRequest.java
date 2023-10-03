package org.micks.champmaker.matches;

public class CreateScheduleRequest {

    private Long champId;

    public CreateScheduleRequest(Long champId) {
        this.champId = champId;
    }

    public CreateScheduleRequest() {
    }

    public Long getChampId() {
        return champId;
    }
}
