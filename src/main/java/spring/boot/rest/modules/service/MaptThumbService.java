package spring.boot.rest.modules.service;

import org.springframework.stereotype.Service;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.service.IService;
import spring.boot.rest.modules.domain.MaptThumbData;
import spring.boot.rest.modules.entity.MaptThumb;

import java.util.List;

@Service
public interface MaptThumbService extends IService<MaptThumb> {

    DataResult<List<MaptThumbData>> getAllMaptThumb();

    DataResult<MaptThumbData> get(int id);


//
//    DataResult<MaptThumbData> addMaptThumb(MaptThumbData MaptThumb);
//
//    DataResult<List<MaptThumbData>> addMaptThumbs(List<MaptThumbData> MaptThumbs);
//
//    DataResult<MaptThumbData> updateMaptThumb(MaptThumbData MaptThumb);
//
//    DataResult<Integer> deleteMaptThumb(int MaptThumbId);

}
