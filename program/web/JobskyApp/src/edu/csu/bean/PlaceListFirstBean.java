package edu.csu.bean;

import javax.persistence.*;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "PlaceListFirst", schema = "dbo", catalog = "jobskynet8")
public class PlaceListFirstBean {
    private int placeFirstId;
    private String placeName;

    @Id
    @Column(name = "PlaceFirstID", nullable = false)
    public int getPlaceFirstId() {
        return placeFirstId;
    }

    public void setPlaceFirstId(int placeFirstId) {
        this.placeFirstId = placeFirstId;
    }

    @Basic
    @Column(name = "PlaceName", nullable = true, length = 20)
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceListFirstBean that = (PlaceListFirstBean) o;

        if (placeFirstId != that.placeFirstId) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placeFirstId;
        result = 31 * result + (placeName != null ? placeName.hashCode() : 0);
        return result;
    }
}
