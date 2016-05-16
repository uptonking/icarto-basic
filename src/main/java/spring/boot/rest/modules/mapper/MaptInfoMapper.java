package spring.boot.rest.modules.mapper;


import spring.boot.rest.common.mapper.MyMapper;
import spring.boot.rest.modules.entity.MaptInfo;

import java.util.List;

public interface MaptInfoMapper extends MyMapper<MaptInfo> {

    List<MaptInfo> selectAll();

    List<MaptInfo> queryMaptInfoById();

    List<MaptInfo> queryMaptInfoByType(String strAttr);

    List<MaptInfo> queryLatestMaptInfo();
}