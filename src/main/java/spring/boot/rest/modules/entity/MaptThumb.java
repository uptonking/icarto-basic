package spring.boot.rest.modules.entity;

import javax.persistence.*;

/**
 * Created by Yao on 2016/5/11.
 */
@Table(name = "IC_THUMBNAIL_MAPT")
public class MaptThumb {
    
    @Id
    @Column(name = "MAPT_THUMB_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maptThumbId;

    @Column(name = "MAPT_THUMB_PATH")
    private String maptThumbPath;

    @Column(name = "MAPT_THUMB_DESC")

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

    @Override
    public String toString() {
        return "MaptThumbData{" +
                "maptThumbId=" + maptThumbId +
                ", maptThumbPath='" + maptThumbPath + '\'' +
                ", maptThumbDesc='" + maptThumbDesc + '\'' +
                '}';
    }
}
