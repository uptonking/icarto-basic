package spring.boot.rest.modules.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.impl.BaseService;
import spring.boot.rest.modules.converter.MaptInfoModelConverter;
import spring.boot.rest.modules.domain.MaptInfoData;
import spring.boot.rest.modules.entity.MaptInfo;
import spring.boot.rest.modules.mapper.MaptInfoMapper;
import spring.boot.rest.modules.service.MaptInfoService;

import java.util.List;

/**
 * {type your description }
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@Service("MaptInfoService")
@Transactional(rollbackFor = Exception.class)
public class MaptInfoServiceImpl extends BaseService<MaptInfo> implements MaptInfoService {


    @Override
    public DataResult<List<MaptInfoData>> getAllMaptInfo() {
        return new DataResult<List<MaptInfoData>>(MaptInfoModelConverter.toMaptInfoDataList(((MaptInfoMapper) mapper).selectAll()));
    }

    @Override
    public DataResult<MaptInfoData> get(int id) {
        return new DataResult<MaptInfoData>(MaptInfoModelConverter.toMaptInfoData(selectByPrimaryKey(id)));
    }

    @Override
    public DataResult<List<MaptInfoData>> getMaptInfoByType(String strAttr) {
        return new DataResult<List<MaptInfoData>>(MaptInfoModelConverter.toMaptInfoDataList(((MaptInfoMapper) mapper).queryMaptInfoByType(strAttr)));

    }

    @Override
    public DataResult<List<MaptInfoData>> getLatestMaptInfo() {
        return new DataResult<List<MaptInfoData>>(MaptInfoModelConverter.toMaptInfoDataList(((MaptInfoMapper) mapper).queryLatestMaptInfo()));
    }


//
//    @Override
//    public DataResult<MaptInfoData> addMaptInfo(MaptInfoData MaptInfo) {
//        if (MaptInfo == null) {
//            return new DataResult<MaptInfoData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptInfo model = MaptInfoModelConverter.toMaptInfo(MaptInfo);
//        int i = insertUseGeneratedKeys(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptInfoData>(i + "", "add MaptInfo fail");
//    }
//
//    @Override
//    public DataResult<List<MaptInfoData>> addMaptInfos(List<MaptInfoData> MaptInfos) {
//        if (MaptInfos.isEmpty()) {
//            return new DataResult<List<MaptInfoData>>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        List<MaptInfoData> returnList = new ArrayList<MaptInfoData>(MaptInfos.size());
//        for (MaptInfoData data : MaptInfos) {
//            MaptInfo model = MaptInfoModelConverter.toMaptInfo(data);
//            int i = insertUseGeneratedKeys(model);
//            if (i > 0) {
//                returnList.add(MaptInfoModelConverter.toMaptInfoData(selectByPrimaryKey(model.getId())));
//            }
//        }
//        return new DataResult<List<MaptInfoData>>(returnList);
//    }
//
//    @Override
//    public DataResult<MaptInfoData> updateMaptInfo(MaptInfoData MaptInfo) {
//        if (MaptInfo == null) {
//            return new DataResult<MaptInfoData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptInfo model = MaptInfoModelConverter.toMaptInfo(MaptInfo);
//        int i = updateByPrimaryKeySelective(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptInfoData>(i + "", "update MaptInfo fail");
//    }
//
//    @Override
//    public DataResult<Integer> deleteMaptInfo(int id) {
//        int i = deleteByPrimaryKey(id);
//        if (i > 0) {
//            return new DataResult<Integer>(i);
//        }
//        return new DataResult<Integer>(i + "", "delete MaptInfo fail");
//    }
}
