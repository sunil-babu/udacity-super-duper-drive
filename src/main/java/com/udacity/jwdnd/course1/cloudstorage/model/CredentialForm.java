package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CredentialForm {
    private String url;
    private String userName;
    private String password;
    private String credentialId;

}
