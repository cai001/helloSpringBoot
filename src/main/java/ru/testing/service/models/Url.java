package ru.testing.service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "urllistg")
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;
    private int status;
    @Temporal(TemporalType.DATE)
    private Date date;

    @Override
    public String toString(){
        return "" + id + url + status + date;
    }
}
