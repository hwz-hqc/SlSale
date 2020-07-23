package cn.slsale.member.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
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
    public class UserAccount202007 implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "account_id", type = IdType.AUTO)
    private Long accountId;

            /**
            * 用户主键ID
            */
        @TableField("user_ID")
    private Long userId;

            /**
            * 日期
            */
    private LocalDateTime accountDate;

            /**
            * 总账状态
            */
    private Integer stat;

            /**
            * 基本入账
            */
    private BigDecimal baseIn;

            /**
            * 基本出账
            */
    private BigDecimal baseOut;

            /**
            * 基本余额
            */
    private BigDecimal baseBalance;

            /**
            * 重消入账
            */
    private BigDecimal repeatIn;

            /**
            * 重消出账
            */
    private BigDecimal repeatOut;

            /**
            * 重消余额
            */
    private BigDecimal repeatBalance;

            /**
            * 未分红重消pv
            */
    private String freePv;

            /**
            * 已分红未领重消pv
            */
    private Long alreadyPv;

            /**
            * 已领货重消
            */
    private String buyPv;


}
