package cn.slsale.member.entity;

import com.fasterxml.jackson.databind.deser.Deserializers;

public class UploadTemp  extends Deserializers.Base {

	private String uploader;
	private String uploadType;
	private String uploadFilePath;
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getUploadType() {
		return uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	public String getUploadFilePath() {
		return uploadFilePath;
	}
	public void setUploadFilePath(String uploadFilePath) {
		this.uploadFilePath = uploadFilePath;
	}
	
}
