package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.dao.FamilyEcnomicRegister01Dao;
import com.project.zhang.entity.FamilyEcnomicRegister01;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class FamilyEcnomicRegister01DaoOpe {

    /**
     * 添加数据至数据库
     *
     * @param context
     * @param param
     */
    public static void insertData(Context context, FamilyEcnomicRegister01 param) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().insert(param);
    }

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */

    public static void insertData(Context context, List<FamilyEcnomicRegister01> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param param
     */
    public static void saveData(Context context, FamilyEcnomicRegister01 param) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().save(param);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param param 删除具体内容
     */
    public static void deleteData(Context context, FamilyEcnomicRegister01 param) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().delete(param);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param param
     */
    public static void updateData(Context context, FamilyEcnomicRegister01 param) {
        DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().update(param);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<FamilyEcnomicRegister01> queryAll(Context context) {
        QueryBuilder<FamilyEcnomicRegister01> builder = DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
     */
    public static List<FamilyEcnomicRegister01> queryPaging( int pageSize, int pageNum,Context context){
        FamilyEcnomicRegister01Dao paramListDao = DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao();
        List<FamilyEcnomicRegister01> listMsg = paramListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }

    /**
     * 数据条数
     * @param context
     * @return
     */
    public static long dataNum(Context context){
        long num = DbManager.getDaoSession(context).getFamilyEcnomicRegister01Dao().count();
        return num;
    }
}
