package cn.edu.xmu.ooad.model.po;

public class CommentPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.customer_id
     *
     * @mbg.generated
     */
    private Long customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.goods_sku_id
     *
     * @mbg.generated
     */
    private Long goodsSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.orderitem_id
     *
     * @mbg.generated
     */
    private Long orderitemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_comment.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.id
     *
     * @return the value of good_comment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.id
     *
     * @param id the value for good_comment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.customer_id
     *
     * @return the value of good_comment.customer_id
     *
     * @mbg.generated
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.customer_id
     *
     * @param customerId the value for good_comment.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.goods_sku_id
     *
     * @return the value of good_comment.goods_sku_id
     *
     * @mbg.generated
     */
    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.goods_sku_id
     *
     * @param goodsSkuId the value for good_comment.goods_sku_id
     *
     * @mbg.generated
     */
    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.orderitem_id
     *
     * @return the value of good_comment.orderitem_id
     *
     * @mbg.generated
     */
    public Long getOrderitemId() {
        return orderitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.orderitem_id
     *
     * @param orderitemId the value for good_comment.orderitem_id
     *
     * @mbg.generated
     */
    public void setOrderitemId(Long orderitemId) {
        this.orderitemId = orderitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.type
     *
     * @return the value of good_comment.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.type
     *
     * @param type the value for good_comment.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.content
     *
     * @return the value of good_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.content
     *
     * @param content the value for good_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_comment.state
     *
     * @return the value of good_comment.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_comment.state
     *
     * @param state the value for good_comment.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }
}