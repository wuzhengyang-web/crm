package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class ReturndetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturndetailExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andReturnSiteIsNull() {
            addCriterion("return_site is null");
            return (Criteria) this;
        }

        public Criteria andReturnSiteIsNotNull() {
            addCriterion("return_site is not null");
            return (Criteria) this;
        }

        public Criteria andReturnSiteEqualTo(String value) {
            addCriterion("return_site =", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteNotEqualTo(String value) {
            addCriterion("return_site <>", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteGreaterThan(String value) {
            addCriterion("return_site >", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteGreaterThanOrEqualTo(String value) {
            addCriterion("return_site >=", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteLessThan(String value) {
            addCriterion("return_site <", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteLessThanOrEqualTo(String value) {
            addCriterion("return_site <=", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteLike(String value) {
            addCriterion("return_site like", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteNotLike(String value) {
            addCriterion("return_site not like", value, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteIn(List<String> values) {
            addCriterion("return_site in", values, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteNotIn(List<String> values) {
            addCriterion("return_site not in", values, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteBetween(String value1, String value2) {
            addCriterion("return_site between", value1, value2, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnSiteNotBetween(String value1, String value2) {
            addCriterion("return_site not between", value1, value2, "returnSite");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseIsNull() {
            addCriterion("return_because is null");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseIsNotNull() {
            addCriterion("return_because is not null");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseEqualTo(String value) {
            addCriterion("return_because =", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseNotEqualTo(String value) {
            addCriterion("return_because <>", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseGreaterThan(String value) {
            addCriterion("return_because >", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseGreaterThanOrEqualTo(String value) {
            addCriterion("return_because >=", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseLessThan(String value) {
            addCriterion("return_because <", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseLessThanOrEqualTo(String value) {
            addCriterion("return_because <=", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseLike(String value) {
            addCriterion("return_because like", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseNotLike(String value) {
            addCriterion("return_because not like", value, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseIn(List<String> values) {
            addCriterion("return_because in", values, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseNotIn(List<String> values) {
            addCriterion("return_because not in", values, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseBetween(String value1, String value2) {
            addCriterion("return_because between", value1, value2, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnBecauseNotBetween(String value1, String value2) {
            addCriterion("return_because not between", value1, value2, "returnBecause");
            return (Criteria) this;
        }

        public Criteria andReturnNoteIsNull() {
            addCriterion("return_note is null");
            return (Criteria) this;
        }

        public Criteria andReturnNoteIsNotNull() {
            addCriterion("return_note is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNoteEqualTo(String value) {
            addCriterion("return_note =", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteNotEqualTo(String value) {
            addCriterion("return_note <>", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteGreaterThan(String value) {
            addCriterion("return_note >", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteGreaterThanOrEqualTo(String value) {
            addCriterion("return_note >=", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteLessThan(String value) {
            addCriterion("return_note <", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteLessThanOrEqualTo(String value) {
            addCriterion("return_note <=", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteLike(String value) {
            addCriterion("return_note like", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteNotLike(String value) {
            addCriterion("return_note not like", value, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteIn(List<String> values) {
            addCriterion("return_note in", values, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteNotIn(List<String> values) {
            addCriterion("return_note not in", values, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteBetween(String value1, String value2) {
            addCriterion("return_note between", value1, value2, "returnNote");
            return (Criteria) this;
        }

        public Criteria andReturnNoteNotBetween(String value1, String value2) {
            addCriterion("return_note not between", value1, value2, "returnNote");
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