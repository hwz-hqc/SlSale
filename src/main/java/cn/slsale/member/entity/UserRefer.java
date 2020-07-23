package cn.slsale.member.entity;

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
    public class UserRefer implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "refer_log_id", type = IdType.AUTO)
    private Long referLogId;

            /**
            * 推荐时间
            */
    private LocalDateTime referTime;

            /**
            * 推荐人ID
            */
    private Long referId;

            /**
            * 消费pv
            */
    private String buyPv;

            /**
            * 奖金比率
            */
    private String bonusRate;

            /**
            * 推荐奖励pv
            */
    private Long bonusPv;


}
