package com.handsome.qhb.bean;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by zhang on 2016/3/26.
 */
public class RandomBonus implements Serializable{
    private User user;
    private float bonus;
    private String time;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public RandomBonus(){

    }

    public RandomBonus(User user, float bonus, String time) {
        this.user = user;
        this.bonus = bonus;
        this.time = time;
    }

    @Override
    public String toString() {
        return "RandomBonus{" +
                "user='" + user + '\'' +
                ", bonus=" + bonus +
                ", time='" + time + '\'' +
                '}';
    }
}
