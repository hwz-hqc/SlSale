package cn.slsale.member.service.impl;

import cn.slsale.member.entity.User;
import cn.slsale.member.mapper.AuUserMapper;
import cn.slsale.member.service.IAuUserService;
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
public class AuUserServiceImpl extends ServiceImpl<AuUserMapper, User> implements IAuUserService {

}
