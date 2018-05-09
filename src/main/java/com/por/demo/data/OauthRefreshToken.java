package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oauth_Refresh_Token")
public class OauthRefreshToken {
    @Id
    private String token_id ;
    private Long token ;
    private Long authentication ;
}
