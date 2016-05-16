package spring.boot.rest.modules.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Yao on 2016/5/11.
 */
@Table(name = "IC_MAPT_HOT")
public class MaptHotData {
    @NotNull(message = "ID不能为空")
    private int mhotRowId;
    private String maptId;
    private String totalVisits;
    private String totalUses;
    private String statsTime;

    public int getMhotRowId() {
        return mhotRowId;
    }

    public void setMhotRowId(int mhotRowId) {
        this.mhotRowId = mhotRowId;
    }

    public String getMaptId() {
        return maptId;
    }

    public void setMaptId(String maptId) {
        this.maptId = maptId;
    }

    public String getTotalVisits() {
        return totalVisits;
    }

    public void setTotalVisits(String totalVisits) {
        this.totalVisits = totalVisits;
    }

    public String getTotalUses() {
        return totalUses;
    }

    public void setTotalUses(String totalUses) {
        this.totalUses = totalUses;
    }

    public String getStatsTime() {
        return statsTime;
    }

    public void setStatsTime(String statsTime) {
        this.statsTime = statsTime;
    }

    @Override
    public String toString() {
        return "MaptHotData{" +
                "mhotRowId=" + mhotRowId +
                ", maptId='" + maptId + '\'' +
                ", totalVisits='" + totalVisits + '\'' +
                ", totalUses='" + totalUses + '\'' +
                ", statsTime='" + statsTime + '\'' +
                '}';
    }
}
