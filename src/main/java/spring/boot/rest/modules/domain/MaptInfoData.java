package spring.boot.rest.modules.domain;

import javax.validation.constraints.NotNull;

/**
 * Created by Yao on 2016/5/11.
 */
public class MaptInfoData {


    private String mapName;
    private String maptThumbId;
    private String maptDesc;
    private String maptDetails;
    private String maptType;
    private String maptTags;
    private String maptLayers;
    private String maptCreatedate;
    private String maptCreateby;
    private String maptUpdatedate;
    private String maptUpdateby;
    private String maptIsPublic;

    @NotNull(message = "ID不能为空")
    private int maptId;

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

    public String getMaptIsPublic() {
        return maptIsPublic;
    }

    public void setMaptIsPublic(String maptIsPublic) {
        this.maptIsPublic = maptIsPublic;
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
