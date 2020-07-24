package cn.slsale.member.mapper;

import cn.slsale.member.entity.Reply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testpage
 * @since 2020-07-24
 */
public interface ReplyMapper extends BaseMapper<Reply> {
    /**
     * getReplyList
     * @return
     * @throws Exception
     */
    public List<Reply> getReplyList(Reply reply) throws Exception;
    /**
     * count
     * @return
     */
    public int count(Reply reply) throws Exception;
    /**
     * delete
     * @param reply
     * @return
     * @throws Exception
     */
    public int delete(Reply reply) throws Exception;

    /**
     * addReply
     * @param reply
     * @return
     */
    public int addReply(Reply reply) throws Exception;
}
