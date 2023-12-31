package org.micks.champmaker.matches;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class GameController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void schedule(@RequestBody CreateScheduleRequest createScheduleRequest) {
        System.out.println("Will create schedule for championship " + createScheduleRequest.getChampId());
        System.out.println("Sending more " + createScheduleRequest.getTestList().size());
    }
}
