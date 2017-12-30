package com.community.jboss.contactgroups.data.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.community.jboss.contactgroups.data.Group;

import java.util.List;

/**
 * Created by Divyansh on 30-12-2017.
 */

@Dao
public interface GroupDao {
    @Query("SELECT * FROM `group`")
    List<Group> getGroups();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addGroup(Group... groups);

    @Delete
    void delteGroup(Group... groups);
}
