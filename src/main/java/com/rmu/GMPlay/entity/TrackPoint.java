package com.rmu.GMPlay.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
public class TrackPoint {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer trackPointId;

    @ManyToOne
    private Track track;

    @Column(name = "track_point_lat")
    private float latitude;

    @Column(name = "track_point_long")
    private float longitude;

    @Column(name = "track_point_elev")
    private float elevation;

    @Column(name = "track_point_time")
    private ZonedDateTime time;

    @Column(name = "track_point_speed")
    private float speed;

    @Column(name = "track_point_has_poi")
    private boolean hasPoi;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TrackPOI> trackPOIs= new LinkedList<>();

    public Integer getTrackPointId() {
        return trackPointId;
    }

    public void setTrackPointId(Integer trackPointId) {
        this.trackPointId = trackPointId;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getElevation() {
        return elevation;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isHasPoi() {
        return hasPoi;
    }

    public void setHasPoi(boolean hasPoi) {
        this.hasPoi = hasPoi;
    }

    public List<TrackPOI> getTrackPOIs() {
        return trackPOIs;
    }

    public void setTrackPOIs(List<TrackPOI> trackPOIs) {
        this.trackPOIs = trackPOIs;
    }
}
