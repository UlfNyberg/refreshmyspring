package integration;

import com.example.refreshmyspring.models.SpaceStation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-24
 * Time: 10:45
 * Project: refreshmyspring
 * Copyright: MIT
 */
@FeignClient(value="spacestation", url="http://localhost:8080")
public interface SpaceStationClient {

    @RequestMapping(path = "/station/{stationId}", method = RequestMethod.GET)
    SpaceStation findSpaceStation(@PathVariable Integer stationId);
}
