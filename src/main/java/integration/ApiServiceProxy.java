package integration;


import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-23
 * Time: 16:42
 * Project: refreshmyspring
 * Copyright: MIT
 */

@FeignClient(name = "api-service")
public interface ApiServiceProxy extends ApiService {
}
