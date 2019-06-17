package com.jnshu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Long value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Long value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Long value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Long value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Long value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Long value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Long> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Long> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Long value1, Long value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Long value1, Long value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andProductionNameIsNull() {
            addCriterion("production_name is null");
            return (Criteria) this;
        }

        public Criteria andProductionNameIsNotNull() {
            addCriterion("production_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductionNameEqualTo(String value) {
            addCriterion("production_name =", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotEqualTo(String value) {
            addCriterion("production_name <>", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameGreaterThan(String value) {
            addCriterion("production_name >", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameGreaterThanOrEqualTo(String value) {
            addCriterion("production_name >=", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLessThan(String value) {
            addCriterion("production_name <", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLessThanOrEqualTo(String value) {
            addCriterion("production_name <=", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameLike(String value) {
            addCriterion("production_name like", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotLike(String value) {
            addCriterion("production_name not like", value, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameIn(List<String> values) {
            addCriterion("production_name in", values, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotIn(List<String> values) {
            addCriterion("production_name not in", values, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameBetween(String value1, String value2) {
            addCriterion("production_name between", value1, value2, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionNameNotBetween(String value1, String value2) {
            addCriterion("production_name not between", value1, value2, "productionName");
            return (Criteria) this;
        }

        public Criteria andProductionIntroIsNull() {
            addCriterion("production_intro is null");
            return (Criteria) this;
        }

        public Criteria andProductionIntroIsNotNull() {
            addCriterion("production_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProductionIntroEqualTo(String value) {
            addCriterion("production_intro =", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroNotEqualTo(String value) {
            addCriterion("production_intro <>", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroGreaterThan(String value) {
            addCriterion("production_intro >", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroGreaterThanOrEqualTo(String value) {
            addCriterion("production_intro >=", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroLessThan(String value) {
            addCriterion("production_intro <", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroLessThanOrEqualTo(String value) {
            addCriterion("production_intro <=", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroLike(String value) {
            addCriterion("production_intro like", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroNotLike(String value) {
            addCriterion("production_intro not like", value, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroIn(List<String> values) {
            addCriterion("production_intro in", values, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroNotIn(List<String> values) {
            addCriterion("production_intro not in", values, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroBetween(String value1, String value2) {
            addCriterion("production_intro between", value1, value2, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andProductionIntroNotBetween(String value1, String value2) {
            addCriterion("production_intro not between", value1, value2, "productionIntro");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlIsNull() {
            addCriterion("thumbna_url is null");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlIsNotNull() {
            addCriterion("thumbna_url is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlEqualTo(String value) {
            addCriterion("thumbna_url =", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlNotEqualTo(String value) {
            addCriterion("thumbna_url <>", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlGreaterThan(String value) {
            addCriterion("thumbna_url >", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("thumbna_url >=", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlLessThan(String value) {
            addCriterion("thumbna_url <", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlLessThanOrEqualTo(String value) {
            addCriterion("thumbna_url <=", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlLike(String value) {
            addCriterion("thumbna_url like", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlNotLike(String value) {
            addCriterion("thumbna_url not like", value, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlIn(List<String> values) {
            addCriterion("thumbna_url in", values, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlNotIn(List<String> values) {
            addCriterion("thumbna_url not in", values, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlBetween(String value1, String value2) {
            addCriterion("thumbna_url between", value1, value2, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnaUrlNotBetween(String value1, String value2) {
            addCriterion("thumbna_url not between", value1, value2, "thumbnaUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlIsNull() {
            addCriterion("infopicture_url is null");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlIsNotNull() {
            addCriterion("infopicture_url is not null");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlEqualTo(String value) {
            addCriterion("infopicture_url =", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlNotEqualTo(String value) {
            addCriterion("infopicture_url <>", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlGreaterThan(String value) {
            addCriterion("infopicture_url >", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("infopicture_url >=", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlLessThan(String value) {
            addCriterion("infopicture_url <", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlLessThanOrEqualTo(String value) {
            addCriterion("infopicture_url <=", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlLike(String value) {
            addCriterion("infopicture_url like", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlNotLike(String value) {
            addCriterion("infopicture_url not like", value, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlIn(List<String> values) {
            addCriterion("infopicture_url in", values, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlNotIn(List<String> values) {
            addCriterion("infopicture_url not in", values, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlBetween(String value1, String value2) {
            addCriterion("infopicture_url between", value1, value2, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andInfopictureUrlNotBetween(String value1, String value2) {
            addCriterion("infopicture_url not between", value1, value2, "infopictureUrl");
            return (Criteria) this;
        }

        public Criteria andProductionInfoIsNull() {
            addCriterion("production_info is null");
            return (Criteria) this;
        }

        public Criteria andProductionInfoIsNotNull() {
            addCriterion("production_info is not null");
            return (Criteria) this;
        }

        public Criteria andProductionInfoEqualTo(String value) {
            addCriterion("production_info =", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoNotEqualTo(String value) {
            addCriterion("production_info <>", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoGreaterThan(String value) {
            addCriterion("production_info >", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("production_info >=", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoLessThan(String value) {
            addCriterion("production_info <", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoLessThanOrEqualTo(String value) {
            addCriterion("production_info <=", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoLike(String value) {
            addCriterion("production_info like", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoNotLike(String value) {
            addCriterion("production_info not like", value, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoIn(List<String> values) {
            addCriterion("production_info in", values, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoNotIn(List<String> values) {
            addCriterion("production_info not in", values, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoBetween(String value1, String value2) {
            addCriterion("production_info between", value1, value2, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionInfoNotBetween(String value1, String value2) {
            addCriterion("production_info not between", value1, value2, "productionInfo");
            return (Criteria) this;
        }

        public Criteria andProductionStateIsNull() {
            addCriterion("production_state is null");
            return (Criteria) this;
        }

        public Criteria andProductionStateIsNotNull() {
            addCriterion("production_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductionStateEqualTo(Byte value) {
            addCriterion("production_state =", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotEqualTo(Byte value) {
            addCriterion("production_state <>", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateGreaterThan(Byte value) {
            addCriterion("production_state >", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("production_state >=", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateLessThan(Byte value) {
            addCriterion("production_state <", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateLessThanOrEqualTo(Byte value) {
            addCriterion("production_state <=", value, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateIn(List<Byte> values) {
            addCriterion("production_state in", values, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotIn(List<Byte> values) {
            addCriterion("production_state not in", values, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateBetween(Byte value1, Byte value2) {
            addCriterion("production_state between", value1, value2, "productionState");
            return (Criteria) this;
        }

        public Criteria andProductionStateNotBetween(Byte value1, Byte value2) {
            addCriterion("production_state not between", value1, value2, "productionState");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Long value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Long value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Long value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Long value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Long value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Long> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Long> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Long value1, Long value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Long value1, Long value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Long value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Long value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Long value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Long value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Long value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Long> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Long> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Long value1, Long value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Long value1, Long value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}