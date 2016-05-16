package spring.boot.rest.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.modules.domain.MaptHotData;
import spring.boot.rest.modules.service.MaptHotService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MaptHotController {

    private final static String MaptHot = "mapt/hot";

    @Autowired
    MaptHotService MaptHotService;

    @RequestMapping(value = MaptHot + "/all", method = RequestMethod.GET)
    public DataResult<List<MaptHotData>> getAll() {
        return MaptHotService.getAllMaptHot();
    }

    @RequestMapping(value = MaptHot + "/id/{id}", method = RequestMethod.GET)
    public DataResult<MaptHotData> get(@PathVariable int id) {
        return MaptHotService.get(id);
    }

}
