package spring.boot.rest.modules.converter;

import org.springframework.beans.BeanUtils;
import spring.boot.rest.modules.domain.MaptInfoData;
import spring.boot.rest.modules.entity.MaptInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 将db层面的model与领域模型domain相互转换
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
public class MaptInfoModelConverter {

    public static MaptInfoData toMaptInfoData(MaptInfo model) {
        if (model == null) {
            return null;
        }
        MaptInfoData data = new MaptInfoData();
        BeanUtils.copyProperties(model, data);
        return data;
    }

    public static List<MaptInfoData> toMaptInfoDataList(List<MaptInfo> list) {
        if (list.isEmpty()) {
            return new ArrayList<MaptInfoData>(0);
        }
        List<MaptInfoData> dataList = new ArrayList<MaptInfoData>(list.size());
        for (MaptInfo model : list) {
            dataList.add(toMaptInfoData(model));
        }
        return dataList;
    }
}
