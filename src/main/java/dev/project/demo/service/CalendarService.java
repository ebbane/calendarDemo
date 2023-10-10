package dev.project.demo.service;


import org.ebbane.CalendarLibrary;
import org.ebbane.model.MonthlyCalendar;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

  public String getHTMLCalendar(Integer year, Integer month) {
    return CalendarLibrary.generateHTMLCalendar(year, month);
  }

  public MonthlyCalendar getJSONCalendar(Integer year, Integer month) {
    return CalendarLibrary.generateCalendar(year, month);
  }

}
