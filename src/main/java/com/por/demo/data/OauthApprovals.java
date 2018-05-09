package com.por.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "Oauth_Approvals")
public class OauthApprovals {
    @Id
    private String userId ;
    private String clientId ;
    private String scope ;
    private String status ;
    private Timestamp expiresAt ;
    private Timestamp lastModifiedAt ;
}
