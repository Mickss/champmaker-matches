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

    public void setChampId(Long champId) {
        this.champId = champId;
    }

    public List<Object> getTestList() {
        return testList;
    }

    public void setTestList(List<Object> testList) {
        this.testList = testList;
    }
}
