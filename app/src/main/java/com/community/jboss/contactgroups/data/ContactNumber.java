package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.community.jboss.contactgroups.data.typeConverter;


import java.util.UUID;

@Entity
public class ContactNumber{
    @PrimaryKey @NonNull
    private String uid = UUID.randomUUID().toString();
    private int number;
    private Contact contact;

    public ContactNumber() {

    }


    private ContactNumber(int number, Contact contact, String  uid) {
        this.number = number;
        this.contact = contact;
        this.uid = uid;
    }

    @NonNull
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public void setUid(String uid){
        this.uid = uid;
    }
    public String getUid(){
        return uid;
    }
}
