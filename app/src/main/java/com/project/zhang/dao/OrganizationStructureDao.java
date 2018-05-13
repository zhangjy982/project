package com.project.zhang.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.project.zhang.entity.OrganizationStructure;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ORGANIZATION_STRUCTURE".
*/
public class OrganizationStructureDao extends AbstractDao<OrganizationStructure, Long> {

    public static final String TABLENAME = "ORGANIZATION_STRUCTURE";

    /**
     * Properties of entity OrganizationStructure.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Leader_id = new Property(0, Long.class, "leader_id", true, "_id");
        public final static Property Leader_name = new Property(1, String.class, "leader_name", false, "LEADER_NAME");
        public final static Property Leader_duty = new Property(2, String.class, "leader_duty", false, "LEADER_DUTY");
        public final static Property Leader_work = new Property(3, String.class, "leader_work", false, "LEADER_WORK");
        public final static Property Leader_img = new Property(4, String.class, "leader_img", false, "LEADER_IMG");
        public final static Property Employee_name = new Property(5, String.class, "employee_name", false, "EMPLOYEE_NAME");
        public final static Property Employee_duty = new Property(6, String.class, "employee_duty", false, "EMPLOYEE_DUTY");
        public final static Property Employee_unit = new Property(7, String.class, "employee_unit", false, "EMPLOYEE_UNIT");
    }


    public OrganizationStructureDao(DaoConfig config) {
        super(config);
    }
    
    public OrganizationStructureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ORGANIZATION_STRUCTURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: leader_id
                "\"LEADER_NAME\" TEXT," + // 1: leader_name
                "\"LEADER_DUTY\" TEXT," + // 2: leader_duty
                "\"LEADER_WORK\" TEXT," + // 3: leader_work
                "\"LEADER_IMG\" TEXT," + // 4: leader_img
                "\"EMPLOYEE_NAME\" TEXT," + // 5: employee_name
                "\"EMPLOYEE_DUTY\" TEXT," + // 6: employee_duty
                "\"EMPLOYEE_UNIT\" TEXT);"); // 7: employee_unit
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ORGANIZATION_STRUCTURE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, OrganizationStructure entity) {
        stmt.clearBindings();
 
        Long leader_id = entity.getLeader_id();
        if (leader_id != null) {
            stmt.bindLong(1, leader_id);
        }
 
        String leader_name = entity.getLeader_name();
        if (leader_name != null) {
            stmt.bindString(2, leader_name);
        }
 
        String leader_duty = entity.getLeader_duty();
        if (leader_duty != null) {
            stmt.bindString(3, leader_duty);
        }
 
        String leader_work = entity.getLeader_work();
        if (leader_work != null) {
            stmt.bindString(4, leader_work);
        }
 
        String leader_img = entity.getLeader_img();
        if (leader_img != null) {
            stmt.bindString(5, leader_img);
        }
 
        String employee_name = entity.getEmployee_name();
        if (employee_name != null) {
            stmt.bindString(6, employee_name);
        }
 
        String employee_duty = entity.getEmployee_duty();
        if (employee_duty != null) {
            stmt.bindString(7, employee_duty);
        }
 
        String employee_unit = entity.getEmployee_unit();
        if (employee_unit != null) {
            stmt.bindString(8, employee_unit);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, OrganizationStructure entity) {
        stmt.clearBindings();
 
        Long leader_id = entity.getLeader_id();
        if (leader_id != null) {
            stmt.bindLong(1, leader_id);
        }
 
        String leader_name = entity.getLeader_name();
        if (leader_name != null) {
            stmt.bindString(2, leader_name);
        }
 
        String leader_duty = entity.getLeader_duty();
        if (leader_duty != null) {
            stmt.bindString(3, leader_duty);
        }
 
        String leader_work = entity.getLeader_work();
        if (leader_work != null) {
            stmt.bindString(4, leader_work);
        }
 
        String leader_img = entity.getLeader_img();
        if (leader_img != null) {
            stmt.bindString(5, leader_img);
        }
 
        String employee_name = entity.getEmployee_name();
        if (employee_name != null) {
            stmt.bindString(6, employee_name);
        }
 
        String employee_duty = entity.getEmployee_duty();
        if (employee_duty != null) {
            stmt.bindString(7, employee_duty);
        }
 
        String employee_unit = entity.getEmployee_unit();
        if (employee_unit != null) {
            stmt.bindString(8, employee_unit);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public OrganizationStructure readEntity(Cursor cursor, int offset) {
        OrganizationStructure entity = new OrganizationStructure( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // leader_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // leader_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // leader_duty
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // leader_work
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // leader_img
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // employee_name
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // employee_duty
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // employee_unit
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, OrganizationStructure entity, int offset) {
        entity.setLeader_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLeader_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLeader_duty(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLeader_work(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLeader_img(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setEmployee_name(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEmployee_duty(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setEmployee_unit(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(OrganizationStructure entity, long rowId) {
        entity.setLeader_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(OrganizationStructure entity) {
        if(entity != null) {
            return entity.getLeader_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(OrganizationStructure entity) {
        return entity.getLeader_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
