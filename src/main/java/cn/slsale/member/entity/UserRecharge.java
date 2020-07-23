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
    public class UserRecharge implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "recharge_id", type = IdType.AUTO)
    private Long rechargeId;

            /**
            * 充值时间
            */
    private LocalDateTime rechargeTime;

            /**
            * 充值单号
            */
    private String rechargeNum;

            /**
            * 充值用户ID
            */
    private Long userId;

            /**
            * 充值货币
            */
    private String currency;

            /**
            * 充值金额
            */
    private BigDecimal rechargeMoney;

            /**
            * 摘要备注
            */
    private String note;

            /**
            * 到账金额
            */
    private BigDecimal creditedMoney;

            /**
            * 到账时间
            */
    private LocalDateTime creditedTime;

            /**
            * 审核人
            */
    private String auditUser;

            /**
            * pv比率
            */
    private String pvRate;

            /**
            * 兑换后pv值
            */
    private Long pv;

            /**
            * 充值银行名 
            */
    private String bankName;

            /**
            * 充值账号名
            */
    private String bankAccount;

            /**
            * 充值平台
            */
    private String platform;

            /**
            * 充值接口参数
            */
    private String param;


}
