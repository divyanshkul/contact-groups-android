package com.community.jboss.contactgroups.data.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.community.jboss.contactgroups.data.Contact;
import com.community.jboss.contactgroups.data.ContactNumber;

import java.util.List;

/**
 * Created by Divyansh on 30-12-2017.
 */
@Dao
public interface ContactNumberDao {

    @Query("SELECT * FROM ContactNumber WHERE number LIKE :number")
    List<ContactNumber> getContactNumberByNumber(String number);

    @Query("SELECT * FROM ContactNumber WHERE uid LIKE :uid")
    List<ContactNumber> getContactNumberByuid(String uid);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addContactNumber(ContactNumber... contactNumbers);

    @Update
    void updateContactNumber(ContactNumber... contactNumbers);

    @Delete
    void deleteContactNumber(ContactNumber... contactNumbers);
}
