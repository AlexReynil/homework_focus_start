package ru.cft.focus.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {
    public String title;
    public String body;
      public int milestone;
    /*   public String[] labels;
       public String[] assignees;


      public Issue(String title, String body, int milestone, String[] labels, String[] assignees)
       {
           this.title = title;
           this.body = body;
           this.milestone = milestone;
           this.labels=labels;
           this.assignees = assignees;
       }*/
     public Issue(String title, String body, int milestone)
     {
         this.title = title;
         this.body = body;
         this.milestone = milestone;

     }
    /* public Issue(String title, String body) {
        this.title = title;
        this.body = body;
    }*/
    public Issue()
    {}
}
