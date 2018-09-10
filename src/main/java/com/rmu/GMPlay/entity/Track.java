package com.rmu.GMPlay.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Track {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer trackId;

    @Column
    private String trackName;

    @Column
    private String trackDir;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TrackPoint> trackPoints= new LinkedList<>();

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackDir() {
        return trackDir;
    }

    public void setTrackDir(String trackDir) {
        this.trackDir = trackDir;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void setTrackPoints(List<TrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
    }
}
