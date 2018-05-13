package com.project.zhang.entity;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.project.zhang.entity.NewsList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsListDaoConfig;

    private final NewsListDao newsListDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsListDaoConfig = daoConfigMap.get(NewsListDao.class).clone();
        newsListDaoConfig.initIdentityScope(type);

        newsListDao = new NewsListDao(newsListDaoConfig, this);

        registerDao(NewsList.class, newsListDao);
    }
    
    public void clear() {
        newsListDaoConfig.clearIdentityScope();
    }

    public NewsListDao getNewsListDao() {
        return newsListDao;
    }

}
