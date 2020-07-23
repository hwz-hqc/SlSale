package cn.slsale.member.dao.function;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.slsale.member.entity.Authority;
import cn.slsale.member.entity.Function;

public interface FunctionMapper {
	/**
	 * getMainFunctionList
	 * @param authority
	 * @return
	 * @throws Exception
	 */
	public List<Function> getMainFunctionList(Authority authority) throws Exception;

	/**
	 * getSubFunctionList
	 * @param function
	 * @return
	 * @throws Exception
	 */
	public List<Function> getSubFunctionList(Function function) throws Exception;
	
	/**
	 * getSubFuncList
	 * @param function
	 * @return
	 * @throws Exception
	 */
	public List<Function> getSubFuncList(Function function)throws Exception;
	
	/**
	 * getFuntionListByIn
	 * @param sqlInString
	 * @return
	 * @throws Exception
	 */
	public List<Function> getFuntionListByIn(@Param(value = "sqlInString") String sqlInString)throws Exception;
	
	/**
	 * getFunctionListByRoleId
	 * @param authority
	 * @return
	 * @throws Exception
	 */
	public List<Function> getFunctionListByRoleId(Authority authority)throws Exception;
}
