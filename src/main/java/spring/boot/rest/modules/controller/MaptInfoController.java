package spring.boot.rest.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.modules.domain.MaptInfoData;
import spring.boot.rest.modules.service.MaptInfoService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MaptInfoController {

    private final static String MaptInfo = "mapt/info";

    @Autowired
    MaptInfoService MaptInfoService;

    @RequestMapping(value = MaptInfo + "/all", method = RequestMethod.GET)
    public DataResult<List<MaptInfoData>> getAll() {
        return MaptInfoService.getAllMaptInfo();
    }

    @RequestMapping(value = MaptInfo + "/id/{id}", method = RequestMethod.GET)
    public DataResult<MaptInfoData> get(@PathVariable int id) {
        return MaptInfoService.get(id);
    }

    @RequestMapping(value = MaptInfo + "/type/{strAttr}", method = RequestMethod.GET)
    public DataResult<List<MaptInfoData>> getMaptInfoByType(@PathVariable String strAttr) {
        return MaptInfoService.getMaptInfoByType(strAttr);
    }

    @RequestMapping(value = MaptInfo + "/latest", method = RequestMethod.GET)
    public DataResult<List<MaptInfoData>> getLatestMaptInfo() {
        return MaptInfoService.getLatestMaptInfo();
    }

}
