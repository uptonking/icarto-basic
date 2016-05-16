package spring.boot.rest.modules.entity;

import javax.persistence.*;

/**
 * Created by Yao on 2016/5/11.
 */
@Table(name = "IC_MAPT_HOT")
public class MaptHot {
    
    @Id
    @Column(name = "MHOT_ROWID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mhotRowId;
    @Column(name = "MAPT_ID")
    private String maptId;
    @Column(name = "TOTAL_VISITS")
    private String totalVisits;
    @Column(name = "TOTAL_USES")
    private String totalUses;
    @Column(name = "STATS_TIME")
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
