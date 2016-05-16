package spring.boot.rest.modules.entity;

import javax.persistence.*;

/**
 * Created by Yao on 2016/5/11.
 */
@Table(name = "IC_MAPT_INFO")
public class MaptInfo {
    
    @Id
    @Column(name = "MAPT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maptId;
    @Column(name = "MAPT_NAME")
    private String mapName;
    @Column(name = "MAPT_THUMB_ID")
    private String maptThumbId;
    @Column(name = "MAPT_DESC")
    private String maptDesc;
    @Column(name = "MAPT_DETAILS")
    private String maptDetails;
    @Column(name = "MAPT_TYPE")
    private String maptType;
    @Column(name = "MAPT_TAGS")
    private String maptTags;
    @Column(name = "MAPT_LAYERS")
    private String maptLayers;
    @Column(name = "MAPT_CREATEDATE")
    private String maptCreatedate;
    @Column(name = "MAPT_CREATEBY")
    private String maptCreateby;
    @Column(name = "MAPT_UPDATEDATE")
    private String maptUpdatedate;
    @Column(name = "MAPT_UPDATEBY")
    private String maptUpdateby;
    @Column(name = "IS_PUBLIC")
    private String maptIsPublic;

    public String getMaptIsPublic() {
        return maptIsPublic;
    }

    public void setMaptIsPublic(String maptIsPublic) {
        this.maptIsPublic = maptIsPublic;
    }

    public int getMaptId() {
        return maptId;
    }

    public void setMaptId(int maptId) {
        this.maptId = maptId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMaptThumbId() {
        return maptThumbId;
    }

    public void setMaptThumbId(String maptThumbId) {
        this.maptThumbId = maptThumbId;
    }

    public String getMaptDesc() {
        return maptDesc;
    }

    public void setMaptDesc(String maptDesc) {
        this.maptDesc = maptDesc;
    }

    public String getMaptDetails() {
        return maptDetails;
    }

    public void setMaptDetails(String maptDetails) {
        this.maptDetails = maptDetails;
    }

    public String getMaptType() {
        return maptType;
    }

    public void setMaptType(String maptType) {
        this.maptType = maptType;
    }

    public String getMaptTags() {
        return maptTags;
    }

    public void setMaptTags(String maptTags) {
        this.maptTags = maptTags;
    }

    public String getMaptLayers() {
        return maptLayers;
    }

    public void setMaptLayers(String maptLayers) {
        this.maptLayers = maptLayers;
    }

    public String getMaptCreatedate() {
        return maptCreatedate;
    }

    public void setMaptCreatedate(String maptCreatedate) {
        this.maptCreatedate = maptCreatedate;
    }

    public String getMaptCreateby() {
        return maptCreateby;
    }

    public void setMaptCreateby(String maptCreateby) {
        this.maptCreateby = maptCreateby;
    }

    public String getMaptUpdatedate() {
        return maptUpdatedate;
    }

    public void setMaptUpdatedate(String maptUpdatedate) {
        this.maptUpdatedate = maptUpdatedate;
    }

    public String getMaptUpdateby() {
        return maptUpdateby;
    }

    public void setMaptUpdateby(String maptUpdateby) {
        this.maptUpdateby = maptUpdateby;
    }


    @Override
    public String toString() {
        return "MaptInfoData{" +
                "maptId=" + maptId +
                ", mapName='" + mapName + '\'' +
                ", maptThumbId='" + maptThumbId + '\'' +
                ", maptDesc='" + maptDesc + '\'' +
                ", maptDetails='" + maptDetails + '\'' +
                ", maptType='" + maptType + '\'' +
                ", maptTags='" + maptTags + '\'' +
                ", maptLayers='" + maptLayers + '\'' +
                ", maptCreatedate='" + maptCreatedate + '\'' +
                ", maptCreateby='" + maptCreateby + '\'' +
                ", maptUpdatedate='" + maptUpdatedate + '\'' +
                ", maptUpdateby='" + maptUpdateby + '\'' +
                ", maptIsPublic='" + maptIsPublic + '\'' +
                '}';
    }
}
