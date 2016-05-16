package spring.boot.rest.modules.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.impl.BaseService;
import spring.boot.rest.modules.converter.MaptHotModelConverter;
import spring.boot.rest.modules.domain.MaptHotData;
import spring.boot.rest.modules.entity.MaptHot;
import spring.boot.rest.modules.mapper.MaptHotMapper;
import spring.boot.rest.modules.service.MaptHotService;

import java.util.List;

/**
 * {type your description }
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@Service("MaptHotService")
@Transactional(rollbackFor = Exception.class)
public class MaptHotServiceImpl extends BaseService<MaptHot> implements MaptHotService {


    @Override
    public DataResult<List<MaptHotData>> getAllMaptHot() {
        return new DataResult<List<MaptHotData>>(MaptHotModelConverter.toMaptHotDataList(((MaptHotMapper) mapper).selectAll()));
    }

    @Override
    public DataResult<MaptHotData> get(int id) {
        return new DataResult<MaptHotData>(MaptHotModelConverter.toMaptHotData(selectByPrimaryKey(id)));
    }

//    @Override
//    public DataResult<MaptHotData> getMaptInfoByType(String strAttr) {
//        return new DataResult<MaptHotData>(MaptHotModelConverter.toMaptHotData(select(strAttr)));
//
//    }


//
//    @Override
//    public DataResult<MaptHotData> addMaptHot(MaptHotData MaptHot) {
//        if (MaptHot == null) {
//            return new DataResult<MaptHotData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptHot model = MaptHotModelConverter.toMaptHot(MaptHot);
//        int i = insertUseGeneratedKeys(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptHotData>(i + "", "add MaptHot fail");
//    }
//
//    @Override
//    public DataResult<List<MaptHotData>> addMaptHots(List<MaptHotData> MaptHots) {
//        if (MaptHots.isEmpty()) {
//            return new DataResult<List<MaptHotData>>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        List<MaptHotData> returnList = new ArrayList<MaptHotData>(MaptHots.size());
//        for (MaptHotData data : MaptHots) {
//            MaptHot model = MaptHotModelConverter.toMaptHot(data);
//            int i = insertUseGeneratedKeys(model);
//            if (i > 0) {
//                returnList.add(MaptHotModelConverter.toMaptHotData(selectByPrimaryKey(model.getId())));
//            }
//        }
//        return new DataResult<List<MaptHotData>>(returnList);
//    }
//
//    @Override
//    public DataResult<MaptHotData> updateMaptHot(MaptHotData MaptHot) {
//        if (MaptHot == null) {
//            return new DataResult<MaptHotData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptHot model = MaptHotModelConverter.toMaptHot(MaptHot);
//        int i = updateByPrimaryKeySelective(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptHotData>(i + "", "update MaptHot fail");
//    }
//
//    @Override
//    public DataResult<Integer> deleteMaptHot(int id) {
//        int i = deleteByPrimaryKey(id);
//        if (i > 0) {
//            return new DataResult<Integer>(i);
//        }
//        return new DataResult<Integer>(i + "", "delete MaptHot fail");
//    }
}
