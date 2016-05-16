package spring.boot.rest.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.modules.domain.MaptThumbData;
import spring.boot.rest.modules.service.MaptThumbService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MaptThumbController {

    private final static String MaptThumb = "mapt/images";

    @Autowired
    MaptThumbService MaptThumbService;

    @RequestMapping(value = MaptThumb + "/all", method = RequestMethod.GET)
    public DataResult<List<MaptThumbData>> getAll() {
        return MaptThumbService.getAllMaptThumb();
    }

    @RequestMapping(value = MaptThumb + "/{id}", method = RequestMethod.GET)
    public DataResult<MaptThumbData> get(@PathVariable int id) {
        return MaptThumbService.get(id);
    }

}
