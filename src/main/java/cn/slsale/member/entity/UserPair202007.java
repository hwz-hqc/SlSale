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
    public class UserPair202007 implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "pair_id", type = IdType.AUTO)
    private Long pairId;

            /**
            * 日期
            */
    private LocalDateTime date;

            /**
            * 拿奖金用户id
            */
    private Long bonusUserId;

            /**
            * 左用户总数
            */
    private Long leftUser;

            /**
            * 右用户总数
            */
    private Long rightUser;

            /**
            * 左保留总数
            */
    private Long leftKeep;

            /**
            * 右保留总数
            */
    private Long rightKeep;

            /**
            * 每碰pv数
            */
    private Long eachPv;

            /**
            * 总碰pv
            */
    private Long sumPairPv;

            /**
            * 奖金比率
            */
    private String bonusRate;

            /**
            * 推荐奖励pv
            */
    private Long bonusPv;


}
