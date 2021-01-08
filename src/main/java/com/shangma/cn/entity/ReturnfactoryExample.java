package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnfactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnfactoryExample() {
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

        public Criteria andReturnMarkIsNull() {
            addCriterion("return_mark is null");
            return (Criteria) this;
        }

        public Criteria andReturnMarkIsNotNull() {
            addCriterion("return_mark is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMarkEqualTo(String value) {
            addCriterion("return_mark =", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkNotEqualTo(String value) {
            addCriterion("return_mark <>", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkGreaterThan(String value) {
            addCriterion("return_mark >", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkGreaterThanOrEqualTo(String value) {
            addCriterion("return_mark >=", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkLessThan(String value) {
            addCriterion("return_mark <", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkLessThanOrEqualTo(String value) {
            addCriterion("return_mark <=", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkLike(String value) {
            addCriterion("return_mark like", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkNotLike(String value) {
            addCriterion("return_mark not like", value, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkIn(List<String> values) {
            addCriterion("return_mark in", values, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkNotIn(List<String> values) {
            addCriterion("return_mark not in", values, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkBetween(String value1, String value2) {
            addCriterion("return_mark between", value1, value2, "returnMark");
            return (Criteria) this;
        }

        public Criteria andReturnMarkNotBetween(String value1, String value2) {
            addCriterion("return_mark not between", value1, value2, "returnMark");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNull() {
            addCriterion("approver_name is null");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNotNull() {
            addCriterion("approver_name is not null");
            return (Criteria) this;
        }

        public Criteria andApproverNameEqualTo(String value) {
            addCriterion("approver_name =", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotEqualTo(String value) {
            addCriterion("approver_name <>", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThan(String value) {
            addCriterion("approver_name >", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThanOrEqualTo(String value) {
            addCriterion("approver_name >=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThan(String value) {
            addCriterion("approver_name <", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThanOrEqualTo(String value) {
            addCriterion("approver_name <=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLike(String value) {
            addCriterion("approver_name like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotLike(String value) {
            addCriterion("approver_name not like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameIn(List<String> values) {
            addCriterion("approver_name in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotIn(List<String> values) {
            addCriterion("approver_name not in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameBetween(String value1, String value2) {
            addCriterion("approver_name between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotBetween(String value1, String value2) {
            addCriterion("approver_name not between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverTimeIsNull() {
            addCriterion("approver_time is null");
            return (Criteria) this;
        }

        public Criteria andApproverTimeIsNotNull() {
            addCriterion("approver_time is not null");
            return (Criteria) this;
        }

        public Criteria andApproverTimeEqualTo(Date value) {
            addCriterion("approver_time =", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeNotEqualTo(Date value) {
            addCriterion("approver_time <>", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeGreaterThan(Date value) {
            addCriterion("approver_time >", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approver_time >=", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeLessThan(Date value) {
            addCriterion("approver_time <", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeLessThanOrEqualTo(Date value) {
            addCriterion("approver_time <=", value, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeIn(List<Date> values) {
            addCriterion("approver_time in", values, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeNotIn(List<Date> values) {
            addCriterion("approver_time not in", values, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeBetween(Date value1, Date value2) {
            addCriterion("approver_time between", value1, value2, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverTimeNotBetween(Date value1, Date value2) {
            addCriterion("approver_time not between", value1, value2, "approverTime");
            return (Criteria) this;
        }

        public Criteria andApproverStatusIsNull() {
            addCriterion("approver_status is null");
            return (Criteria) this;
        }

        public Criteria andApproverStatusIsNotNull() {
            addCriterion("approver_status is not null");
            return (Criteria) this;
        }

        public Criteria andApproverStatusEqualTo(String value) {
            addCriterion("approver_status =", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusNotEqualTo(String value) {
            addCriterion("approver_status <>", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusGreaterThan(String value) {
            addCriterion("approver_status >", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approver_status >=", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusLessThan(String value) {
            addCriterion("approver_status <", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusLessThanOrEqualTo(String value) {
            addCriterion("approver_status <=", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusLike(String value) {
            addCriterion("approver_status like", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusNotLike(String value) {
            addCriterion("approver_status not like", value, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusIn(List<String> values) {
            addCriterion("approver_status in", values, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusNotIn(List<String> values) {
            addCriterion("approver_status not in", values, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusBetween(String value1, String value2) {
            addCriterion("approver_status between", value1, value2, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andApproverStatusNotBetween(String value1, String value2) {
            addCriterion("approver_status not between", value1, value2, "approverStatus");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidIsNull() {
            addCriterion("return__detailId is null");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidIsNotNull() {
            addCriterion("return__detailId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidEqualTo(Long value) {
            addCriterion("return__detailId =", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidNotEqualTo(Long value) {
            addCriterion("return__detailId <>", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidGreaterThan(Long value) {
            addCriterion("return__detailId >", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("return__detailId >=", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidLessThan(Long value) {
            addCriterion("return__detailId <", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidLessThanOrEqualTo(Long value) {
            addCriterion("return__detailId <=", value, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidIn(List<Long> values) {
            addCriterion("return__detailId in", values, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidNotIn(List<Long> values) {
            addCriterion("return__detailId not in", values, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidBetween(Long value1, Long value2) {
            addCriterion("return__detailId between", value1, value2, "returnDetailid");
            return (Criteria) this;
        }

        public Criteria andReturnDetailidNotBetween(Long value1, Long value2) {
            addCriterion("return__detailId not between", value1, value2, "returnDetailid");
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