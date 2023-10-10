package dev.project.demo.controller;

import dev.project.demo.service.CalendarService;
import org.ebbane.model.MonthlyCalendar;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("calendar")
public class CalendarController {

  private final CalendarService calendarService;

  public CalendarController(CalendarService calendarService) {
    this.calendarService = calendarService;
  }

  @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
  public String getHTMLCalendar(@RequestParam @NonNull Integer year,
      @RequestParam @NonNull Integer month
  ) {
    return calendarService.getHTMLCalendar(year, month);
  }

  @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
  public MonthlyCalendar getJSONCalendar(@RequestParam @NonNull Integer year,
      @RequestParam @NonNull Integer month
  ) {
    return calendarService.getJSONCalendar(year, month);
  }

}
