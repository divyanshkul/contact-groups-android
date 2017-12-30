package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.community.jboss.contactgroups.data.Daos.ContactDao;
import com.community.jboss.contactgroups.data.Daos.ContactGroupDao;
import com.community.jboss.contactgroups.data.Daos.ContactNumberDao;
import com.community.jboss.contactgroups.data.Daos.GroupDao;

/**
 * Created by Divyansh on 29-12-2017.
 */
@TypeConverters(typeConverter.class)
@Database(entities = {
        Contact.class,
        ContactGroup.class,
        ContactNumber.class,
        Group.class,
}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{
    public abstract ContactDao getContactDao();
    public abstract GroupDao getGroupDao();
    public abstract ContactNumberDao getContactNumberDao();
    public abstract ContactGroupDao getContactGroupDao();
}
