package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

@Entity
public class Group {
    @PrimaryKey @NonNull
    private String uid = UUID.randomUUID().toString();
    private String name;

    public Group() {

    }
    @Ignore
    public Group(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    @NonNull
    public void setName(String name){
        this.name = name;
    }
    public void setUid(String uid){
        this.uid = uid;
    }
    public String getName(){
        return name;
    }
    public String getUid(){
        return uid;
    }
}
