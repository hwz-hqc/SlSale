package cn.slsale.member.service.impl;

import cn.slsale.member.entity.Inventory;
import cn.slsale.member.mapper.InventoryMapper;
import cn.slsale.member.service.IInventoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testpage
 * @since 2020-07-23
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements IInventoryService {

}
