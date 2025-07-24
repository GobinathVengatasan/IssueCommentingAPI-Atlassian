package com.addteq.assessment.model;


//import net.java.ao.Entity;

public interface CommentEntity /*extends Entity*/ {

    String getDescription();

    void setDescription(String description);

    boolean isComplete();

    void setComplete(boolean complete);
}
