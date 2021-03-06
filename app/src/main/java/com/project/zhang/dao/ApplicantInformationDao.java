package com.project.zhang.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.project.zhang.entity.ApplicantInformation;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "APPLICANT_INFORMATION".
*/
public class ApplicantInformationDao extends AbstractDao<ApplicantInformation, Long> {

    public static final String TABLENAME = "APPLICANT_INFORMATION";

    /**
     * Properties of entity ApplicantInformation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Iid = new Property(1, String.class, "iid", false, "IID");
        public final static Property User_iid = new Property(2, String.class, "user_iid", false, "USER_IID");
        public final static Property Ensure_number = new Property(3, String.class, "ensure_number", false, "ENSURE_NUMBER");
        public final static Property Household_register_address = new Property(4, String.class, "household_register_address", false, "HOUSEHOLD_REGISTER_ADDRESS");
        public final static Property Live_address = new Property(5, String.class, "live_address", false, "LIVE_ADDRESS");
        public final static Property Reviewe_result = new Property(6, String.class, "reviewe_result", false, "REVIEWE_RESULT");
    }


    public ApplicantInformationDao(DaoConfig config) {
        super(config);
    }
    
    public ApplicantInformationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"APPLICANT_INFORMATION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"IID\" TEXT," + // 1: iid
                "\"USER_IID\" TEXT," + // 2: user_iid
                "\"ENSURE_NUMBER\" TEXT," + // 3: ensure_number
                "\"HOUSEHOLD_REGISTER_ADDRESS\" TEXT," + // 4: household_register_address
                "\"LIVE_ADDRESS\" TEXT," + // 5: live_address
                "\"REVIEWE_RESULT\" TEXT);"); // 6: reviewe_result
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"APPLICANT_INFORMATION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ApplicantInformation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String iid = entity.getIid();
        if (iid != null) {
            stmt.bindString(2, iid);
        }
 
        String user_iid = entity.getUser_iid();
        if (user_iid != null) {
            stmt.bindString(3, user_iid);
        }
 
        String ensure_number = entity.getEnsure_number();
        if (ensure_number != null) {
            stmt.bindString(4, ensure_number);
        }
 
        String household_register_address = entity.getHousehold_register_address();
        if (household_register_address != null) {
            stmt.bindString(5, household_register_address);
        }
 
        String live_address = entity.getLive_address();
        if (live_address != null) {
            stmt.bindString(6, live_address);
        }
 
        String reviewe_result = entity.getReviewe_result();
        if (reviewe_result != null) {
            stmt.bindString(7, reviewe_result);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ApplicantInformation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String iid = entity.getIid();
        if (iid != null) {
            stmt.bindString(2, iid);
        }
 
        String user_iid = entity.getUser_iid();
        if (user_iid != null) {
            stmt.bindString(3, user_iid);
        }
 
        String ensure_number = entity.getEnsure_number();
        if (ensure_number != null) {
            stmt.bindString(4, ensure_number);
        }
 
        String household_register_address = entity.getHousehold_register_address();
        if (household_register_address != null) {
            stmt.bindString(5, household_register_address);
        }
 
        String live_address = entity.getLive_address();
        if (live_address != null) {
            stmt.bindString(6, live_address);
        }
 
        String reviewe_result = entity.getReviewe_result();
        if (reviewe_result != null) {
            stmt.bindString(7, reviewe_result);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ApplicantInformation readEntity(Cursor cursor, int offset) {
        ApplicantInformation entity = new ApplicantInformation( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // iid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // user_iid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ensure_number
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // household_register_address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // live_address
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // reviewe_result
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ApplicantInformation entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUser_iid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEnsure_number(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setHousehold_register_address(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLive_address(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setReviewe_result(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ApplicantInformation entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ApplicantInformation entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ApplicantInformation entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
