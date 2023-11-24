package com.oocl.frm.userprofile.webservice;

import com.oocl.frm.userprofile.webservice.DTO.UserProfile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/UserProfileService")
public class UserProfileService {

	// if turn null , jersey will return 204 status
	@GET
	@Path("/GetActiveUserProfileByUserId_return204")
	@Produces({ MediaType.APPLICATION_JSON })
	public UserProfile getActiveUserProfileByUserId(
			@QueryParam("ldapName") String ldapName,
			@QueryParam("userId") String userId) {
		System.out.println("ldapName : "+ldapName);
		System.out.println("userId : "+userId);
		return null;
	}
	// if not turn null , jersey will return 200 status
	@GET
	@Path("/GetActiveUserProfileByUserId_returnObject")
	@Produces({ MediaType.APPLICATION_JSON })
	public UserProfile getActiveUserProfileByUserId2(
			@QueryParam("ldapName") String ldapName,
			@QueryParam("userId") String userId) {
		System.out.println("ldapName : "+ldapName);
		System.out.println("userId : "+userId);
		UserProfile userProfile=new UserProfile();
		userProfile.setCity("Zhuhai");
		userProfile.setProfileId(666666);
		userProfile.setIsActive(true);
		userProfile.setUserId("250");
		userProfile.setCompany("OOCL");
		userProfile.setCountry("China");
		userProfile.setDepartment("FWK");
		userProfile.setEmail("123456789@qq.com");
		userProfile.setEmailBanner("what is this?");
		userProfile.setFaxNumber("+821 11111111111");
		userProfile.setFirstName("JIANHUA");
		userProfile.setGender("superman");
		userProfile.setGroup("Common Asset");
		userProfile.setGlobalStaffId("911");
		userProfile.setIpPhone("123456789");
		userProfile.setLastName("HUANG");
		userProfile.setMiddleName("");
		userProfile.setJobTitle("996");
		userProfile.setJoinDate("2077-12-10");

		return userProfile;
	}

}
