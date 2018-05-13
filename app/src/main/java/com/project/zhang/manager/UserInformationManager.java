package com.project.zhang.manager;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.project.zhang.dao.DaoMaster;
import com.project.zhang.dao.DaoSession;
import com.project.zhang.dao.NewsListDao;
import com.project.zhang.entity.NewsList;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class UserInformationManager {

    private final static String dbName = "project_db";
    private static DBManager mInstance;
    private DaoMaster.DevOpenHelper openHelper;
    private Context context;

    public UserInformationManager(Context context) {
        this.context = context;
        openHelper = new DaoMaster.DevOpenHelper(context,dbName,null);

    }

    //获取单例引用
    public static DBManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (DBManager.class) {
                if (mInstance == null) {
                    mInstance = new DBManager(context);
                }
            }
        }
        return mInstance;
    }

    //获取可读数据库
    private SQLiteDatabase getReadableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getReadableDatabase();
        return db;
    }

    //获取可写数据库
    private SQLiteDatabase getWritableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getWritableDatabase();
        return db;
    }

    //插入数据
    /**
     * 插入一条记录
     *
     * @param news
     */
    public void insertUser(NewsList news) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao userDao = daoSession.getNewsListDao();
        userDao.insert(news);
    }

    /**
     * 插入用户集合
     *
     * @param newses
     */
    public void insertUserList(List<NewsList> newses) {
        if (newses == null || newses.isEmpty()) {
            return;
        }
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao userDao = daoSession.getNewsListDao();
        userDao.insertInTx(newses);
    }

    //删除数据
    /**
     * 删除一条记录
     *
     * @param news
     */
    public void deleteUser(NewsList news) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao userDao = daoSession.getNewsListDao();
        userDao.delete(news);
    }

    //更新数据
    /**
     * 更新一条记录
     *
     * @param news
     */
    public void updateUser(NewsList news) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao userDao = daoSession.getNewsListDao();
        userDao.update(news);
    }

    //查询数据
    /**
     * 查询用户列表
     */
    public List<NewsList> queryNewsList() {
        DaoMaster daoMaster = new DaoMaster(getReadableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao newsDao = daoSession.getNewsListDao();
        QueryBuilder<NewsList> qb = newsDao.queryBuilder();
        List<NewsList> list = qb.list();
        return list;
    }

    /**
     * 查询用户列表
     * 根据类型查询，其他查询根据需要添加
     */
    public List<NewsList> queryNewsList(String type) {
        DaoMaster daoMaster = new DaoMaster(getReadableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        NewsListDao newsDao = daoSession.getNewsListDao();
        QueryBuilder<NewsList> qb = newsDao.queryBuilder();
        qb.where(NewsListDao.Properties.Type.gt(type)).orderAsc(NewsListDao.Properties.Type);
        List<NewsList> list = qb.list();
        return list;
    }

    //DBManager dbManager = new DBManager(this);

}

