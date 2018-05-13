package com.project.zhang.db;

import android.content.Context;

import com.project.zhang.entity.NewsList;
import com.project.zhang.dao.NewsListDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class NewsListDaoOpe {

    /**
     * 添加数据至数据库
     *
     * @param context
     * @param news
     */
    public static void insertData(Context context, NewsList news) {
        DbManager.getDaoSession(context).getNewsListDao().insert(news);
    }

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param context
     * @param list
     */
    public static void insertData(Context context, List<NewsList> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getNewsListDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param context
     * @param news
     */
    public static void saveData(Context context, NewsList news) {
        DbManager.getDaoSession(context).getNewsListDao().save(news);
    }

    /**
     * 删除数据至数据库
     *
     * @param context
     * @param news 删除具体内容
     */
    public static void deleteData(Context context, NewsList news) {
        DbManager.getDaoSession(context).getNewsListDao().delete(news);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param context
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getNewsListDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     *
     * @param context
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getNewsListDao().deleteAll();
    }

    /**
     * 更新数据库
     *
     * @param context
     * @param news
     */
    public static void updateData(Context context, NewsList news) {
        DbManager.getDaoSession(context).getNewsListDao().update(news);
    }

    /**
     * 查询所有数据
     *
     * @param context
     * @return
     */
    public static List<NewsList> queryAll(Context context) {
        QueryBuilder<NewsList> builder = DbManager.getDaoSession(context).getNewsListDao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param context
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     * @return
     */
    public static List<NewsList> queryPaging( int pageSize, int pageNum,Context context){
        NewsListDao newsListDao = DbManager.getDaoSession(context).getNewsListDao();
        List<NewsList> listMsg = newsListDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }
}
