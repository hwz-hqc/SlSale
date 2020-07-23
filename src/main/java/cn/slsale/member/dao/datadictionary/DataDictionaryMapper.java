package cn.slsale.member.dao.datadictionary;

import java.util.List;

import cn.slsale.member.entity.DataDictionary;

public interface DataDictionaryMapper {
	/**
	 * getDataDictionaries
	 * @param dataDictionary
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaries(DataDictionary dataDictionary)throws Exception;
}
