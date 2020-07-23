package cn.slsale.member.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
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
    public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

            /**
            * 订购时间
            */
    private LocalDateTime orderTime;

            /**
            * 订购单号
            */
    private String orderSn;

            /**
            * 收货用户ID
            */
    private Long pickUserId;

            /**
            * 买单用户ID
            */
    private Long buyUserId;

            /**
            * 重消pv
            */
    private Long repeatPv;

            /**
            * 基本PV
            */
    private Long basePv;

            /**
            * 服务费
            */
    private BigDecimal serviceFee;

            /**
            * 快递费
            */
    private BigDecimal shipFre;

            /**
            * 税费
            */
    private BigDecimal tax;

            /**
            * 收获国家
            */
    private String country;

            /**
            * 联系电话
            */
    private String tel;

            /**
            * 手机
            */
    private String mobile;

            /**
            * 电邮
            */
    private String email;

            /**
            * 收货地址
            */
    private String userAddress;

            /**
            * 邮政编码
            */
    private String postcode;

            /**
            * 订单状态
            */
    private Integer stat;

            /**
            * 快递类型
            */
    private String shipType;

            /**
            * 快递单号
            */
    private String shipNum;

            /**
            * 发货时间
            */
    private LocalDateTime shipTime;

            /**
            * 收货确认时间
            */
    private LocalDateTime receive;

            /**
            * 送货说明
            */
    private String shipNote;


}
