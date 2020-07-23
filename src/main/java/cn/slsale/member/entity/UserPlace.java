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
    public class UserPlace implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "place_id", type = IdType.AUTO)
    private Long placeId;

            /**
            * 安置时间
            */
    private LocalDateTime placeTime;

            /**
            * 拿奖金用户ID
            */
    private Long bonusUserId;

            /**
            * 被安置用户id
            */
    private Long userId;

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
