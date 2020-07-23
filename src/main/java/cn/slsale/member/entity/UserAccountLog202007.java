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
    public class UserAccountLog202007 implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "account_log_id", type = IdType.AUTO)
    private Long accountLogId;

            /**
            * 用户主键ID
            */
        @TableField("user_ID")
    private Long userId;

            /**
            * 操作时间
            */
    private LocalDateTime actionTime;

            /**
            * 动作摘要
            */
    private String actionDesc;

            /**
            * 动作类型
            */
    private String actionType;

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


}
