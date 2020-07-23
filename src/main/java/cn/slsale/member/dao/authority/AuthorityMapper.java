package cn.slsale.member.dao.authority;

import cn.slsale.member.entity.Authority;

public interface AuthorityMapper {
	/**
	 * addAuthority
	 * @param authority
	 * @return
	 */
	public int addAuthority(Authority authority) throws Exception;
	/**
	 * modifyAuthority
	 * @param authority
	 * @return
	 */
	public int modifyAuthority(Authority authority) throws Exception;
	/**
	 * modifyAuthority
	 * @param authority
	 * @return
	 */
	public int deleteAuthority(Authority authority) throws Exception;

	/**
	 * getAuthority
	 * @param authority
	 * @return
	 * @throws Exception
	 */
	public Authority getAuthority(Authority authority)throws Exception;
}
