package ru.testing.service.forms;

import lombok.Data;

import java.util.Date;

@Data
public class UrlForm {
    private String url;
    private int status;
    private Date date;
}
