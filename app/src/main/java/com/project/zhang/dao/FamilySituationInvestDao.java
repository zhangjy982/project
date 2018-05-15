package com.project.zhang.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.project.zhang.entity.FamilySituationInvest;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FAMILY_SITUATION_INVEST".
*/
public class FamilySituationInvestDao extends AbstractDao<FamilySituationInvest, Long> {

    public static final String TABLENAME = "FAMILY_SITUATION_INVEST";

    /**
     * Properties of entity FamilySituationInvestDaoOpe.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Iid = new Property(1, String.class, "iid", false, "IID");
        public final static Property Applicant_iid = new Property(2, String.class, "applicant_iid", false, "APPLICANT_IID");
        public final static Property Family1_iid = new Property(3, String.class, "family1_iid", false, "FAMILY1_IID");
        public final static Property Family2_iid = new Property(4, String.class, "family2_iid", false, "FAMILY2_IID");
        public final static Property Decorate_situation = new Property(5, String.class, "decorate_situation", false, "DECORATE_SITUATION");
        public final static Property Home_appliances = new Property(6, String.class, "home_appliances", false, "HOME_APPLIANCES");
        public final static Property Water_money_month = new Property(7, String.class, "water_money_month", false, "WATER_MONEY_MONTH");
        public final static Property Phone_money_month = new Property(8, String.class, "phone_money_month", false, "PHONE_MONEY_MONTH");
        public final static Property Unlive_need = new Property(9, String.class, "unlive_need", false, "UNLIVE_NEED");
        public final static Property Children_study_situation = new Property(10, String.class, "children_study_situation", false, "CHILDREN_STUDY_SITUATION");
        public final static Property Valuables = new Property(11, String.class, "valuables", false, "VALUABLES");
        public final static Property Other_bad_situation = new Property(12, String.class, "other_bad_situation", false, "OTHER_BAD_SITUATION");
        public final static Property Hard_mix_situation = new Property(13, String.class, "hard_mix_situation", false, "HARD_MIX_SITUATION");
        public final static Property Whether_same = new Property(14, String.class, "whether_same", false, "WHETHER_SAME");
        public final static Property Applicant_opinion = new Property(15, String.class, "applicant_opinion", false, "APPLICANT_OPINION");
    }


    public FamilySituationInvestDao(DaoConfig config) {
        super(config);
    }
    
    public FamilySituationInvestDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FAMILY_SITUATION_INVEST\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"IID\" TEXT," + // 1: iid
                "\"APPLICANT_IID\" TEXT," + // 2: applicant_iid
                "\"FAMILY1_IID\" TEXT," + // 3: family1_iid
                "\"FAMILY2_IID\" TEXT," + // 4: family2_iid
                "\"DECORATE_SITUATION\" TEXT," + // 5: decorate_situation
                "\"HOME_APPLIANCES\" TEXT," + // 6: home_appliances
                "\"WATER_MONEY_MONTH\" TEXT," + // 7: water_money_month
                "\"PHONE_MONEY_MONTH\" TEXT," + // 8: phone_money_month
                "\"UNLIVE_NEED\" TEXT," + // 9: unlive_need
                "\"CHILDREN_STUDY_SITUATION\" TEXT," + // 10: children_study_situation
                "\"VALUABLES\" TEXT," + // 11: valuables
                "\"OTHER_BAD_SITUATION\" TEXT," + // 12: other_bad_situation
                "\"HARD_MIX_SITUATION\" TEXT," + // 13: hard_mix_situation
                "\"WHETHER_SAME\" TEXT," + // 14: whether_same
                "\"APPLICANT_OPINION\" TEXT);"); // 15: applicant_opinion
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FAMILY_SITUATION_INVEST\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FamilySituationInvest entity) {
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
 
        String family1_iid = entity.getFamily1_iid();
        if (family1_iid != null) {
            stmt.bindString(4, family1_iid);
        }
 
        String family2_iid = entity.getFamily2_iid();
        if (family2_iid != null) {
            stmt.bindString(5, family2_iid);
        }
 
        String decorate_situation = entity.getDecorate_situation();
        if (decorate_situation != null) {
            stmt.bindString(6, decorate_situation);
        }
 
        String home_appliances = entity.getHome_appliances();
        if (home_appliances != null) {
            stmt.bindString(7, home_appliances);
        }
 
        String water_money_month = entity.getWater_money_month();
        if (water_money_month != null) {
            stmt.bindString(8, water_money_month);
        }
 
        String phone_money_month = entity.getPhone_money_month();
        if (phone_money_month != null) {
            stmt.bindString(9, phone_money_month);
        }
 
        String unlive_need = entity.getUnlive_need();
        if (unlive_need != null) {
            stmt.bindString(10, unlive_need);
        }
 
        String children_study_situation = entity.getChildren_study_situation();
        if (children_study_situation != null) {
            stmt.bindString(11, children_study_situation);
        }
 
        String valuables = entity.getValuables();
        if (valuables != null) {
            stmt.bindString(12, valuables);
        }
 
        String other_bad_situation = entity.getOther_bad_situation();
        if (other_bad_situation != null) {
            stmt.bindString(13, other_bad_situation);
        }
 
        String hard_mix_situation = entity.getHard_mix_situation();
        if (hard_mix_situation != null) {
            stmt.bindString(14, hard_mix_situation);
        }
 
        String whether_same = entity.getWhether_same();
        if (whether_same != null) {
            stmt.bindString(15, whether_same);
        }
 
        String applicant_opinion = entity.getApplicant_opinion();
        if (applicant_opinion != null) {
            stmt.bindString(16, applicant_opinion);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FamilySituationInvest entity) {
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
 
        String family1_iid = entity.getFamily1_iid();
        if (family1_iid != null) {
            stmt.bindString(4, family1_iid);
        }
 
        String family2_iid = entity.getFamily2_iid();
        if (family2_iid != null) {
            stmt.bindString(5, family2_iid);
        }
 
        String decorate_situation = entity.getDecorate_situation();
        if (decorate_situation != null) {
            stmt.bindString(6, decorate_situation);
        }
 
        String home_appliances = entity.getHome_appliances();
        if (home_appliances != null) {
            stmt.bindString(7, home_appliances);
        }
 
        String water_money_month = entity.getWater_money_month();
        if (water_money_month != null) {
            stmt.bindString(8, water_money_month);
        }
 
        String phone_money_month = entity.getPhone_money_month();
        if (phone_money_month != null) {
            stmt.bindString(9, phone_money_month);
        }
 
        String unlive_need = entity.getUnlive_need();
        if (unlive_need != null) {
            stmt.bindString(10, unlive_need);
        }
 
        String children_study_situation = entity.getChildren_study_situation();
        if (children_study_situation != null) {
            stmt.bindString(11, children_study_situation);
        }
 
        String valuables = entity.getValuables();
        if (valuables != null) {
            stmt.bindString(12, valuables);
        }
 
        String other_bad_situation = entity.getOther_bad_situation();
        if (other_bad_situation != null) {
            stmt.bindString(13, other_bad_situation);
        }
 
        String hard_mix_situation = entity.getHard_mix_situation();
        if (hard_mix_situation != null) {
            stmt.bindString(14, hard_mix_situation);
        }
 
        String whether_same = entity.getWhether_same();
        if (whether_same != null) {
            stmt.bindString(15, whether_same);
        }
 
        String applicant_opinion = entity.getApplicant_opinion();
        if (applicant_opinion != null) {
            stmt.bindString(16, applicant_opinion);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FamilySituationInvest readEntity(Cursor cursor, int offset) {
        FamilySituationInvest entity = new FamilySituationInvest( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // iid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // applicant_iid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // family1_iid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // family2_iid
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // decorate_situation
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // home_appliances
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // water_money_month
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // phone_money_month
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // unlive_need
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // children_study_situation
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // valuables
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // other_bad_situation
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // hard_mix_situation
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // whether_same
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15) // applicant_opinion
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FamilySituationInvest entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setApplicant_iid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFamily1_iid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFamily2_iid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDecorate_situation(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHome_appliances(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setWater_money_month(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPhone_money_month(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUnlive_need(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setChildren_study_situation(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setValuables(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setOther_bad_situation(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setHard_mix_situation(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setWhether_same(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setApplicant_opinion(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FamilySituationInvest entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FamilySituationInvest entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FamilySituationInvest entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
