package spring.boot.rest.modules.converter;

import org.springframework.beans.BeanUtils;
import spring.boot.rest.modules.domain.MaptHotData;
import spring.boot.rest.modules.entity.MaptHot;

import java.util.ArrayList;
import java.util.List;

/**
 * 将db层面的model与领域模型domain相互转换
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
public class MaptHotModelConverter {

    public static MaptHotData toMaptHotData(MaptHot model) {
        if (model == null) {
            return null;
        }
        MaptHotData data = new MaptHotData();
        BeanUtils.copyProperties(model, data);
        return data;
    }

    public static List<MaptHotData> toMaptHotDataList(List<MaptHot> list) {
        if (list.isEmpty()) {
            return new ArrayList<MaptHotData>(0);
        }
        List<MaptHotData> dataList = new ArrayList<MaptHotData>(list.size());
        for (MaptHot model : list) {
            dataList.add(toMaptHotData(model));
        }
        return dataList;
    }
}
