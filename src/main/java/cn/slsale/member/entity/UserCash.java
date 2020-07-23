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
    public class UserCash implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "cash_id", type = IdType.AUTO)
    private Long cashId;

            /**
            * 申请提现时间
            */
    private LocalDateTime cashTime;

            /**
            * 提现单号
            */
    private String cashNum;

            /**
            * 提现用户ID
            */
    private Long userId;

            /**
            * 提现pv
            */
    private Long cashPv;

            /**
            * 提现货币
            */
    private String currency;

            /**
            * pv转换率
            */
    private String pvRate;

            /**
            * 提现金额
            */
    private BigDecimal cashMoney;

            /**
            * 提现备注
            */
    private String note;

            /**
            * 手续费
            */
    private BigDecimal fee;

            /**
            * 税费
            */
    private BigDecimal tax;

            /**
            * 其他费用
            */
    private BigDecimal otherFee;

            /**
            * 提现银行名
            */
    private String bankName;

            /**
            * 银行账号
            */
    private String bankAccount;

            /**
            * 账号姓名
            */
    private String accountName;

            /**
            * 提现状态
            */
    private Integer stat;

            /**
            * 到账金额
            */
    private BigDecimal creditedMoney;

            /**
            * 到账金额
            */
    private LocalDateTime creditedTime;

            /**
            * 系统生成
            */
    private String operatop;


}
