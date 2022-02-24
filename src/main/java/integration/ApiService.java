package integration;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-23
 * Time: 16:41
 * Project: refreshmyspring
 * Copyright: MIT
 */
public interface ApiService {

    @GetMapping("/booky")  //endpointen ska heta likadant
    public List<Object> getBooks();
}
