package spring.boot.rest.modules.service;

import org.springframework.stereotype.Service;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.IService;
import spring.boot.rest.modules.domain.MaptHotData;
import spring.boot.rest.modules.entity.MaptHot;

import java.util.List;

@Service
public interface MaptHotService extends IService<MaptHot> {

    DataResult<List<MaptHotData>> getAllMaptHot();

    DataResult<MaptHotData> get(int id);

//    DataResult<MaptHotData> getMaptInfoByType(String strAttr);

//
//    DataResult<MaptHotData> addMaptHot(MaptHotData MaptHot);
//
//    DataResult<List<MaptHotData>> addMaptHots(List<MaptHotData> MaptHots);
//
//    DataResult<MaptHotData> updateMaptHot(MaptHotData MaptHot);
//
//    DataResult<Integer> deleteMaptHot(int MaptHotId);

}
