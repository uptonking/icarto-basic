package spring.boot.rest.modules.domain;

import javax.validation.constraints.NotNull;

/**
 * 领域模型（面向业务）
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
public class MaptThumbData {

    @NotNull(message = "ID不能为空")
    private int maptThumbId;

    private String maptThumbPath;

    private String maptThumbDesc;

    public int getMaptThumbId() {
        return maptThumbId;
    }

    public void setMaptThumbId(int maptThumbId) {
        this.maptThumbId = maptThumbId;
    }

    public String getMaptThumbPath() {
        return maptThumbPath;
    }

    public void setMaptThumbPath(String maptThumbPath) {
        this.maptThumbPath = maptThumbPath;
    }

    public String getMaptThumbDesc() {
        return maptThumbDesc;
    }

    public void setMaptThumbDesc(String maptThumbDesc) {
        this.maptThumbDesc = maptThumbDesc;
    }


    /**
     * 强烈建议所有domain model都重写toString,方便调试
     *
     * @return
     */
    @Override
    public String toString() {
        return "MaptThumbData{" +
                "maptThumbId=" + maptThumbId +
                ", maptThumbPath='" + maptThumbPath + '\'' +
                ", maptThumbDesc='" + maptThumbDesc + '\'' +
                '}';
    }
}
