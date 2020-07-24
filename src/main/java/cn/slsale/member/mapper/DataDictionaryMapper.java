package cn.slsale.member.mapper;

import cn.slsale.member.entity.DataDictionary;
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
public interface DataDictionaryMapper extends BaseMapper<DataDictionary> {
    /**
     * getDataDictionaries
     * @param dataDictionary
     * @return
     * @throws Exception
     */
    public List<DataDictionary> getDataDictionaries(DataDictionary dataDictionary)throws Exception;
}
