package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Details")
public class ClientDetail {
    @Id
    private String appId;
    private String resourceIds;
    private String appSecret;
    private String scope;
    private String grantTypes;
    private String redirectUrl;
    private String authorities;
    private String access_token_validity;
    private Integer refresh_token_validity;
    private String additionalInformation;
    private String autoApproveScopes;
}
