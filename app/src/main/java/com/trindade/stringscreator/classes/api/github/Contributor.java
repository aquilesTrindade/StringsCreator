package com.trindade.stringscreator.classes.api.github;

import com.google.gson.annotations.SerializedName;

public class Contributor {
    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatarUrl;

    // Getters
    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}