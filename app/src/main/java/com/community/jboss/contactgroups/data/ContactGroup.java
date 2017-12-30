package com.community.jboss.contactgroups.data;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.community.jboss.contactgroups.data.typeConverter;

import java.util.UUID;

/**
 * Associative entity for a many-to-many relationship
 * between a Contact and a Group
 */
@Entity
public class ContactGroup {
    @PrimaryKey @NonNull
    private Contact contact;
    private Group group;
    private String uid = UUID.randomUUID().toString();

    public ContactGroup() {

    }
    @Ignore
    ContactGroup(Contact contact, Group group) {
        this.contact = contact;
        this.group = group;
    }
    @NonNull
    public void setGroup(Group group){
        this.group = group;
    }
    public void setContact(Contact contact){
        this.contact = contact;
    }
    public Group getGroup() {
        return group;
    }

    public Contact getContact() {
        return contact;
    }
    public void setUid(String uid){
        this.uid = uid;
    }
    public String getUid(){
        return uid;
    }
}
