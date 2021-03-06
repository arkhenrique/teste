package com.henrique.recyclerview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class gitmodel {

//I created this using http://www.jsonschema2pojo.org/
//Note that not every model can be created using jsonschema2pojo



    @SerializedName("id")

    private Integer id;
    @SerializedName("first_name")

    private String firstName;
    @SerializedName("last_name")

    private String lastName;
    @SerializedName("avatar")

    private String avatar;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @param avatar
     * The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}