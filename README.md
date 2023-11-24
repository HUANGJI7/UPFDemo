UPFClient : UPF_CLIENT_DEMO_ear-0.0.1-SNAPSHOT.ear
UPFServer : WLS_UPF_ear-1.0.0.ear

UPFClient API : 
http://[Client Host]:[Client Port]/UPFSpringClientDemo/JerseyClientReadEntity?url=[Decoded URL]
http://[Client Host]:[Client Port]/UPFSpringClientDemo/RestTemplateGetForEntity?url=[Decoded URL]
UPFServer API :
http://[Server Host]:[Server Port]/wls_upf/service/UserProfileService/GetActiveUserProfileByUserId_return204?ldapName=[Whatever]&userId=[Whatever]
http://[Server Host]:[Server Port]/wls_upf/service/UserProfileService/GetActiveUserProfileByUserId_returnObject?ldapName=[Whatever]&userId=[Whatever]

Source Code : 

