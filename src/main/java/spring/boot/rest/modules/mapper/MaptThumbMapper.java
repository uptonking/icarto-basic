package spring.boot.rest.modules.mapper;


import spring.boot.rest.common.mapper.MyMapper;
import spring.boot.rest.modules.entity.MaptThumb;

import java.util.List;

public interface MaptThumbMapper extends MyMapper<MaptThumb> {

    List<MaptThumb> selectAll();
    List<MaptThumb> queryThumbById();
}