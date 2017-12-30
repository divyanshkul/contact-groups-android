package com.community.jboss.contactgroups.data.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.community.jboss.contactgroups.data.ContactGroup;

import java.util.List;

/**
 * Created by Divyansh on 30-12-2017.
 */
@Dao
public interface ContactGroupDao {
    @Query("SELECT * FROM contactgroup")
    List<ContactGroup> getContactGroups();


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertContactGroup(ContactGroup... contactGroups);

    @Update
    void updateContactGroup(ContactGroup... contactGroups);
}
