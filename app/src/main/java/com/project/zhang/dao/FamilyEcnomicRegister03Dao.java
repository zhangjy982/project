package com.project.zhang.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.project.zhang.entity.FamilyEcnomicRegister03;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FAMILY_ECNOMIC_REGISTER03".
*/
public class FamilyEcnomicRegister03Dao extends AbstractDao<FamilyEcnomicRegister03, Long> {

    public static final String TABLENAME = "FAMILY_ECNOMIC_REGISTER03";

    /**
     * Properties of entity FamilyEcnomicRegister03.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Iid = new Property(1, String.class, "iid", false, "IID");
        public final static Property Applicant_iid = new Property(2, String.class, "applicant_iid", false, "APPLICANT_IID");
        public final static Property Family_cost_1 = new Property(3, String.class, "family_cost_1", false, "FAMILY_COST_1");
        public final static Property Family_cost_2 = new Property(4, String.class, "family_cost_2", false, "FAMILY_COST_2");
        public final static Property Family_cost_3 = new Property(5, String.class, "family_cost_3", false, "FAMILY_COST_3");
        public final static Property Family_cost_4 = new Property(6, String.class, "family_cost_4", false, "FAMILY_COST_4");
        public final static Property Family_cost_5 = new Property(7, String.class, "family_cost_5", false, "FAMILY_COST_5");
        public final static Property Family_cost_6 = new Property(8, String.class, "family_cost_6", false, "FAMILY_COST_6");
    }


    public FamilyEcnomicRegister03Dao(DaoConfig config) {
        super(config);
    }
    
    public FamilyEcnomicRegister03Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FAMILY_ECNOMIC_REGISTER03\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"IID\" TEXT," + // 1: iid
                "\"APPLICANT_IID\" TEXT," + // 2: applicant_iid
                "\"FAMILY_COST_1\" TEXT," + // 3: family_cost_1
                "\"FAMILY_COST_2\" TEXT," + // 4: family_cost_2
                "\"FAMILY_COST_3\" TEXT," + // 5: family_cost_3
                "\"FAMILY_COST_4\" TEXT," + // 6: family_cost_4
                "\"FAMILY_COST_5\" TEXT," + // 7: family_cost_5
                "\"FAMILY_COST_6\" TEXT);"); // 8: family_cost_6
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FAMILY_ECNOMIC_REGISTER03\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FamilyEcnomicRegister03 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String iid = entity.getIid();
        if (iid != null) {
            stmt.bindString(2, iid);
        }
 
        String applicant_iid = entity.getApplicant_iid();
        if (applicant_iid != null) {
            stmt.bindString(3, applicant_iid);
        }
 
        String family_cost_1 = entity.getFamily_cost_1();
        if (family_cost_1 != null) {
            stmt.bindString(4, family_cost_1);
        }
 
        String family_cost_2 = entity.getFamily_cost_2();
        if (family_cost_2 != null) {
            stmt.bindString(5, family_cost_2);
        }
 
        String family_cost_3 = entity.getFamily_cost_3();
        if (family_cost_3 != null) {
            stmt.bindString(6, family_cost_3);
        }
 
        String family_cost_4 = entity.getFamily_cost_4();
        if (family_cost_4 != null) {
            stmt.bindString(7, family_cost_4);
        }
 
        String family_cost_5 = entity.getFamily_cost_5();
        if (family_cost_5 != null) {
            stmt.bindString(8, family_cost_5);
        }
 
        String family_cost_6 = entity.getFamily_cost_6();
        if (family_cost_6 != null) {
            stmt.bindString(9, family_cost_6);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FamilyEcnomicRegister03 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String iid = entity.getIid();
        if (iid != null) {
            stmt.bindString(2, iid);
        }
 
        String applicant_iid = entity.getApplicant_iid();
        if (applicant_iid != null) {
            stmt.bindString(3, applicant_iid);
        }
 
        String family_cost_1 = entity.getFamily_cost_1();
        if (family_cost_1 != null) {
            stmt.bindString(4, family_cost_1);
        }
 
        String family_cost_2 = entity.getFamily_cost_2();
        if (family_cost_2 != null) {
            stmt.bindString(5, family_cost_2);
        }
 
        String family_cost_3 = entity.getFamily_cost_3();
        if (family_cost_3 != null) {
            stmt.bindString(6, family_cost_3);
        }
 
        String family_cost_4 = entity.getFamily_cost_4();
        if (family_cost_4 != null) {
            stmt.bindString(7, family_cost_4);
        }
 
        String family_cost_5 = entity.getFamily_cost_5();
        if (family_cost_5 != null) {
            stmt.bindString(8, family_cost_5);
        }
 
        String family_cost_6 = entity.getFamily_cost_6();
        if (family_cost_6 != null) {
            stmt.bindString(9, family_cost_6);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FamilyEcnomicRegister03 readEntity(Cursor cursor, int offset) {
        FamilyEcnomicRegister03 entity = new FamilyEcnomicRegister03( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // iid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // applicant_iid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // family_cost_1
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // family_cost_2
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // family_cost_3
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // family_cost_4
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // family_cost_5
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // family_cost_6
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FamilyEcnomicRegister03 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setApplicant_iid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFamily_cost_1(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFamily_cost_2(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFamily_cost_3(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFamily_cost_4(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFamily_cost_5(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFamily_cost_6(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FamilyEcnomicRegister03 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FamilyEcnomicRegister03 entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FamilyEcnomicRegister03 entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}