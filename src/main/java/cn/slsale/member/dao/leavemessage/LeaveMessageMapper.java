package cn.slsale.member.dao.leavemessage;

import java.util.List;


import cn.slsale.member.entity.LeaveMessage;


public interface LeaveMessageMapper {
	
	/**
	 * getLeaveMessageList
	 * @return
	 */
	public List<LeaveMessage> getLeaveMessageList(LeaveMessage leaveMessage) throws Exception;
	
	/**
	 * getLeaveMessage
	 * @param leaveMessage
	 * @return
	 * @throws Exception
	 */
	public LeaveMessage getLeaveMessage(LeaveMessage leaveMessage) throws Exception;
	
	/**
	 * count
	 * @param leaveMessage
	 * @return
	 * @throws Exception
	 */
	public int count(LeaveMessage leaveMessage) throws Exception;
	
	/**
	 * addLeaveMessage
	 * @param leaveMessage
	 * @return
	 */
	public int addLeaveMessage(LeaveMessage leaveMessage) throws Exception;
	
	/**
	 * modifyLeaveMessage
	 * @param leaveMessage
	 * @return
	 */
	public int modifyLeaveMessage(LeaveMessage leaveMessage);
	
	/**
	 * deleteLeaveMessage
	 * @param deleteLeaveMessage
	 * @return
	 */
	public int deleteLeaveMessage(LeaveMessage deleteLeaveMessage);
	

}
