package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oauth_Access_Token")
public class OauthAccessToken {

    @Id
    private String authentication_id;
    private String token_id ;
    private Long token;
    private String user_name ;
    private String client_id ;
    private Long authentication;
    private String refresh_token;
}
