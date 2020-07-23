package cn.slsale.member.entity;

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
    public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 角色编号
            */
        @TableField("roleCode")
    private String roleCode;

            /**
            * 角色名称
            */
        @TableField("roleName")
    private String roleName;

            /**
            * 是否启用（1、启用2、未启用）
            */
        @TableField("isStart")
    private Integer isStart;

            /**
            * 创建时间
            */
        @TableField("createDate")
    private LocalDateTime createDate;

            /**
            * 创建者
            */
        @TableField("createBy")
    private String createBy;


}