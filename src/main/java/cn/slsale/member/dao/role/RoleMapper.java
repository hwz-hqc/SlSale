package cn.slsale.member.dao.role;

import java.util.List;


import cn.slsale.member.entity.Role;

public interface RoleMapper {
	/**
	 * getRoleList
	 * @param role
	 * @return
	 */
	public List<Role> getRoleList() throws Exception;
		
	/**
	 * getRole
	 * @param role
	 * @return
	 */
	public Role getRole(Role role) throws Exception;
	/**
	 * getRoleR
	 * @param role
	 * @return
	 * @throws Exception
	 */
	public Role getRoleR(Role role) throws Exception;
	
	/**
	 * addRole
	 * @param role
	 * @return
	 */
	public int addRole(Role role) throws Exception;
	
	/**
	 * modifyRole
	 * @param role
	 * @return
	 */
	public int modifyRole(Role role) throws Exception;
	
	/**
	 * deleteRole
	 * @param role
	 * @return
	 */
	public int deleteRole(Role role) throws Exception;
	
	/**
	 * getRoleIdAndNameList
	 * @return
	 */
	public List<Role> getRoleIdAndNameList() throws Exception;
}
