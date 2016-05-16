package spring.boot.rest.modules.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.impl.BaseService;
import spring.boot.rest.modules.converter.MaptThumbModelConverter;
import spring.boot.rest.modules.domain.MaptThumbData;
import spring.boot.rest.modules.entity.MaptThumb;
import spring.boot.rest.modules.mapper.MaptThumbMapper;
import spring.boot.rest.modules.service.MaptThumbService;

import java.util.List;

/**
 * {type your description }
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@Service("MaptThumbService")
@Transactional(rollbackFor = Exception.class)
public class MaptThumbServiceImpl extends BaseService<MaptThumb> implements MaptThumbService {


    @Override
    public DataResult<List<MaptThumbData>> getAllMaptThumb() {
        return new DataResult<List<MaptThumbData>>(MaptThumbModelConverter.toMaptThumbDataList(((MaptThumbMapper) mapper).selectAll()));
    }

    @Override
    public DataResult<MaptThumbData> get(int id) {
        return new DataResult<MaptThumbData>(MaptThumbModelConverter.toMaptThumbData(selectByPrimaryKey(id)));
    }
//
//    @Override
//    public DataResult<MaptThumbData> addMaptThumb(MaptThumbData MaptThumb) {
//        if (MaptThumb == null) {
//            return new DataResult<MaptThumbData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptThumb model = MaptThumbModelConverter.toMaptThumb(MaptThumb);
//        int i = insertUseGeneratedKeys(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptThumbData>(i + "", "add MaptThumb fail");
//    }
//
//    @Override
//    public DataResult<List<MaptThumbData>> addMaptThumbs(List<MaptThumbData> MaptThumbs) {
//        if (MaptThumbs.isEmpty()) {
//            return new DataResult<List<MaptThumbData>>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        List<MaptThumbData> returnList = new ArrayList<MaptThumbData>(MaptThumbs.size());
//        for (MaptThumbData data : MaptThumbs) {
//            MaptThumb model = MaptThumbModelConverter.toMaptThumb(data);
//            int i = insertUseGeneratedKeys(model);
//            if (i > 0) {
//                returnList.add(MaptThumbModelConverter.toMaptThumbData(selectByPrimaryKey(model.getId())));
//            }
//        }
//        return new DataResult<List<MaptThumbData>>(returnList);
//    }
//
//    @Override
//    public DataResult<MaptThumbData> updateMaptThumb(MaptThumbData MaptThumb) {
//        if (MaptThumb == null) {
//            return new DataResult<MaptThumbData>(RestConst.ErrorCode.EMPTY_PARAM, "param is empty");
//        }
//        MaptThumb model = MaptThumbModelConverter.toMaptThumb(MaptThumb);
//        int i = updateByPrimaryKeySelective(model);
//        if (i > 0) {
//            return get(model.getId());
//        }
//        return new DataResult<MaptThumbData>(i + "", "update MaptThumb fail");
//    }
//
//    @Override
//    public DataResult<Integer> deleteMaptThumb(int id) {
//        int i = deleteByPrimaryKey(id);
//        if (i > 0) {
//            return new DataResult<Integer>(i);
//        }
//        return new DataResult<Integer>(i + "", "delete MaptThumb fail");
//    }
}
