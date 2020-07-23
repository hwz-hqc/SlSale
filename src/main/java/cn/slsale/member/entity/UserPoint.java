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
    public class UserPoint implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "point_id", type = IdType.AUTO)
    private Long pointId;

            /**
            * 消费时间
            */
    private LocalDateTime buyTime;

            /**
            * 拿奖金用户id
            */
    private Long bonusUserId;

            /**
            * 积分消费用户id
            */
    private Long userId;

            /**
            * 消费pv
            */
    private Long buyPv;

            /**
            * 奖金比率
            */
    private String bonusRate;

            /**
            * 推荐奖励pv
            */
    private Long bonusPv;


}
