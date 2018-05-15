package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.dao.ApplicantInformationDao;
import com.project.zhang.dao.UserInformationDao;
import com.project.zhang.entity.ApplicantInformation;
import com.project.zhang.entity.UserInformation;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class ApplicantInformationDaoOpe {

    /**
     * 添加数据至数据库
     *
     * @param context
     * @param ai
     */
    public static void insertData(Context context, ApplicantInformation ai) {
        DbManager.getDaoSession(context).getApplicantInformationDao().insert(ai);
    }

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */

    public static void insertData(Context context, List<ApplicantInformation> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getApplicantInformationDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param ai
     */
    public static void saveData(Context context, ApplicantInformation ai) {
        DbManager.getDaoSession(context).getApplicantInformationDao().save(ai);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param ai 删除具体内容
     */
    public static void deleteData(Context context, ApplicantInformation ai) {
        DbManager.getDaoSession(context).getApplicantInformationDao().delete(ai);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getApplicantInformationDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getApplicantInformationDao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param ai
     */
    public static void updateData(Context context, ApplicantInformation ai) {
        DbManager.getDaoSession(context).getApplicantInformationDao().update(ai);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<ApplicantInformation> queryAll(Context context) {
        QueryBuilder<ApplicantInformation> builder = DbManager.getDaoSession(context).getApplicantInformationDao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
     */
    public static List<ApplicantInformation> queryPaging( int pageSize, int pageNum,Context context){
        ApplicantInformationDao userListDao = DbManager.getDaoSession(context).getApplicantInformationDao();
        List<ApplicantInformation> listMsg = userListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }

    /**
     * 数据条数
     * @param context
     * @return
     */
    public static long dataNum(Context context){
        long num = DbManager.getDaoSession(context).getApplicantInformationDao().count();
        return num;
    }
}
