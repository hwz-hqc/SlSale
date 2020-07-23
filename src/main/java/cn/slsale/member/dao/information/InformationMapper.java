package cn.slsale.member.dao.information;

import java.util.List;

import cn.slsale.member.entity.Infomation;

public interface InformationMapper {
	/**
	 * getList
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public List<Information> getList(Information information) throws Exception;
	/**
	 * getInformationList
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public List<Information> getInformationList(Information information) throws Exception;
	/**
	 * getInformation
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public Information getInformation(Information information) throws Exception;
	/**
	 * addInformation
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public int addInformation(Information information) throws Exception;
	/**
	 * modifyInformation
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public int modifyInformation(Information information) throws Exception;
	/**
	 * modifyInformationFileInfo
	 * @param information
	 * @return
	 * @throws Exception
	 */
	public int modifyInformationFileInfo(Information information) throws Exception;
	/**
	 * deleteAffiche
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public int deleteInformation(Information information) throws Exception;
	/**
	 * count
	 * @return
	 * @throws Exception
	 */
	public int count(Information information) throws Exception;
}
