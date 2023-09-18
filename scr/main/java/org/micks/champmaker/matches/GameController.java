package org.micks.champmaker.matches;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSchedule(@RequestBody CreateScheduleRequest createScheduleRequest) {
        System.out.println("Will create schedule for team " + createScheduleRequest.getTeam1());
    }
}
