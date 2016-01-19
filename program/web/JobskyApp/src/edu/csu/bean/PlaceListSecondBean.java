package edu.csu.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "PlaceListSecond", schema = "dbo", catalog = "jobskynet8")
public class PlaceListSecondBean {
    private int placeSecondId;
    private String placeName;
    private Timestamp placeTime;

    @Id
    @Column(name = "PlaceSecondID", nullable = false)
    public int getPlaceSecondId() {
        return placeSecondId;
    }

    public void setPlaceSecondId(int placeSecondId) {
        this.placeSecondId = placeSecondId;
    }

    @Basic
    @Column(name = "PlaceName", nullable = true, length = 20)
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Basic
    @Column(name = "PlaceTime", nullable = true)
    public Timestamp getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(Timestamp placeTime) {
        this.placeTime = placeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceListSecondBean that = (PlaceListSecondBean) o;

        if (placeSecondId != that.placeSecondId) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;
        if (placeTime != null ? !placeTime.equals(that.placeTime) : that.placeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placeSecondId;
        result = 31 * result + (placeName != null ? placeName.hashCode() : 0);
        result = 31 * result + (placeTime != null ? placeTime.hashCode() : 0);
        return result;
    }
}
