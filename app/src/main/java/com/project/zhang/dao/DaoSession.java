package com.project.zhang.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.project.zhang.entity.ApplicantInformation;
import com.project.zhang.entity.FamilyEcnomicRegister01;
import com.project.zhang.entity.FamilyEcnomicRegister02;
import com.project.zhang.entity.FamilyEcnomicRegister03;
import com.project.zhang.entity.FamilyRegister01;
import com.project.zhang.entity.FamilyRegister02;
import com.project.zhang.entity.FamilyRegister03;
import com.project.zhang.entity.FamilySituationInvest;
import com.project.zhang.entity.LivingOnlineList;
import com.project.zhang.entity.NeighborVisit;
import com.project.zhang.entity.NewsList;
import com.project.zhang.entity.OrganizationStructure;
import com.project.zhang.entity.PeopleMeetingRecord;
import com.project.zhang.entity.UserInformation;

import com.project.zhang.dao.ApplicantInformationDao;
import com.project.zhang.dao.FamilyEcnomicRegister01Dao;
import com.project.zhang.dao.FamilyEcnomicRegister02Dao;
import com.project.zhang.dao.FamilyEcnomicRegister03Dao;
import com.project.zhang.dao.FamilyRegister01Dao;
import com.project.zhang.dao.FamilyRegister02Dao;
import com.project.zhang.dao.FamilyRegister03Dao;
import com.project.zhang.dao.FamilySituationInvestDao;
import com.project.zhang.dao.LivingOnlineListDao;
import com.project.zhang.dao.NeighborVisitDao;
import com.project.zhang.dao.NewsListDao;
import com.project.zhang.dao.OrganizationStructureDao;
import com.project.zhang.dao.PeopleMeetingRecordDao;
import com.project.zhang.dao.UserInformationDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig applicantInformationDaoConfig;
    private final DaoConfig familyEcnomicRegister01DaoConfig;
    private final DaoConfig familyEcnomicRegister02DaoConfig;
    private final DaoConfig familyEcnomicRegister03DaoConfig;
    private final DaoConfig familyRegister01DaoConfig;
    private final DaoConfig familyRegister02DaoConfig;
    private final DaoConfig familyRegister03DaoConfig;
    private final DaoConfig familySituationInvestDaoConfig;
    private final DaoConfig livingOnlineListDaoConfig;
    private final DaoConfig neighborVisitDaoConfig;
    private final DaoConfig newsListDaoConfig;
    private final DaoConfig organizationStructureDaoConfig;
    private final DaoConfig peopleMeetingRecordDaoConfig;
    private final DaoConfig userInformationDaoConfig;

    private final ApplicantInformationDao applicantInformationDao;
    private final FamilyEcnomicRegister01Dao familyEcnomicRegister01Dao;
    private final FamilyEcnomicRegister02Dao familyEcnomicRegister02Dao;
    private final FamilyEcnomicRegister03Dao familyEcnomicRegister03Dao;
    private final FamilyRegister01Dao familyRegister01Dao;
    private final FamilyRegister02Dao familyRegister02Dao;
    private final FamilyRegister03Dao familyRegister03Dao;
    private final FamilySituationInvestDao familySituationInvestDao;
    private final LivingOnlineListDao livingOnlineListDao;
    private final NeighborVisitDao neighborVisitDao;
    private final NewsListDao newsListDao;
    private final OrganizationStructureDao organizationStructureDao;
    private final PeopleMeetingRecordDao peopleMeetingRecordDao;
    private final UserInformationDao userInformationDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        applicantInformationDaoConfig = daoConfigMap.get(ApplicantInformationDao.class).clone();
        applicantInformationDaoConfig.initIdentityScope(type);

        familyEcnomicRegister01DaoConfig = daoConfigMap.get(FamilyEcnomicRegister01Dao.class).clone();
        familyEcnomicRegister01DaoConfig.initIdentityScope(type);

        familyEcnomicRegister02DaoConfig = daoConfigMap.get(FamilyEcnomicRegister02Dao.class).clone();
        familyEcnomicRegister02DaoConfig.initIdentityScope(type);

        familyEcnomicRegister03DaoConfig = daoConfigMap.get(FamilyEcnomicRegister03Dao.class).clone();
        familyEcnomicRegister03DaoConfig.initIdentityScope(type);

        familyRegister01DaoConfig = daoConfigMap.get(FamilyRegister01Dao.class).clone();
        familyRegister01DaoConfig.initIdentityScope(type);

        familyRegister02DaoConfig = daoConfigMap.get(FamilyRegister02Dao.class).clone();
        familyRegister02DaoConfig.initIdentityScope(type);

        familyRegister03DaoConfig = daoConfigMap.get(FamilyRegister03Dao.class).clone();
        familyRegister03DaoConfig.initIdentityScope(type);

        familySituationInvestDaoConfig = daoConfigMap.get(FamilySituationInvestDao.class).clone();
        familySituationInvestDaoConfig.initIdentityScope(type);

        livingOnlineListDaoConfig = daoConfigMap.get(LivingOnlineListDao.class).clone();
        livingOnlineListDaoConfig.initIdentityScope(type);

        neighborVisitDaoConfig = daoConfigMap.get(NeighborVisitDao.class).clone();
        neighborVisitDaoConfig.initIdentityScope(type);

        newsListDaoConfig = daoConfigMap.get(NewsListDao.class).clone();
        newsListDaoConfig.initIdentityScope(type);

        organizationStructureDaoConfig = daoConfigMap.get(OrganizationStructureDao.class).clone();
        organizationStructureDaoConfig.initIdentityScope(type);

        peopleMeetingRecordDaoConfig = daoConfigMap.get(PeopleMeetingRecordDao.class).clone();
        peopleMeetingRecordDaoConfig.initIdentityScope(type);

        userInformationDaoConfig = daoConfigMap.get(UserInformationDao.class).clone();
        userInformationDaoConfig.initIdentityScope(type);

        applicantInformationDao = new ApplicantInformationDao(applicantInformationDaoConfig, this);
        familyEcnomicRegister01Dao = new FamilyEcnomicRegister01Dao(familyEcnomicRegister01DaoConfig, this);
        familyEcnomicRegister02Dao = new FamilyEcnomicRegister02Dao(familyEcnomicRegister02DaoConfig, this);
        familyEcnomicRegister03Dao = new FamilyEcnomicRegister03Dao(familyEcnomicRegister03DaoConfig, this);
        familyRegister01Dao = new FamilyRegister01Dao(familyRegister01DaoConfig, this);
        familyRegister02Dao = new FamilyRegister02Dao(familyRegister02DaoConfig, this);
        familyRegister03Dao = new FamilyRegister03Dao(familyRegister03DaoConfig, this);
        familySituationInvestDao = new FamilySituationInvestDao(familySituationInvestDaoConfig, this);
        livingOnlineListDao = new LivingOnlineListDao(livingOnlineListDaoConfig, this);
        neighborVisitDao = new NeighborVisitDao(neighborVisitDaoConfig, this);
        newsListDao = new NewsListDao(newsListDaoConfig, this);
        organizationStructureDao = new OrganizationStructureDao(organizationStructureDaoConfig, this);
        peopleMeetingRecordDao = new PeopleMeetingRecordDao(peopleMeetingRecordDaoConfig, this);
        userInformationDao = new UserInformationDao(userInformationDaoConfig, this);

        registerDao(ApplicantInformation.class, applicantInformationDao);
        registerDao(FamilyEcnomicRegister01.class, familyEcnomicRegister01Dao);
        registerDao(FamilyEcnomicRegister02.class, familyEcnomicRegister02Dao);
        registerDao(FamilyEcnomicRegister03.class, familyEcnomicRegister03Dao);
        registerDao(FamilyRegister01.class, familyRegister01Dao);
        registerDao(FamilyRegister02.class, familyRegister02Dao);
        registerDao(FamilyRegister03.class, familyRegister03Dao);
        registerDao(FamilySituationInvest.class, familySituationInvestDao);
        registerDao(LivingOnlineList.class, livingOnlineListDao);
        registerDao(NeighborVisit.class, neighborVisitDao);
        registerDao(NewsList.class, newsListDao);
        registerDao(OrganizationStructure.class, organizationStructureDao);
        registerDao(PeopleMeetingRecord.class, peopleMeetingRecordDao);
        registerDao(UserInformation.class, userInformationDao);
    }
    
    public void clear() {
        applicantInformationDaoConfig.clearIdentityScope();
        familyEcnomicRegister01DaoConfig.clearIdentityScope();
        familyEcnomicRegister02DaoConfig.clearIdentityScope();
        familyEcnomicRegister03DaoConfig.clearIdentityScope();
        familyRegister01DaoConfig.clearIdentityScope();
        familyRegister02DaoConfig.clearIdentityScope();
        familyRegister03DaoConfig.clearIdentityScope();
        familySituationInvestDaoConfig.clearIdentityScope();
        livingOnlineListDaoConfig.clearIdentityScope();
        neighborVisitDaoConfig.clearIdentityScope();
        newsListDaoConfig.clearIdentityScope();
        organizationStructureDaoConfig.clearIdentityScope();
        peopleMeetingRecordDaoConfig.clearIdentityScope();
        userInformationDaoConfig.clearIdentityScope();
    }

    public ApplicantInformationDao getApplicantInformationDao() {
        return applicantInformationDao;
    }

    public FamilyEcnomicRegister01Dao getFamilyEcnomicRegister01Dao() {
        return familyEcnomicRegister01Dao;
    }

    public FamilyEcnomicRegister02Dao getFamilyEcnomicRegister02Dao() {
        return familyEcnomicRegister02Dao;
    }

    public FamilyEcnomicRegister03Dao getFamilyEcnomicRegister03Dao() {
        return familyEcnomicRegister03Dao;
    }

    public FamilyRegister01Dao getFamilyRegister01Dao() {
        return familyRegister01Dao;
    }

    public FamilyRegister02Dao getFamilyRegister02Dao() {
        return familyRegister02Dao;
    }

    public FamilyRegister03Dao getFamilyRegister03Dao() {
        return familyRegister03Dao;
    }

    public FamilySituationInvestDao getFamilySituationInvestDao() {
        return familySituationInvestDao;
    }

    public LivingOnlineListDao getLivingOnlineListDao() {
        return livingOnlineListDao;
    }

    public NeighborVisitDao getNeighborVisitDao() {
        return neighborVisitDao;
    }

    public NewsListDao getNewsListDao() {
        return newsListDao;
    }

    public OrganizationStructureDao getOrganizationStructureDao() {
        return organizationStructureDao;
    }

    public PeopleMeetingRecordDao getPeopleMeetingRecordDao() {
        return peopleMeetingRecordDao;
    }

    public UserInformationDao getUserInformationDao() {
        return userInformationDao;
    }

}