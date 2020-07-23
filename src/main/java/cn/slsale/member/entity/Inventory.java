package cn.slsale.member.entity;

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
    public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 商品货套餐id
            */
    private Long goodsId;

            /**
            * 商品或套餐数量
            */
    private Long num;

            /**
            * 库存状态
            */
    private Integer state;


}
