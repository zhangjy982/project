package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.dao.NeighborVisitDao;
import com.project.zhang.entity.NeighborVisit;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class NeighborVisitDaoOpe {

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */

    public static void insertData(Context context, List<NeighborVisit> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getNeighborVisitDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param param
     */
    public static void saveData(Context context, NeighborVisit param) {
        DbManager.getDaoSession(context).getNeighborVisitDao().save(param);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param param 删除具体内容
     */
    public static void deleteData(Context context, NeighborVisit param) {
        DbManager.getDaoSession(context).getNeighborVisitDao().delete(param);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getNeighborVisitDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getNeighborVisitDao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param param
     */
    public static void updateData(Context context, NeighborVisit param) {
        DbManager.getDaoSession(context).getNeighborVisitDao().update(param);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<NeighborVisit> queryAll(Context context) {
        QueryBuilder<NeighborVisit> builder = DbManager.getDaoSession(context).getNeighborVisitDao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
     */
    public static List<NeighborVisit> queryPaging( int pageSize, int pageNum,Context context){
        NeighborVisitDao paramListDao = DbManager.getDaoSession(context).getNeighborVisitDao();
        List<NeighborVisit> listMsg = paramListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }

    /**
     * 数据条数
     * @param context
     * @return
     */
    public static long dataNum(Context context){
        long num = DbManager.getDaoSession(context).getNeighborVisitDao().count();
        return num;
    }
}
