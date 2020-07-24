package cn.slsale.member.entity;

import java.time.LocalDate;
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
 * @since 2020-07-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LeaveMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 取自au_user表中的loginCode
     */
    @TableField("createdBy")
    private String createdBy;

    @TableField("messageCode")
    private String messageCode;

    @TableField("messageTitle")
    private String messageTitle;

    @TableField("messageContent")
    private String messageContent;

    private Integer state;

    @TableField("ctrateTime")
    private LocalDate ctrateTime;


}
