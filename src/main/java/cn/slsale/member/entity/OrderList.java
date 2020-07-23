package cn.slsale.member.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author testpage
* @since 2020-07-23
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class OrderList implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "list_id", type = IdType.AUTO)
    private Long listId;

            /**
            * 订单ID
            */
    private Long orderId;

            /**
            * 商品ID
            */
    private Long goodsId;

            /**
            * 编码
            */
    private String goodsSn;

            /**
            * 名称
            */
    private String goodsName;

            /**
            * 规格
            */
    private String goodsFormat;

            /**
            * 数量
            */
    private Long goodsNum;

            /**
            * 单价
            */
    private BigDecimal eachPrice;

            /**
            * 总价
            */
    private BigDecimal sumPrice;

            /**
            * 折扣
            */
    private Long discount;

            /**
            * 实际价格
            */
    private BigDecimal realPrice;

            /**
            * 货币种类
            */
    private String currency;

            /**
            * 实际pv
            */
    private Long realPv;

            /**
            * pv折算率
            */
    private String pvRate;


}
