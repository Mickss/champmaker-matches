package org.micks.champmaker.matches;

import java.util.List;

public class CreateScheduleRequest {

    private Long champId;
    private List<Object> testList;

    public CreateScheduleRequest(Long champId, List<Object> testList) {
        this.champId = champId;
        this.testList = testList;
    }

    public CreateScheduleRequest() {
    }

    public Long getChampId() {
        return champId;
    }

    public List<Object> getTestList() {
        return testList;
    }
}
