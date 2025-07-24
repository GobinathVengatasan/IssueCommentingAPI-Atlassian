package com.addteq.assessment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
@XmlRootElement(name = "Comment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comment implements Serializable {

    @XmlElement(name = "Id")
    String id;
    @XmlElement(name = "IssueId")
    String issueId = UUID.randomUUID().toString();
    @XmlElement(name = "Author")
    String author;
    @XmlElement(name = "Message")
    String message;
    @XmlElement(name = "CreatedAt")
    String createdAt = Instant.now().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
