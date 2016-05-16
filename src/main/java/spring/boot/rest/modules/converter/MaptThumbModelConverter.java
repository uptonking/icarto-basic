package spring.boot.rest.modules.converter;

import org.springframework.beans.BeanUtils;
import spring.boot.rest.modules.domain.MaptThumbData;
import spring.boot.rest.modules.entity.MaptThumb;

import java.util.ArrayList;
import java.util.List;

/**
 * 将db层面的model与领域模型domain相互转换
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
public class MaptThumbModelConverter {

    public static MaptThumbData toMaptThumbData(MaptThumb model) {
        if (model == null) {
            return null;
        }
        MaptThumbData data = new MaptThumbData();
        BeanUtils.copyProperties(model, data);
        return data;
    }

    public static List<MaptThumbData> toMaptThumbDataList(List<MaptThumb> list) {
        if (list.isEmpty()) {
            return new ArrayList<MaptThumbData>(0);
        }
        List<MaptThumbData> dataList = new ArrayList<MaptThumbData>(list.size());
        for (MaptThumb model : list) {
            dataList.add(toMaptThumbData(model));
        }
        return dataList;
    }
}
