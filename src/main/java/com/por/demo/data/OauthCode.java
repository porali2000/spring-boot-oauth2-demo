package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oauth_Code")
public class OauthCode {
    @Id
    private String code ;
    private Long authentication;
}
