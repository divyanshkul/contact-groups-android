package com.community.jboss.contactgroups.data.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;

import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.community.jboss.contactgroups.data.Contact;

import java.util.List;

/**
 * Created by Divyansh on 30-12-2017.
 */
@Dao
public interface ContactDao {

    @Query("SELECT * FROM contact")
    List<Contact> getContacts();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addContact(Contact... contacts);

    @Update
    void updateContact(Contact... contacts);

    @Delete
    void deleteContact(Contact... contacts);
}
