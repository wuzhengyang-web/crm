package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class ReturngoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturngoodsExample() {
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Long value1, Long value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andTrackingInformIsNull() {
            addCriterion("tracking_inform is null");
            return (Criteria) this;
        }

        public Criteria andTrackingInformIsNotNull() {
            addCriterion("tracking_inform is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingInformEqualTo(String value) {
            addCriterion("tracking_inform =", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformNotEqualTo(String value) {
            addCriterion("tracking_inform <>", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformGreaterThan(String value) {
            addCriterion("tracking_inform >", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformGreaterThanOrEqualTo(String value) {
            addCriterion("tracking_inform >=", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformLessThan(String value) {
            addCriterion("tracking_inform <", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformLessThanOrEqualTo(String value) {
            addCriterion("tracking_inform <=", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformLike(String value) {
            addCriterion("tracking_inform like", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformNotLike(String value) {
            addCriterion("tracking_inform not like", value, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformIn(List<String> values) {
            addCriterion("tracking_inform in", values, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformNotIn(List<String> values) {
            addCriterion("tracking_inform not in", values, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformBetween(String value1, String value2) {
            addCriterion("tracking_inform between", value1, value2, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andTrackingInformNotBetween(String value1, String value2) {
            addCriterion("tracking_inform not between", value1, value2, "trackingInform");
            return (Criteria) this;
        }

        public Criteria andConfigurationIsNull() {
            addCriterion("configuration is null");
            return (Criteria) this;
        }

        public Criteria andConfigurationIsNotNull() {
            addCriterion("configuration is not null");
            return (Criteria) this;
        }

        public Criteria andConfigurationEqualTo(String value) {
            addCriterion("configuration =", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotEqualTo(String value) {
            addCriterion("configuration <>", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationGreaterThan(String value) {
            addCriterion("configuration >", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationGreaterThanOrEqualTo(String value) {
            addCriterion("configuration >=", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLessThan(String value) {
            addCriterion("configuration <", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLessThanOrEqualTo(String value) {
            addCriterion("configuration <=", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLike(String value) {
            addCriterion("configuration like", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotLike(String value) {
            addCriterion("configuration not like", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationIn(List<String> values) {
            addCriterion("configuration in", values, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotIn(List<String> values) {
            addCriterion("configuration not in", values, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationBetween(String value1, String value2) {
            addCriterion("configuration between", value1, value2, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotBetween(String value1, String value2) {
            addCriterion("configuration not between", value1, value2, "configuration");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("return_type like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("return_type not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andAfterIdIsNull() {
            addCriterion("after_id is null");
            return (Criteria) this;
        }

        public Criteria andAfterIdIsNotNull() {
            addCriterion("after_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfterIdEqualTo(Long value) {
            addCriterion("after_id =", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotEqualTo(Long value) {
            addCriterion("after_id <>", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdGreaterThan(Long value) {
            addCriterion("after_id >", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("after_id >=", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdLessThan(Long value) {
            addCriterion("after_id <", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdLessThanOrEqualTo(Long value) {
            addCriterion("after_id <=", value, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdIn(List<Long> values) {
            addCriterion("after_id in", values, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotIn(List<Long> values) {
            addCriterion("after_id not in", values, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdBetween(Long value1, Long value2) {
            addCriterion("after_id between", value1, value2, "afterId");
            return (Criteria) this;
        }

        public Criteria andAfterIdNotBetween(Long value1, Long value2) {
            addCriterion("after_id not between", value1, value2, "afterId");
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