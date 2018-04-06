package com.jdriven.stateless.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.social.facebook.api.User;

@RestController
public class FacebookController {

    @Autowired
    Facebook facebook;

    @RequestMapping(value = "/api/facebook/details", method = RequestMethod.GET)
    public User getSocialDetails() {
    	String [] fields = { "id", "email",  "first_name", "last_name" };
        return facebook.fetchObject("me", User.class, fields);
    }
}
