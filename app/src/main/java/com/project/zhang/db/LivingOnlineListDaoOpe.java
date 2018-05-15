package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.dao.FamilyRegister01Dao;
import com.project.zhang.dao.LivingOnlineListDao;
import com.project.zhang.entity.FamilyRegister01;
import com.project.zhang.entity.LivingOnlineList;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class LivingOnlineListDaoOpe {

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */

    public static void insertData(Context context, List<LivingOnlineList> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getLivingOnlineListDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param param
     */
    public static void saveData(Context context, LivingOnlineList param) {
        DbManager.getDaoSession(context).getLivingOnlineListDao().save(param);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param param 删除具体内容
     */
    public static void deleteData(Context context, LivingOnlineList param) {
        DbManager.getDaoSession(context).getLivingOnlineListDao().delete(param);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getLivingOnlineListDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getLivingOnlineListDao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param param
     */
    public static void updateData(Context context, LivingOnlineList param) {
        DbManager.getDaoSession(context).getLivingOnlineListDao().update(param);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<LivingOnlineList> queryAll(Context context) {
        QueryBuilder<LivingOnlineList> builder = DbManager.getDaoSession(context).getLivingOnlineListDao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
     */
    public static List<LivingOnlineList> queryPaging( int pageSize, int pageNum,Context context){
        LivingOnlineListDao paramListDao = DbManager.getDaoSession(context).getLivingOnlineListDao();
        List<LivingOnlineList> listMsg = paramListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }

    /**
     * 数据条数
     * @param context
     * @return
     */
    public static long dataNum(Context context){
        long num = DbManager.getDaoSession(context).getLivingOnlineListDao().count();
        return num;
    }
}
