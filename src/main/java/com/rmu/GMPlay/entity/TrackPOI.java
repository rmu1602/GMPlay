package com.rmu.GMPlay.entity;

import javax.persistence.*;

@Entity
public class TrackPOI {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer trackPoiId;

    @Column(name= "track_poi_name")
    private String poiName;

    @Column(name= "track_poi_desc")
    private String poiDesc;

    @ManyToOne
    private TrackPoint trackPoints;

    public Integer getTrackPoiId() {
        return trackPoiId;
    }

    public void setTrackPoiId(Integer trackPoiId) {
        this.trackPoiId = trackPoiId;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public String getPoiDesc() {
        return poiDesc;
    }

    public void setPoiDesc(String poiDesc) {
        this.poiDesc = poiDesc;
    }

    public TrackPoint getTrackPoints() {
        return trackPoints;
    }

    public void setTrackPoints(TrackPoint trackPoints) {
        this.trackPoints = trackPoints;
    }
}
