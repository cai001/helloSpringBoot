package ru.testing.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.testing.service.models.Url;

import java.util.Date;
import java.util.List;

public interface UrlRepository extends JpaRepository<Url, Integer> {
//    List<Url> findAllByDateBefor(Date date);
}
