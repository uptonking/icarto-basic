package spring.boot.rest.modules.service;

import org.springframework.stereotype.Service;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.IService;
import spring.boot.rest.modules.domain.MaptInfoData;
import spring.boot.rest.modules.entity.MaptInfo;

import java.util.List;

@Service
public interface MaptInfoService extends IService<MaptInfo> {

    DataResult<List<MaptInfoData>> getAllMaptInfo();

    DataResult<MaptInfoData> get(int id);

    DataResult<List<MaptInfoData>> getMaptInfoByType(String strAttr);

    DataResult<List<MaptInfoData>> getLatestMaptInfo();

//
//    DataResult<MaptInfoData> addMaptInfo(MaptInfoData MaptInfo);
//
//    DataResult<List<MaptInfoData>> addMaptInfos(List<MaptInfoData> MaptInfos);
//
//    DataResult<MaptInfoData> updateMaptInfo(MaptInfoData MaptInfo);
//
//    DataResult<Integer> deleteMaptInfo(int MaptInfoId);

}
