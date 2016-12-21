package com.bs.genericjson.module;

import com.bs.genericjson.convertor.JsonPojoParserInt;

/**
 * @author Shailendra Soni
 *
 */
public class User implements JsonPojoParserInt {
    private int userid;
    private String firstname;
    private String lastname;
    private String gender;

    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid
     *            the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname
     *            the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname
     *            the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [userid=");
        builder.append(userid);
        builder.append(", firstname=");
        builder.append(firstname);
        builder.append(", lastname=");
        builder.append(lastname);
        builder.append(", gender=");
        builder.append(gender);
        builder.append("]");
        return builder.toString();
    }

}
