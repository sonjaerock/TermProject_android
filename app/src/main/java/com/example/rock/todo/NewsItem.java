package com.example.rock.todo;

/**
 * Created by rock on 2017. 12. 18..
 */

public class NewsItem {
    private String headline;
    private String reporterName;
    private String date;
    private Integer dates;
    private String dday;
    public String label;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDates(Integer dates) { this.dates = dates; }

    public Integer getDates() { return dates; }

    public String getDday() {
        return dday;
    }

    public void setDday(String dday) {
        this.dday = dday;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
