package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.dao.UserInformationDao;
import com.project.zhang.entity.NewsList;
import com.project.zhang.entity.UserInformation;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class UserInformationDaoOpe {

    /**
     * 添加数据至数据库
     *
     * @param context
     * @param user
     */
    public static void insertData(Context context, UserInformation user) {
        DbManager.getDaoSession(context).getUserInformationDao().insert(user);
    }

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */

    public static void insertData(Context context, List<UserInformation> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getUserInformationDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param user
     */
    public static void saveData(Context context, UserInformation user) {
        DbManager.getDaoSession(context).getUserInformationDao().save(user);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param user 删除具体内容
     */
    public static void deleteData(Context context, UserInformation user) {
        DbManager.getDaoSession(context).getUserInformationDao().delete(user);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getUserInformationDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getUserInformationDao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param user
     */
    public static void updateData(Context context, UserInformation user) {
        DbManager.getDaoSession(context).getUserInformationDao().update(user);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<UserInformation> queryAll(Context context) {
        QueryBuilder<UserInformation> builder = DbManager.getDaoSession(context).getUserInformationDao().queryBuilder();

        return builder.build().list();
    }

    /**
            *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
             */
    public static List<UserInformation> queryPaging( int pageSize, int pageNum,Context context){
        UserInformationDao userListDao = DbManager.getDaoSession(context).getUserInformationDao();
        List<UserInformation> listMsg = userListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }

    /**
     * 数据条数
     * @param context
     * @return
     */
    public static long dataNum(Context context){
        long num = DbManager.getDaoSession(context).getUserInformationDao().count();
        return num;
    }
}
