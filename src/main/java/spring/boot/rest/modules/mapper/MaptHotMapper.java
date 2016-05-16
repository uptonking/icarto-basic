package spring.boot.rest.modules.mapper;


import spring.boot.rest.common.mapper.MyMapper;
import spring.boot.rest.modules.entity.MaptHot;

import java.util.List;

public interface MaptHotMapper extends MyMapper<MaptHot> {

    List<MaptHot> selectAll();
    List<MaptHot> queryHotById();
}