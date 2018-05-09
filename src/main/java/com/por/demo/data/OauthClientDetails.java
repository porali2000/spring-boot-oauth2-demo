package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oauth_Client_Details")
public class OauthClientDetails {
    @Id
    private String client_id ;
    private String resource_ids ;
    private String client_secret ;
    private String scope ;
    private String authorized_grant_types ;
    private String web_server_redirect_uri ;
    private String authorities ;
    private Integer access_token_validity;
    private Integer refresh_token_validity;
    private String additional_information;
    private String autoapprove ;
}
