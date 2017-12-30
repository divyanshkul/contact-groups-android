package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.TypeConverter;

import com.community.jboss.contactgroups.data.Contact;
import com.community.jboss.contactgroups.data.ContactGroup;
import com.community.jboss.contactgroups.data.ContactNumber;
import com.community.jboss.contactgroups.data.Group;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


/**
 * Created by Divyansh on 30-12-2017.
 */

public class typeConverter {
    @TypeConverter
    public static String contactToString(Contact contact){
        return new Gson().toJson(contact);
    }

    @TypeConverter
    public static Contact stringToContact(String string){
        Type type = new TypeToken<Contact>(){}.getType();
        return new Gson().fromJson(string,type);
    }


    @TypeConverter
    public static String groupToString(Group group){

        return new Gson().toJson(group);
    }
    @TypeConverter
    public static Group stringToGroup(String string){
        Type type = new TypeToken<Group>(){}.getType();
        return new Gson().fromJson(string,type);
    }
}
