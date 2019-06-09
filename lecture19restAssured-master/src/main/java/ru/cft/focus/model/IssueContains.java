package ru.cft.focus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueContains {
    public String url;
    public String repository_url;
    public String labels_url;
    public String comments_url;
    public String events_url;
    public String html_url;
    public int id;
    public String node_id;
    public int number;
    public String body;


    public IssueContains(String body,String repository_url,String labels_url,String comments_url,String events_url, String html_url, int id, String node_id, int number) {
        this.body = body;
        this.id = id;
        this.repository_url = repository_url;
        this.labels_url = labels_url;
        this.comments_url=comments_url;
        this.events_url=events_url;
        this.html_url=html_url;
        this.node_id=node_id;
        this.number=number;
        this.url=url;
    }
    public IssueContains()
    {}
}
