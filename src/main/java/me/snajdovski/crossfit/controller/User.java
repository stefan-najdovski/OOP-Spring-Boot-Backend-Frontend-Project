package me.snajdovski.crossfit.controller;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalTime;


@Entity
@Table(name = "user_table")
public class User {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;


    private String name;
    private Boolean isSubscribed;
    private Date subscriptionDate;
    private LocalTime subscriptionLocalTime;
    private LocalTime preferredWorkoutLocalTime;
    private String ipAddr;
    private AttendanceStatus attendanceStatus;


    public User(Long id, String name, Boolean isSubscribed, Date subscriptionDate, LocalTime subscriptionLocalTime, LocalTime preferredWorkoutLocalTime, String ipAddr, AttendanceStatus attendanceStatus) {
        this.id = id;
        this.name = name;
        this.isSubscribed = isSubscribed;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionLocalTime = subscriptionLocalTime;
        this.preferredWorkoutLocalTime = preferredWorkoutLocalTime;
        this.ipAddr = ipAddr;
        this.attendanceStatus = attendanceStatus;
    }

    public User(String name, Boolean isSubscribed, Date subscriptionDate, LocalTime subscriptionLocalTime, LocalTime preferredWorkoutLocalTime, String ipAddr, AttendanceStatus attendanceStatus) {
        this.name = name;
        this.isSubscribed = isSubscribed;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionLocalTime = subscriptionLocalTime;
        this.preferredWorkoutLocalTime = preferredWorkoutLocalTime;
        this.ipAddr = ipAddr;
        this.attendanceStatus = attendanceStatus;
    }
    public User(String name, Boolean isSubscribed, String subscriptionDate, String subscriptionLocalTime, String preferredWorkoutLocalTime, String ipAddr, AttendanceStatus attendanceStatus) {
        this.name = name;
        this.isSubscribed = isSubscribed;
        this.subscriptionDate = Date.valueOf(subscriptionDate);
        this.subscriptionLocalTime = LocalTime.parse(subscriptionLocalTime);
        this.preferredWorkoutLocalTime = LocalTime.parse(preferredWorkoutLocalTime);
        this.ipAddr = ipAddr;
        this.attendanceStatus = attendanceStatus;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getSubscribed() {
        return isSubscribed;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public LocalTime getPreferredWorkoutLocalTime() {
        return preferredWorkoutLocalTime;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscribed(Boolean subscribed) {
        isSubscribed = subscribed;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public void setPreferredWorkoutLocalTime(LocalTime preferredWorkoutLocalTime) {
        this.preferredWorkoutLocalTime = preferredWorkoutLocalTime;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public LocalTime getSubscriptionLocalTime() {
        return subscriptionLocalTime;
    }

    public void setSubscriptionLocalTime(LocalTime subscriptionLocalTime) {
        this.subscriptionLocalTime = subscriptionLocalTime;
    }

    public AttendanceStatus getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(AttendanceStatus attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
