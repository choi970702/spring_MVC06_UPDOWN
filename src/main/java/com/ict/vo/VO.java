package com.ict.vo;

import org.springframework.web.multipart.MultipartFile;

public class VO 
{
	// f_name은 DB에 저장할 이름
	private String name, f_name;
	
	// fiel_name은 업로드할때 vo로 받을때 사용할 이름. 
	// 즉, <input type="file" name="file_name">의 file_name과 같아야 한다.
	private MultipartFile file_name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getF_name()
	{
		return f_name;
	}
	public void setF_name(String f_name) 
	{
		this.f_name = f_name;
	}
	public MultipartFile getFile_name()
	{
		return file_name;
	}
	public void setFile_name(MultipartFile file_name) 
	{
		this.file_name = file_name;
	}
	
	
	
}
