package com.boots.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TransactionsLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionsLogsId;

    private String type;

    private String description;

    private String status;

    private Date date;

    public Long getTransactionsLogsId() {
        return transactionsLogsId;
    }

    public void setTransactionsLogsId(Long transactionsLogsId) {
        this.transactionsLogsId = transactionsLogsId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
